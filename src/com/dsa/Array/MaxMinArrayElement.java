package com.dsa.Array;

public class MaxMinArrayElement {

    public void maxMinArrayElement() {
        int[] numbers = {30, 12, 78, 90, 23, 21, 56, 43, 1, 91, 85, 11, 25, 7, 2, 57, 99, 105, 345, 28, 3, 91};
        int maxNumber = numbers[0], minNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
            if (minNumber > numbers[i]) {
                minNumber = numbers[i];
            }
        }
        System.out.format("Maximum: %d, Minimum: %d", maxNumber, minNumber);
    }
}
