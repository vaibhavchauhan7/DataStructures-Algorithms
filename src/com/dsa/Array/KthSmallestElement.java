package com.dsa.Array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElement {

    public void kthSmallestElement() {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Comparator.naturalOrder());
        int k = 4;

        // 7 10 4 3 20 15
        pQueue.add(7);
        pQueue.add(10);
        pQueue.add(4);
        pQueue.add(3);
        pQueue.add(20);
        pQueue.add(15);

        for (int i = 0; i < k - 1; i++) {
            pQueue.poll();
        }
        System.out.println("4th Smallest Number: " + pQueue.peek());
    }
}
