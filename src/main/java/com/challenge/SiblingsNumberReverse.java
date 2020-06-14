package com.challenge;

import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Find max sibling number.
 * Aproach: Reverse sorted number
 */
public class SiblingsNumberReverse implements MaxValue {

    @Override
    public int getResult(int number) {
        return Integer.parseInt(String.valueOf(number).chars()
                .mapToObj(item -> (char) item)
                .collect(Collectors.toList())
                .stream()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining()));
    }
}
