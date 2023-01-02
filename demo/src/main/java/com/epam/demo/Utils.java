package com.epam.demo;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args.contains("null")) {
            return false;
        }
        boolean positiveCheck = true;
        for (String arg : args) {
            if (arg.isEmpty() || !StringUtils.isNotBlank(arg) || Double.parseDouble(arg) <= 0) {
                return false;
            }
        }
        return positiveCheck;
        //magic happens here
        //magic happens here
    }
}