import java.util.Comparator;

public class ChocolateCalorieSorter implements Comparator<Chocolate> {
    @Override
    public int compare(Chocolate o1, Chocolate o2) {
        return o1.getCalories()- o2.getCalories();
    }
}
