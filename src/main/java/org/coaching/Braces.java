package org.coaching;

import java.util.List;

public class Braces {
    private final List<Brace> braceList;

    public Braces(List<Brace> braceList) {

        this.braceList = braceList;
    }

    public static Braces valueof(List<Brace> braceList) {
        return new Braces(braceList);
    }

    public boolean isValid() {
        for (Brace brace : braceList) {
            brace.findNextClosing(braceList.subList(braceList.indexOf(brace), braceList.size()));
        }
        return braceList.stream().allMatch(Brace::isClosed);
    }
}
