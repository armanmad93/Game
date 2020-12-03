package com.company.Homework;

import java.util.Arrays;

public class SomeClass implements CharSequence {

    private String string;

    public SomeClass(String name) {
        this.string = name;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || (index > string.length())) {
            System.out.println("ERROR plz try again!");
        }
        return string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        if (start < 0) {
            System.out.println("Error plz try again.");
        }
        if (end > string.length()) {
            System.out.println("Error plz try again.");
        }
        if (start > end) {
            System.out.println("Error plz try again.");
        }

        StringBuilder stringBuilder = new StringBuilder(string.subSequence(start,end));

        return stringBuilder.reverse();
    }

}
