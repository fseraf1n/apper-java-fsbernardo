import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // arraylist to store registered users 
        ArrayList<NewUser> userArray = new ArrayList<>();

        // hashmap to store number name pairs
        HashMap<String, String> userMap = new HashMap<>();

        // can abstract the instantiation of default users
        createDefaultUsers(userMap, userArray);
        
        // proceed only with share a load if user successfully registers
        if(registerUser(userMap, userArray)) {
            shareLoad(userMap, userArray);
        }
       
        // print current balances
        printCurrentBalances(userArray);

    }

    static void createDefaultUsers(HashMap<String, String> map, ArrayList<NewUser> array) {
        // add default users to main arraylist and hashmap
        array.add(new NewUser("Bob", "09175861661"));
        map.put("09175861661", "Bob");

        array.add(new NewUser("Marley", "09175861662"));
        map.put("09175861662", "Marley");

        array.add(new NewUser("Seth", "09175861663"));
        map.put("09175861663", "Seth");

        array.add(new NewUser("Ryan", "09175861664"));
        map.put("09175861664", "Ryan");

        array.add(new NewUser("Fritz", "09175861665"));
        map.put("09175861665", "Fritz");
    }

    static Boolean registerUser(HashMap<String, String> myMap, ArrayList<NewUser> myArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Register an account ***");
        System.out.println("Number: ");
        String inputNumber = scanner.nextLine();
        if (mapContainsNumber(myMap, myArray, inputNumber)) {
            System.out.println("Number " + inputNumber + " is already registered.");
        } else if (isNumberInvalid(myMap, myArray, inputNumber)) {
            System.out.println("The number you entered is invalid.");
        } else {
            System.out.println("Name: ");
            String inputName = scanner.nextLine();
            if (inputName == null|| inputName.isEmpty() || inputName.isBlank()) {
                System.out.println("Name cannot be empty.");
            } else {
                System.out.println("Account successfully registered.");
                myArray.add(new NewUser(inputName, inputNumber));
                myMap.put(inputNumber, inputName);
                return true;
            }
        }
        return false;
    }

    static void shareLoad(HashMap<String, String> myMap, ArrayList<NewUser> myArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Share a Load ***");
        System.out.println("Sender mobile number: ");
        String senderNumber = scanner.nextLine();
        if (mapContainsNumber(myMap, myArray, senderNumber)) {
            System.out.println("Recipient mobile number: ");
            String recipientNumber = scanner.nextLine();
            if (mapContainsNumber(myMap, myArray, recipientNumber)) {
                if (recipientNumber.equals(senderNumber)) {
                    System.out.println("Sender and recipient number should not be the same.");
                } else {
                    System.out.println("Enter amount (enter a valid number): ");
                    Double value = Double.valueOf(scanner.nextLine());
                    updateUserBalance(myMap, myArray, senderNumber, recipientNumber, value);
                }
            } else {
                System.out.println("Recipient " + recipientNumber + " is not found!");
            }
        } else {
            System.out.println("Sender " + senderNumber + " is not found!");

        }

    }

    static Boolean isNumberInvalid(HashMap<String, String> myMap, ArrayList<NewUser> myArray, String number) {
        if (number.length() == 11 && number.matches("[0-9]+")) {
            return false;
        } else {
            return true;
        }
    }

    static Boolean mapContainsNumber(HashMap<String, String> myMap, ArrayList<NewUser> myArray, String number) {
        if (isNumberInvalid(myMap, myArray, number)) {
            return false;
        }
        if (myMap.containsKey(number)) {
            return true;
        } else {
            return false;
        }
    }

    static void updateUserBalance(HashMap<String, String> myMap, ArrayList<NewUser> myArray, String senderNumber, String recipientNumber, Double value) {
        for (NewUser sender:myArray) {
            if (sender.getNumber().equals(senderNumber)) {
                // method to reduce balance
                if (sender.getBalance() < value) {
                    System.out.println("Insufficient load for this transfer.");
                    return;
                }
                sender.changeBalance(-value);
                for (NewUser recipient:myArray) {
                    if (recipient.getNumber().equals(recipientNumber)) {
                        // method to increase balance
                        recipient.changeBalance(value);
                        System.out.println("Amount of " + value + " was successfully loaded to " + recipientNumber + recipient.printName() + "from " + senderNumber + sender.printName());
                    }
                }
            } 
        }
    }

    static void printCurrentBalances(ArrayList<NewUser> myArray) {
        for (NewUser user:myArray) {
            System.out.println(user);
        }
    }
}
