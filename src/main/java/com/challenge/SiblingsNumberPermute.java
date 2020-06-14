package com.challenge;

import java.util.Arrays;
import java.util.stream.Collectors;


/**
 * Find max sibling number.
 * Aproach: Using permutation algorithm to find permutations and then
 * store max value
 */
public class SiblingsNumberPermute implements MaxValue {

    private int max;

    private void swap(int[] values, int from, int to) {
        int c = values[from];
        values[from] = values[to];
        values[to] = c;
    }

    private int permute(int[] a, int size) {
        if (size == 1) {
            String value = Arrays.stream(a)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining());
            int temp = Integer.parseInt(value);
            return (max < temp) ? temp : max;
        }
        for (int index = 0; index < size; index++) {
            swap(a, index, size - 1);
            max = permute(a, size - 1);
            swap(a, index, size - 1);
        }
        return max;
    }

    @Override
    public int getResult(int number) {
        max = -1;
        int[] value = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .toArray();
        return permute(value, value.length);
    }
}