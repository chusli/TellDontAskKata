package org.coaching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeadfishTest {

    @Test
    void returnsMultipleValues() {
        int[] actual = Deadfish.parse("iiisdoso");

        assertThat(actual).isEqualTo(new int[] {8, 64});
    }

    @Test
    void returnsLong() {
        int[] actual = Deadfish.parse("iiisdosodddddiso");

        assertThat(actual).isEqualTo(new int[] {8, 64, 3600});
    }
}