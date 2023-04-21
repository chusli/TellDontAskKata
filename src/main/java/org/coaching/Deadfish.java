package org.coaching;

public class Deadfish {
    public static int[] parse(String commands) {
        Result result = Result.empty();
        for (Character command : commands.chars().mapToObj(value -> (char) value).toList()) {
            result.handle(command);
        }
        return result.getValues();
    }
}
