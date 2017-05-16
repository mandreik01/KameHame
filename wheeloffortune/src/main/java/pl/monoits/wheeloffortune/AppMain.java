package pl.monoits.wheeloffortune;

/**
 * Created by czalewski on 16.05.17.
 */
public class AppMain {

    private final GameControl gameControl;


    public AppMain() {
        this.gameControl = new GameControl();

    }

    public static void main(String[] args) {
        AppMain appMain = new AppMain();
        appMain.gameControl.showGame();

    }
}
