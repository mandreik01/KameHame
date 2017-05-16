package pl.monoits.wheeloffortune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by czalewski on 16.05.17.
 */
public class GameConsole {

    private final GameModel gameModel;
    private GameLibrary gameLibrary;


    public GameConsole(GameModel gameModel) {
        this.gameModel = gameModel;
    }


    public void inputPanel() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputPanel = reader.readLine();
            if (!inputPanel.isEmpty()) {
                String userInput = inputPanel.trim().toLowerCase().substring(0, 1);
                userInput(userInput.charAt(0));
            } else {
                System.out.println("Nie wprowadzono litery.");
                System.out.println("");
            }
        } catch (IOException e) {
            System.out.print("Błąd odczytu. Wprowadź ponownie");
        }
    }

    /*public void userInput(char c) {

        String word = gameModel.getPlay().getWord();
        String hiddenWord = gameModel.getPlay().getHiddenWord();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                sb.append(c);
            } else if (hiddenWord.charAt(i) != '*') {
                sb.append(hiddenWord.charAt(i));
            } else {
                sb.append("*");
            }
        }
        gameModel.getPlay().setHiddenWord(sb.toString());
    }*/

    public void userInput(char c) {

        String guessedWord = gameModel.getPlay().getWord();
        char[] w = guessedWord.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(Character gw : w){
            if(gw.equals(w)) {
                sb.append(c);
            }else{
                sb.append("*");
            }

        }
    }

}
