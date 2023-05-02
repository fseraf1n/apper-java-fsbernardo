public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }

    public static Boolean isPrime(int val) {
        

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
}
