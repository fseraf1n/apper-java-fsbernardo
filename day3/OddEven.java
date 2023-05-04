public class OddEven {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 234, 2, 4, 56, 17, 50, 1235, 6, 1, 23, 48, 47, 34};
        oddEvenCounter(nums);
    }
    public static void oddEvenCounter(int[] numbers) {
        int oddCounter = 0;
        int evenCounter = 0;
        for(int i : numbers) {
            if (i % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        System.out.println("Odd: " + oddCounter + "\nEven: " + evenCounter);
    }
}
