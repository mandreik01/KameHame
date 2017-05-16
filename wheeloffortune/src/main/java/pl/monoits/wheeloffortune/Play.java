package pl.monoits.wheeloffortune;

/**
 * Created by czalewski on 16.05.17.
 */
public class Play {

    private String word;
    private String hiddenWord;


    public Play(WordLibrary wordLibrary) {
        this.word = wordLibrary.randomWord();
        hideWord();
    }

    public String getWord() {
        return word;
    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public void setHiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    private void hideWord() {
        int letter = word.length();
        StringBuilder sb = new StringBuilder(letter);
        for (int i = 0; i < letter; i++) {
            sb.append("*");
        }
        hiddenWord = sb.toString();
    }
}
