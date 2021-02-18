package com.dsa.Array;

public class MinimumJumps {

    int[] numbers = {1, 3, 5, -1, -1, 2, 6, 7, 6, 8, 9, 6, 8, 2, 5, 1, 3, 4};
    int count = 0, index = 0, track = numbers[0];

    public void minimumJumps() {
        while (index < numbers.length - 1) {
            if (numbers[index] != 0) {
                track = numbers[index];
                index += track;
                ++count;
            } else {
                break;
            }
        }
        System.out.println("Total Jumps: " + count);
    }
}
