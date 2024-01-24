package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(5, "5"),
                Arguments.of(22, "22")
        );
    }

    @ParameterizedTest
    @MethodSource
    void test(Integer expected, String input) {
        assertEquals(expected, Integer.valueOf(input));
    }
}