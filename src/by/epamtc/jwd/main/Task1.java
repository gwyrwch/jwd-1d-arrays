package by.epamtc.jwd.main;

import com.sun.media.sound.InvalidDataException;

import static by.epamtc.jwd.util.Util.arrayToString;
import static by.epamtc.jwd.util.Util.getRandomIntArray;

public class Task1 {
    private static int findSpecialMax(int[] nums) {
        if (nums.length % 2 != 0) {
            try {
                throw new InvalidDataException("Invalid array size");
            } catch (InvalidDataException e) {
                e.printStackTrace();
            }
        }

        int ans = Integer.MIN_VALUE;
        int size = nums.length;

        for (int l = 0, r = size - 1; l < size / 2; l++, r--) {
            ans = Math.max(ans, nums[l] + nums[r]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int size = 10;
        int bound = 5;
        int[] nums = getRandomIntArray(size, bound);

        System.out.printf("Majority element(without sort) in %s is %d\n", arrayToString(nums), findSpecialMax(nums));
    }
}
