/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lethienacqt
 */
public class WordCounterModel {
    private Map<Character, Integer> characterCounts = new HashMap<>();

    public void countCharacters(String input) {
        input = input.toLowerCase(); // Convert input to lowercase for case-insensitivity
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                characterCounts.put(c, characterCounts.getOrDefault(c, 0) + 1);
            }
        }
    }

    public Map<Character, Integer> getCharacterCounts() {
        return characterCounts;
    }
}
