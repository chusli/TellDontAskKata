package org.coaching;

import java.util.ArrayList;
import java.util.List;

public class Result {

    public int[] getValues() {
        return values.stream().mapToInt(i -> i).toArray();
    }

    private final List<Integer> values;
    int currentValue = 0;

    private Result() {
        values = new ArrayList<>();
    }

    public static Result empty() {
        return new Result();
    }

     void increment() {
        currentValue++;
    }

     void decrement() {
        currentValue--;
    }

     void square() {
        currentValue *= currentValue;
    }

    void output() {
        values.add(currentValue);
    }

    public void handle(Character command) {
        switch (command) {
            case 'i' -> increment();
            case 'd' -> decrement();
            case 's' -> square();
            case 'o' -> output();
        }
    }
}
