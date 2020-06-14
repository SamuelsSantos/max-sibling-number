package com.challenge;

public class SiblingsNumber {

    private static final int MAX_VALID_VALUE = 100000000;
    public static final int INVALID_VALUE = -1;

    private final MaxValue maxValue;

    public SiblingsNumber(MaxValue maxValue) {
        this.maxValue = maxValue;
    }

    public int getResult(int number) {
        if (Integer.signum(number) != 1) throw new IllegalArgumentException();
        int result = maxValue.getResult(number);
        return result < MAX_VALID_VALUE ? result : INVALID_VALUE;
    }
}
