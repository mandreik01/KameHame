package pl.monoits.wheeloffortune;

/**
 * Created by czalewski on 16.05.17.
 */
public class GameModel {

    private final WordLibrary wordLibrary;
    private final PriceLibrary priceLibrary;
    private Price price;
    private Play play;

    public GameModel() {
        this.wordLibrary = new WordLibrary();
        this.priceLibrary = new PriceLibrary();

    }

    public WordLibrary getWordLibrary() {
        return wordLibrary;
    }

    public PriceLibrary getPriceLibrary() {
        return priceLibrary;
    }

    public void setPlay(Play play) {
        this.play = play;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Play getPlay() {
        return play;
    }

    public Price getPrice() {
        return price;
    }

    public boolean finish() {
        return getPlay().getWord().equals(getPlay().getHiddenWord());
    }
}
