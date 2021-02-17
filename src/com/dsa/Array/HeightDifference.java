package com.dsa.Array;

public class HeightDifference {

    int[] numbers = {1, 5, 8, 10};
    int k = 2, min = 0, max = 0;

    public void heightDifference() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] - k > 0 ? numbers[i] - k : numbers[i] + k;
            min = max = numbers[0];
            if (min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Height Difference: " + (max - min));
    }
}
