package com.dsa.Array;

import java.util.Arrays;

public class NegativeLeftPositiveRight {

    public void negativeLeftPositiveRight() {
        // Can be solved by PriorityQueue but I still did this :)
        int[] numbers = {1, -4, 5, 7, 2, -3, 8, 9, 9, 0, -6, -9, 2};

        int j = numbers[0] > 0 ? -1 : 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0 && i != j) {
                j++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
