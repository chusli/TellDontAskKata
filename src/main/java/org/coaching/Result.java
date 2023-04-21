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

    public void increment() {
        currentValue++;
    }

    public void decrement() {
        currentValue--;
    }

    public void square() {
        currentValue *= currentValue;
    }

    public void output() {
        values.add(currentValue);
    }
}
