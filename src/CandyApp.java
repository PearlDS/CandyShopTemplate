import java.util.ArrayList;
import java.util.List;

public class CandyApp {
    public static void main(String[] args) {


        Chocolate mars = new Chocolate("mars", 0.65, "black", 288);
        Chocolate snickers = new Chocolate("snickers", 0.65, "brown", 245);
        Chocolate twix = new Chocolate("twix", 0.70, "brown", 246);
        Chocolate bounty = new Chocolate("bounty", 0.75, "blue", 169);
        Chocolate maltesers = new Chocolate("maltesers", 0.50, "red", 186);
        Chocolate mars2 = new Chocolate("Mars", 0.65, "black", 288);
        Chocolate oreo = new Chocolate("oreo", 1.20, "blue", 300);
        Chocolate reeses = new Chocolate("reeses", 0.70, "orange", 250);

        List<Chocolate> chocolates = new ArrayList<>();
        chocolates.add(mars);
        chocolates.add(snickers);
        chocolates.add(twix);
        chocolates.add(bounty);
        chocolates.add(maltesers);
        chocolates.add(oreo);
        chocolates.add(reeses);




    }
}
