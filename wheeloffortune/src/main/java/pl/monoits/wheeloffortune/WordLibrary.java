package pl.monoits.wheeloffortune;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by czalewski on 16.05.17.
 */
public class WordLibrary {

    private List<String> lista = new ArrayList<String>();

    public WordLibrary() {

        lista.add("pierwsze");
        lista.add("drugie");
        lista.add("trzecie");
    }

    public String randomWord() {
        Random random = new Random();
        int bound = lista.size();
        int idx = random.nextInt(bound);
        return lista.get(idx);
    }
}
