package org.coaching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ResultTest {
    @Test
    void getEmpty() {
        var sut = Result.empty();

        assertThat(sut.getValues()).isEmpty();
    }

    @Test
    void incrementTest() {
        var sut = Result.empty();
        sut.increment();
        sut.increment();

        assertThat(sut.currentValue).isEqualTo(2);
    }

    @Test
    void decrementTest() {
        var sut = Result.empty();
        sut.decrement();
        sut.decrement();

        assertThat(sut.currentValue).isEqualTo(-2);
    }
    @Test
    void SquareTest() {
        var sut = Result.empty();
        sut.increment();
        sut.increment();
        sut.increment();
        sut.square();

        assertThat(sut.currentValue).isEqualTo(9);
    }
    @Test
    void printTest() {
        var sut = Result.empty();
        sut.increment();
        sut.output();

        assertThat(sut.getValues()).containsExactly(1);
    }
}