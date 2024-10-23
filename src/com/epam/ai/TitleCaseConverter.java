package com.epam.ai;

public class TitleCaseConverter {
    public static String toTitleCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split(" ");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                titleCase.append(Character.toUpperCase(word.charAt(0))) // Capitalize first letter
                        .append(word.substring(1).toLowerCase()); // Lowercase the rest
            }
            titleCase.append(" "); // Add space after each word
        }

        return titleCase.toString().trim(); // Trim the extra space at the end
    }

    public static void main(String[] args) {
        String input = "this is a test string";
        String result = toTitleCase(input);
        System.out.println(result);  // Output: "This Is A Test String"
    }
}

