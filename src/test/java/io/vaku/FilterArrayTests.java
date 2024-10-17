package io.vaku;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class FilterArrayTests {
    private ArrayUtils arrayUtils;

    @BeforeEach
    public void init() {
        arrayUtils = new ArrayUtils();
    }

    @ParameterizedTest(name = "Array {0} should return {1} after filtering")
    @MethodSource("testData")
    public void positiveCasesTest(int[] actual, int[] expected) {
        assertArrayEquals(expected, arrayUtils.filterArray(actual));
    }

    @Test
    @DisplayName("Should throw RuntimeException if no 1 digits in array")
    public void no1DigitsTest() {
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> arrayUtils.filterArray(new int[]{2, 2, 2, 2, 2})
        );

        assertEquals("No digits 1 in array", exception.getMessage());
    }

    @Test
    @DisplayName("Should throw RuntimeException if array is empty")
    public void emptyArrayTest() {
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> arrayUtils.filterArray(new int[]{})
        );

        assertEquals("No digits 1 in array", exception.getMessage());
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.arguments(new int[]{2, 2, 1, 2, 2}, new int[]{2, 2}),
                Arguments.arguments(new int[]{2, 2, 2, 2, 1}, new int[]{}),
                Arguments.arguments(new int[]{1, 2, 2, 2, 2}, new int[]{2, 2, 2, 2}),
                Arguments.arguments(new int[]{2, 1, 2, 1, 2}, new int[]{2}),
                Arguments.arguments(new int[]{1, 1, 1, 1, 1}, new int[]{})
        );
    }
}
