package io.vaku;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CheckArrayTests {
    private ArrayUtils arrayUtils;

    @BeforeEach
    public void init() {
        arrayUtils = new ArrayUtils();
    }

    @ParameterizedTest(name = "Array {0} should return {1} after checking")
    @MethodSource("testData")
    public void checkArrayTest(int[] actual, boolean expected) {
        assertEquals(expected, arrayUtils.checkArray(actual));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.arguments(new int[]{2, 2, 1, 2, 2}, true),
                Arguments.arguments(new int[]{1, 1, 2, 1, 1}, true),
                Arguments.arguments(new int[]{2, 1, 2, 1, 2}, true),
                Arguments.arguments(new int[]{1, 2, 1, 2, 1}, true),
                Arguments.arguments(new int[]{1, 1, 1, 1, 1}, false),
                Arguments.arguments(new int[]{2, 2, 2, 2, 2}, false),
                Arguments.arguments(new int[]{2, 3, 1, 2, 2}, false),
                Arguments.arguments(new int[]{3, 3, 1, 3, 3}, false),
                Arguments.arguments(new int[]{3, 3, 2, 3, 3}, false),
                Arguments.arguments(new int[]{3, 3, 3, 3, 3}, false),
                Arguments.arguments(new int[]{}, false)
        );
    }
}
