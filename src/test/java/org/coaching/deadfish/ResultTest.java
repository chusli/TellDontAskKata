package org.coaching.deadfish;

import org.coaching.deadfish.Result;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ResultTest {

    private static Stream<Arguments> provideCommandWithExpected() {
        return Stream.of(Arguments.arguments('i', 1),
                Arguments.arguments('d', -1),
                Arguments.arguments('s', 0),
                Arguments.arguments('o', 0),
                Arguments.arguments('X', 0));
    }

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

    @ParameterizedTest
    @MethodSource("provideCommandWithExpected")
    void handleTest(char command, int expected) {
        var sut = Result.empty();

        sut.handle(command);

        assertThat(sut.currentValue).isEqualTo(expected);
    }
}