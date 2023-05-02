public class PrimeNumberV2 {
    public static void main(String[] args) {
        int val = 561; // val range : 1 to 10_000_000
        System.out.println(isPrimeV2(val));
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