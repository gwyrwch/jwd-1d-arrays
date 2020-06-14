package by.epamtc.jwd.main;

import java.util.Arrays;

import static by.epamtc.jwd.util.Util.getRandomIntArray;
import static java.util.Arrays.sort;

public class Task4 {
    private static int getMajorityElement1(int[] nums) {
        sort(nums);

        int cnt = 1;
        int ansCnt = 0;
        int ans = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                cnt++;
            } else {
                if (cnt > ansCnt) {
                    ans = nums[i - 1];

                    ansCnt = cnt;
                    cnt = 1;
                }
            }
        }

        return ans;
    }

    private static int getMajorityElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        int[] cnt = new int[max - min + 1];
        for (int num : nums) {
            cnt[num - min]++;
        }

        int ansCnt = 0;
        int ans = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > ansCnt) {
                ans = i;
                ansCnt = cnt[i];
            }
        }

        return ans + min;
    }

    public static void main(String[] args) {
        int size = 10;
        int[] nums = getRandomIntArray(size);

        System.out.printf("Majority element(without sort) in %s is %d\n", Arrays.toString(nums), getMajorityElement(nums));
        System.out.printf("Majority element(with sort) in %s is %d\n", Arrays.toString(nums), getMajorityElement1(nums));

    }
}
