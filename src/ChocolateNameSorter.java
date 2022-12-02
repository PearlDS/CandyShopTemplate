import java.util.Comparator;

public class ChocolateNameSorter implements Comparator<Chocolate> {
    @Override
    public int compare(Chocolate o1, Chocolate o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
