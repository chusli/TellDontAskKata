package org.coaching;

import org.coaching.deadfish.Deadfish;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] result = Deadfish.parse("iiisdoso");
        System.out.println(Arrays.toString(result));
    }
}