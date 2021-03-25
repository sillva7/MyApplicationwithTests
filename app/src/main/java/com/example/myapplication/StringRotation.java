package com.example.myapplication;

import android.util.Log;

public class StringRotation {

    public StringRotation() {
    }

    public static String reversePhrase(String word, String ignore) {
        String[] wordStringArray = word.split(" ");
        StringBuilder wordResult = new StringBuilder();
        for (int i = 0; i < wordStringArray.length; i++) {
            char[] wordArray = wordStringArray[i].toCharArray();
            // Initialize leftCharIndex and rightCharIndex pointers
            int rightCharIndex = wordArray.length - 1;
            int leftCharIndex = 0;
            // Traverse string from both ends until
            // 'leftCharIndex' and 'rightCharIndex'
            while (leftCharIndex < rightCharIndex) {
                // Ignore special characters
                if (ignore.contains(wordArray[leftCharIndex] + ""))
                    leftCharIndex++;
                else if (ignore.contains(wordArray[rightCharIndex] + ""))
                    rightCharIndex--;
                    // Both wordArray[leftCharIndex] and wordArray[rightCharIndex] are not spacial
                else {
                    char tmp = wordArray[leftCharIndex];
                    wordArray[leftCharIndex] = wordArray[rightCharIndex];
                    wordArray[rightCharIndex] = tmp;
                    leftCharIndex++;
                    rightCharIndex--;
                }
            }
            StringBuilder wordBuilder = new StringBuilder();
            for (int j = 0; j < wordArray.length; j++) {
                wordBuilder.append(wordArray[j]);
            }
            wordResult.append(wordBuilder+" ");
        }
        return wordResult.toString().trim();
    }

}
