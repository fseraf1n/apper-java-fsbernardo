import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        ArrayList<Long> runtimes = new ArrayList<>();
        int val = 561;

        for (int i = 0 ; i < 100 ; i++) {
            long startTime = System.nanoTime();

            isPrimeV1(val); // remove print to get actual processing time

            long endTime = System.nanoTime();

            runtimes.add(endTime - startTime);
        }
        OptionalDouble averageRuntime = runtimes.stream()
                                                .mapToDouble(a -> a)
                                                .average();
        if (isPrimeV1(val)) {
            System.out.println(val + " is prime"); // print function result
        } else {
            System.out.println(val + " is composite");
        }
        System.out.println("Average runtime (isPrimeV1) : " + averageRuntime.getAsDouble());

        // clear array values
        runtimes.clear();
        //System.out.println(runtimes);
        // testing for isPrimeV2

        for (int i = 0 ; i < 100 ; i++) {
            long startTime = System.nanoTime();

            isPrimeV2(val); // remove print to get actual processing time

            long endTime = System.nanoTime();

            runtimes.add(endTime - startTime);
        }
        OptionalDouble averageRuntimeV2 = runtimes.stream()
                .mapToDouble(a -> a)
                .average();
        if (isPrimeV2(val)) {
            System.out.println(val + " is prime"); // print function result
        } else {
            System.out.println(val + " is composite");
        }
        System.out.println("Average runtime (isPrimeV2) : " + averageRuntimeV2.getAsDouble());


    }

    public static Boolean isPrimeV1(int val) {
        if ( val == 2 || val == 3) {
            return true;
        }

        if ( val % 2 == 0 || val <= 1) {
            return false;
        }

        int valRoot = (int) Math.sqrt(val);

        for (int i = 3 ; i <= valRoot ; i += 2) {
            if ( val % i == 0 ) {
                return false;
            }
        }
        return true;
    }

    public static Boolean isPrimeV2(int val) {
        if ( val == 2 || val == 3) {
            return true;
        }

        if ( val % 2 == 0 || val % 3 == 0 || val % 5 == 0|| val <= 1) {
            return false;
        }

        int valRoot = (int) Math.sqrt(val);

        for (int i = 7 ; i <= valRoot ; i += 2) {
            if ( val % i == 0 ) {
                return false;
            }
        }

        return true;
    }
}