package org.coaching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CalculatorTest {
    @Test
    void emptyCommandListReturnsEmptyArray() {
        var sut = new Calculator("");

        assertThat(sut.execute()).isEmpty();
    }
}