package pl.monoits.wheeloffortune;

/**
 * Created by czalewski on 16.05.17.
 */
public class GameControl {

    private final GameModel gameModel;
    private final GameScreen gameScreen;
    private final GameConsole gameConsole;

    public GameControl() {
        this.gameModel = new GameModel();
        this.gameScreen = new GameScreen(gameModel);
        this.gameConsole = new GameConsole(gameModel);
    }

    public void showGame() {
        Play play = new Play(gameModel.getWordLibrary());
        gameModel.setPlay(play);

        Price price = new Price(gameModel.getPriceLibrary());
        gameModel.setPrice(price);


        do {
            gameScreen.display();
            gameConsole.inputPanel();
            gameModel.setPrice(new Price(gameModel.getPriceLibrary()));
        } while (!gameModel.finish());
        gameScreen.display2();
    }

}
