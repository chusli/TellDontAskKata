package org.coaching;

import java.util.ArrayList;
import java.util.List;

public class BraceChecker {

    public static boolean isValid(String braces) {

        List<Brace> braceList = new ArrayList<>();

        List<Character> characters = braces.chars().mapToObj(value -> (char) value).toList();
        for (Character character : characters) {
            braceList.add(Brace.valueOf(character));
        }

        Braces validatableBraces = Braces.valueof(braceList);


        return validatableBraces.isValid();
    }


}
