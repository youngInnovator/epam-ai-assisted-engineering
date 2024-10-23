package com.epam.ai;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : strs) {
            // Sort the word to get a unique key for each group of anagrams
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Add the word to the corresponding anagram group
            anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        // Return all grouped anagrams
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = ga.groupAnagrams(input);
        System.out.println(result);
    }
}

