package com.dsa.Array;

import java.util.Arrays;

public class NegativeLeftPositiveRight {

    public void negativeLeftPositiveRight() {
        int[] numbers = {1, -4, 5, 7, 2, -3, 8, 9, 9, 0, -6, -9, 2, -8};
        int track = numbers[0] > 0 ? -1 : 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0 && i != track) {
                track++;
                int temp = numbers[i];
                numbers[i] = numbers[track];
                numbers[track] = temp;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
