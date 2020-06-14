package com.challenge;

public class Solution
{
    public static void main( String[] args )
    {
        if (args.length == 0) throw new IllegalArgumentException();

        int number = Integer.parseInt(args[0]);
        SiblingsNumber permute = new SiblingsNumber(new SiblingsNumberPermute());
        SiblingsNumber reverse = new SiblingsNumber(new SiblingsNumberReverse());

        System.out.println(String.format("Using permutation -> %d", permute.getResult(number)));
        System.out.println(String.format("Using reverse sorted -> %d", reverse.getResult(number)));
    }
}
