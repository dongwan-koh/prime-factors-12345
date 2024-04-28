import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public Object of(int number) {
        List<Integer> factors = new ArrayList<>();
        int divisor = 2;
        for(divisor = 2; number > 1; divisor++) {
            while(number % divisor == 0) {
                factors.add(divisor);
                number /= divisor;
            }
        }
        return factors;
    }
}
