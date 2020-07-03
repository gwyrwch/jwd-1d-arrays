package by.epamtc.jwd.main;

import static by.epamtc.jwd.util.Util.arrayToString;
import static by.epamtc.jwd.util.Util.getRandomIntArray;

public class Task5 {
    private static int findEvenMax(final int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i+= 2) {
            max = Math.max(nums[i], max);
        }

        return max;
    }

    private static int findOddMin(final int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i+= 2) {
            min = Math.min(nums[i], min);
        }

        return min;
    }

    private static long solve(int[] nums) {
        return findEvenMax(nums) + findOddMin(nums);
    }

    public static void main(String[] args) {
        int size = 10;
        int bound = 5;
        int[] nums = getRandomIntArray(size,bound);

        System.out.printf("array: %s\neven max + odd min = %d\n", arrayToString(nums), solve(nums));
    }
}
