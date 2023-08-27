package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class characterCount {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = quote.toCharArray();

        HashMap<Character, Integer> characterCount = new HashMap<>();

        for (char singleCharacter : charactersInString) {
            // int characterCount = 0;
            if (characterCount.containsKey(singleCharacter)) {
                characterCount.put(singleCharacter, characterCount.get(singleCharacter) + 1);
            } else {
                characterCount.put(singleCharacter, 1);
            }
        }
        for (Map.Entry<Character, Integer> oneCharacter : characterCount.entrySet()) {
            System.out.println(oneCharacter.getKey() + ":" +  oneCharacter.getValue());
        }
    }
}



