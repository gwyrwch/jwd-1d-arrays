package by.epamtc.jwd.main;

import static by.epamtc.jwd.util.Util.arrayToString;
import static by.epamtc.jwd.util.Util.getRandomIntArray;

public class Task2 {
    private static int[] removeMinElementsFromSequence(int[] nums) {
        int min = Integer.MAX_VALUE;
        int minCount = 0;

        for (int num : nums) {
            if (num < min) {
                min = num;
                minCount = 1;
            } else if (num == min) {
                minCount++;
            }
        }

        int[] result = new int[nums.length - minCount];
        for (int i = 0, j = 0; i < nums.length && j < result.length; i++) {
            if (nums[i] != min) {
                result[j] = nums[i];
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int size = 10;
        int bound = 5;
        int[] nums = getRandomIntArray(size, bound);

        int[] result = removeMinElementsFromSequence(nums);

        System.out.println("Initial array: " + arrayToString(nums));
        System.out.println("Result array: " + arrayToString(result));
    }
}
