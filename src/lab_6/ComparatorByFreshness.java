package lab_6;
import java.util.Comparator;



public class ComparatorByFreshness implements Comparator<Flower> {

    @Override
    public int compare(Flower o1, Flower o2) {
        return Integer.compare(o1.getDaysFromCut(), o2.getDaysFromCut());
    }
}

