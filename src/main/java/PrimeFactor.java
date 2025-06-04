import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public List<Integer> of(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        if(number > 1) {
            factors.add(number);
        }
        return factors;
    }
}
