/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Map;

/**
 *
 * @author lethienacqt
 */
public class WordCounterView {
public void displayCharacterCounts(Map<Character, Integer> characterCounts) {
        System.out.print("(");
        for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + ", ");
        }
        System.out.print(")");
    }
}