package com.example.demomap.specification;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class StringUtilss {
    public static boolean containsNonAccentChars(String input) {
        return input.matches("\\p{ASCII}+");
    }

    public static String replaceToUnAccent(String input) {
        String temp = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("");
    }
}
