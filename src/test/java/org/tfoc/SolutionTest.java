package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@Slf4j
class SolutionTest {

    private static Stream<Arguments> provideInputNums() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{1, 2, 3}, 6, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("provideInputNums")
    void twoSum(int[] nums, Integer target, int[] responseExpected) {
        int[] response = Solution.twoSum(nums, target);

        assertArrayEquals(responseExpected, response);
    }

    @ParameterizedTest
    @MethodSource("provideInputNums")
    void twoSumWorse(int[] nums, Integer target, int[] responseExpected) {
        int[] response = Solution.twoSumWorse(nums, target);

        assertArrayEquals(responseExpected, response);
    }


}