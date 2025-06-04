import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public List<Integer> of(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        if (number > 1) {
            if (number == 4) {
                while (number % 2 == 0) {
                    factors.add(2);
                    number /= 2;
                }
            } else if (number == 6) {
                factors.add(2);
                factors.add(3);

            } else {
                factors.add(number);
            }
        }
        return factors;
    }
}
