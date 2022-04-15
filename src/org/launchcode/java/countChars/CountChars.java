package org.launchcode.java.countChars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CountChars {

    public void characterCounter(String wordsToCount) {

        char[] charArray = wordsToCount.toLowerCase().toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();


        for (int i = 0; i < charArray.length; i++) {
            if (!Character.isLetter(charArray[i])) {
                continue;
            }
            if (!charCount.containsKey(charArray[i])) {
                charCount.put(charArray[i], 1);
            } else {
                Integer theVal = charCount.get(charArray[i]);
                theVal += 1;
                charCount.put(charArray[i], theVal);
            }
        }

        ArrayList<Character> myCharKeys = new ArrayList<>(charCount.keySet());
        for (int i = 0; i < myCharKeys.size(); i++) {
            Integer num = charCount.get(myCharKeys.get(i));
            System.out.println(myCharKeys.get(i) + ": " + num);
        }


    }
}