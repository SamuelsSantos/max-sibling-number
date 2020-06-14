package com.challenge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

public class SiblingsNumberTest {

    private SiblingsNumber permute;
    private SiblingsNumber reverse;
    private int[] checks = {
            56933277, // repeat numbers
            00000001, // min
            10000000, // max
            3456789, // unique numbers
            100000001 // index out of bound
    };

    private int[] expecteds = {
            97765332, // repeat numbers
            1, // min
            10000000, // max
            9876543, // unique numbers
            -1 // index out of bound
    };

    @Before
    public void setUp() throws Exception {
        permute = new SiblingsNumber(new SiblingsNumberPermute());
        reverse = new SiblingsNumber(new SiblingsNumberReverse());
    }

    @Test
    public void shouldSiblingNumberPermuteNoEquals() {
        Assert.assertNotEquals(273, permute.getResult(27053930));
    }

    @Test
    public void shouldSiblingNumberReverseNoEquals() {
        Assert.assertNotEquals(273, reverse.getResult(27053930));
    }

    @Test
    public void shouldSiblingNumberPermuteInvalid() {
        Assert.assertEquals(-1, permute.getResult(123456789));
    }

    @Test
    public void shouldSiblingNumberReverseInvalid() {
        Assert.assertEquals(-1, reverse.getResult(123456789));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenSiblingNumberPermuteInput_0_ThenExceptionThrown() {
        permute.getResult(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenSiblingNumberPermuteInput_Negative_ThenExceptionThrown() {
        permute.getResult(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenSiblingNumberReverseInput_0_ThenExceptionThrown() {
        reverse.getResult(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenSiblingNumberReverseInput_Negative_ThenExceptionThrown() {
        reverse.getResult(-1);
    }

    @Test
    public void shouldSiblingNumberPermuteValid() {
        IntStream.range(0, checks.length).forEach(index -> {
            Assert.assertEquals(expecteds[index], permute.getResult(checks[index]));
        });
    }

    @Test
    public void shouldSiblingNumberReverseValid() {
        IntStream.range(0, checks.length).forEach(index -> {
            Assert.assertEquals(expecteds[index], reverse.getResult(checks[index]));
        });
    }
}