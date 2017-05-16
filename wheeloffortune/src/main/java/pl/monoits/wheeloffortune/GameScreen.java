package pl.monoits.wheeloffortune;

/**
 * Created by czalewski on 16.05.17.
 */
public class GameScreen implements Screen{

    private final GameModel gameModel;

    public GameScreen(GameModel gameModel) {
        this.gameModel = gameModel;

    }

    @Override
    public void display() {
        System.out.println("Witaj w grze Koło Fortuny");
        System.out.println("");
        printHiddenWord();
        System.out.println("");
        printPrice();
        System.out.println("");
        System.out.println("Wprowadź litere: ");
        System.out.println("");
    }
    public void display2(){
        printWord();
        System.out.println("");
        System.out.println("BRAWO !!! WTGRAŁEŚ !!! :) ");
    }

    private void printPrice() {
        Integer cena = gameModel.getPrice().getPtk();
        System.out.println("Wylosowana cena za litere to: " + cena);
    }

    private void printHiddenWord() {
        String word = gameModel.getPlay().getHiddenWord();
        System.out.println("");
        System.out.println("Wylosowane hasło to: " + word);
    }

    private void printWord() {
        String word = gameModel.getPlay().getWord();
        System.out.println("Wylosowane hasło to: " + word);
    }


}
