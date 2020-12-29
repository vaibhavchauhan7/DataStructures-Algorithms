package com.dsa.Array;

import java.util.PriorityQueue;

public class Sort0s1s2s {

    public void sort0s1s2s() {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        // 0 2 1 2 0
        pQueue.add(0);
        pQueue.add(2);
        pQueue.add(1);
        pQueue.add(2);
        pQueue.add(0);

        for (int i = 0; i < 5; i++) {
            System.out.println("Sorted 0s 1s 2s: " + pQueue.poll());
        }
    }
}
