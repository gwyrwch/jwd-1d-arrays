package by.epamtc.jwd.util;

import java.util.Random;

public class Util {
    private static int getRandomInt(int n) {
        Random rand = new Random();
        return rand.nextInt() % n;
    }

    public static int getRandomPositiveInt(int bound) {
        Random rand = new Random();
        return rand.nextInt(bound);
    }

    public static int[] getRandomIntArray(int size, int bound) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = getRandomInt(bound);
        }

        return arr;
    }

    public static String arrayToString(int[] arr) {
        StringBuilder ans = new StringBuilder("[");

        for (int i = 0; i < arr.length - 1; i++) {
            ans.append(arr[i]).append(", ");
        }

        ans.append(arr[arr.length - 1]).append("]");

        return ans.toString();
    }

}
