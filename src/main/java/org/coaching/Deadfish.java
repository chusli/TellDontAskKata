package org.coaching;

public class Deadfish {
    public static int[] parse(String commands) {
        return new Calculator(commands).execute();
    }
}
