package org.coaching;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DeadfishTest {
    @ParameterizedTest
    @MethodSource("provideAcceptanceTestValues")
    void returnsMultipleValues() {
        int[] actual = Deadfish.parse("iiisdoso");

        assertThat(actual).isEqualTo(new int[] {8, 64});
    }

    @Test
    void returnsLong() {
        int[] actual = Deadfish.parse("iiisdoso");

        assertThat(actual).isEqualTo(new int[] {8, 64});
    }
}