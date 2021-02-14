package com.dsa.Array;

import java.util.Arrays;

public class ReverseArray {

    public void reverseArray() {
        int[] numbers = {1, 2, 3, 4};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length/2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }

        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }
}
