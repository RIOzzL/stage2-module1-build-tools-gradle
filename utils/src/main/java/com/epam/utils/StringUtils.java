package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str.isEmpty() || str.contains(" ") || str == null || str.startsWith("0")) {
            return false;
        } else if (Double.parseDouble(str) < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPositiveNumber("11.88"));
    }
}
