package com.brainacad.oop.testsregexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String[] strings = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " " };

        for (String item : strings) {
            boolean result = checkPersonWithRegExp(item);
            if (result) {
                System.out.println("Name - " + item + " is correct");
            } else {
                System.out.println("Name - " + item + " is not correct");
            }
        }
    }

    public static boolean checkPersonWithRegExp(String userNameString) {

        String template;

        template = "[A-Z]\\w{1}\\w[a-z][^0-9]*";

        Pattern pattern = Pattern.compile(template);
        Matcher matcher = pattern.matcher(userNameString);
        if (matcher.matches()) {
            return true;
        } else return false;
    }

}
