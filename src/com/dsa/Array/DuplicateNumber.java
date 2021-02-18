package com.dsa.Array;

import java.util.Arrays;

public class DuplicateNumber {

    int[] numbers = {1, 3, 2, 5, 7, 6, 4, 7};

    public void duplicateNumber() {
        Arrays.sort(numbers); // Sort By Algorithm Later
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i+1]) {
                System.out.println("Duplicate Number: " + numbers[i]);
                break;
            }
        }
    }
}
