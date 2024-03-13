public class Main {
    public static void main(String[] args) {
        int[] nums = {100, 52, 43, 99, 42, 40, 91};
        int sum = 0;
        for (int num : nums) {
            if (num % 5 == 0 && num % 2 == 0) {
                sum = sum + num;
            }
        }
        System.out.println("The sum of the numbers divisible by both 5 and 2 is: " + sum);
    }
}
