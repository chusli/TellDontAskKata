package org.coaching;

public class Deadfish {
    public static int[] parse(String commands) {
        Calculator calculator = new Calculator(commands);
        return calculator.execute();
    }
}
