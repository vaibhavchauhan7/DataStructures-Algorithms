package com.dsa.Array;

import java.util.Arrays;

public class Sort0s1s2s {

    public void sort0s1s2s() {
        int[] numbers = {2, 0, 1, 2, 1, 2, 0, 0, 2, 1, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 2, 0, 1};
        int begin = 0, track = 0, lengthOfArray = numbers.length - 1, pivot = 1;

        while(track <= lengthOfArray) {
            if (numbers[track] < pivot) {
                swapNumbers(numbers, begin, track);
                ++begin;
                ++track;
            } else if (numbers[track] > pivot) {
                swapNumbers(numbers, track, lengthOfArray);
                --lengthOfArray;
            } else {
                ++track;
            }
        }

        System.out.println("Sorted 0 1 2: " + Arrays.toString(numbers));
    }

    private void swapNumbers(int[] nums, int num1, int num2) {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}
