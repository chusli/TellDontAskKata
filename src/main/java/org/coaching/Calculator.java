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
            result.handle(command);
        }
        return result.getValues();
    }
}
