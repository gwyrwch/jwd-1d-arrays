package by.epamtc.jwd.util;

import java.util.Random;

public class Util {
    public static int getRandomInt(int n){
        Random rand = new Random();
        return rand.nextInt() % n;
    }

    public static int getRandomPositiveInt(int n){
        Random rand = new Random();
        return rand.nextInt(n);
    }

    public static int[] getRandomIntArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = getRandomInt(5);
        }

        return arr;
    }

}
