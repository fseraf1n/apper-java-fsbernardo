public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Animal animal = Animal.DOG;
        switch (animal) {
            case Animal.CAT:
                System.out.println("rawr");
            default:
                System.out.println("Default");
        }
    }

    public enum Animal {
        DOG, CAT;
    }
}