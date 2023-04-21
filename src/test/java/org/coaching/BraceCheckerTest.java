package org.coaching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BraceCheckerTest {

    @Test
    void valid() {
        assertThat(BraceChecker.isValid("(){}[]")).isTrue();
        assertThat(BraceChecker.isValid("([{}])")).isTrue();
        assertThat(BraceChecker.isValid("")).isTrue();
    }
    @Test
    void invalid() {
        assertThat(BraceChecker.isValid("(}")).isFalse();
        assertThat(BraceChecker.isValid("[(])")).isFalse();
        assertThat(BraceChecker.isValid("[({})](]")).isFalse();
    }

}