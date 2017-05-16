package pl.monoits.wheeloffortune;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by czalewski on 16.05.17.
 */
public class PriceLibrary {

    private List<Integer> cena = new ArrayList<Integer>();

    public PriceLibrary() {
        cena.add(500);
        cena.add(400);
        cena.add(300);
        cena.add(200);
        cena.add(100);
    }

    public Integer randomPrice() {
        Random random = new Random();
        int bound = cena.size();
        int idx = random.nextInt(bound);
        return cena.get(idx);
    }
}
