package org.coaching;

import java.util.List;

public class Brace {
    private final Character character;
    private boolean isClosed = false;

    public Brace(Character character) {

        this.character = character;
    }

    public static Brace valueOf(Character character) {
        return new Brace(character);
    }

    public void findNextClosing(List<Brace> subList) {
        if (subList.stream().anyMatch(this::isClosingPartner)) {
            this.isClosed = true;
        }
    }

    private boolean isClosingPartner(Brace brace) {
        return character == '(' && brace.character == ')' ||
                character == '[' && brace.character == ']' ||
                character == '{' && brace.character == '}';
    }

    public boolean isClosed() {
        return isClosed;
    }
}
