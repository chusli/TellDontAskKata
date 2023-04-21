package org.coaching;

import java.util.List;


public class Calculator {

    private final Result result;
    private final List<Character> commands;

    public Calculator(String commands) {
        this.result = Result.empty();
        this.commands = commands.chars().mapToObj(value -> (char) value).toList();
    }

    public int[] execute() {
        for (Character command : commands) {
            handle(command);
        }
        return result.getValues();
    }

    private void handle(Character command) {
        switch (command) {
            case 'i' -> result.increment();
            case 'd' -> result.decrement();
            case 's' -> result.square();
            case 'o' -> result.output();
        }
    }
}
