package com.dsa.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseArray {

    public void reverseArray() {
        List<Integer> numbers = new ArrayList<>();
        Stack<Integer> numberStack = new Stack<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Numbers: " + numbers);

        if (numbers.size() > 0) {
            for (Integer number : numbers) {
                numberStack.push(number);
            }
            numbers.clear();
        }

        while (!numberStack.isEmpty()) {
            numbers.add(numberStack.pop());
        }

        System.out.println("Reverse Numbers: " + numbers);
    }
}
