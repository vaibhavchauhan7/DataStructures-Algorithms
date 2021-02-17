package com.dsa.Array;

import java.util.Arrays;

public class CyclicRotateArray {

    int[] numbers = {1, 2, 3, 4, 5, 6};
    int length = numbers.length - 1;
    int temp = numbers[length];

    public void cyclicRotateArray() {
        System.out.println("Original Array: " + Arrays.toString(numbers));

        while(length > 0) {
            numbers[length] = numbers[length - 1];
            --length;
        }
        numbers[0] = temp;

        System.out.println("Rotated Array: " + Arrays.toString(numbers));
    }
}
