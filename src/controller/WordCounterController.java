/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Map;
import model.WordCounterModel;
import view.WordCounterView;

/**
 *
 * @author lethienacqt
 */
public class WordCounterController {
  private WordCounterModel model;
    private WordCounterView view;

    public WordCounterController(WordCounterModel model, WordCounterView view) {
        this.model = model;
        this.view = view;
    }

    public void countAndDisplayCharacters(String input) {
        model.countCharacters(input);
        Map<Character, Integer> characterCounts = model.getCharacterCounts();
        view.displayCharacterCounts(characterCounts);
    }
}
