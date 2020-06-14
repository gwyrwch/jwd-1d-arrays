package by.epamtc.jwd.util;

import java.util.Random;

public class Util {
    private static int getRandomInt(){
        Random rand = new Random();
        return rand.nextInt() % 5;
    }

    public static int[] getRandomIntArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = getRandomInt();
        }

        return arr;
    }

}
