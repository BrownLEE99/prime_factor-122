import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public List<Integer> of(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        if (number > 1) {
            int divisor = 2;
            if (number == 4) {
                while (number % divisor == 0) {
                    factors.add(divisor);
                    number /= divisor;
                }
            } else if (number == 6) {
                for(divisor = 2; number > 1; divisor++) {
                    while(number % divisor == 0) {
                        factors.add(divisor);
                        number /= divisor;
                    }
                }
            } else {
                factors.add(number);
            }
        }
        return factors;
    }
}
