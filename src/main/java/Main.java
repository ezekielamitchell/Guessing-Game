import java.util.Random;

/**
 * @author Ezekiel A. Mitchell
 * @date 20220520
 *
 * This program runs a simple guessing game of the user's choosing
 */
public class Main {
    public static int[] twoSum(int[] nums, int target) {

        // declare new array
        int[] list = new int[2];


        // generate random index from nums
        Random random = new Random();

        // add two different nums indexes until target reached
        int sum = 0;
        while (sum != target) {
            int a = random.nextInt(nums.length);
            int b = random.nextInt(nums.length);
            if (a != b && a < target && b < target) {
                sum += (nums[a] + nums[b]);
                list[0] = a;
                list[1] = b;
            }
        }

        System.out.println(sum);

        return list;
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        twoSum(a, 9);
    }
}
