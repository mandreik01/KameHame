package pl.monoits.wheeloffortune;

/**
 * Created by czalewski on 16.05.17.
 */
public class Price {

    private Integer ptk;

    public Price(PriceLibrary priceLibrary) {
        ptk = priceLibrary.randomPrice();
    }

    public Integer getPtk() {
        return ptk;
    }
}
