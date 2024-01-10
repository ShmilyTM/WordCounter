/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.WordCounterModel;
import view.WordCounterView;

/**
 *
 * @author lethienacqt
 */
public class WordCounterApp {
   public static void main(String[] args) {
        WordCounterModel model = new WordCounterModel();
        WordCounterView view = new WordCounterView();
        WordCounterController controller = new WordCounterController(model, view);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String input = scanner.nextLine();

        controller.countAndDisplayCharacters(input);
    }

}
