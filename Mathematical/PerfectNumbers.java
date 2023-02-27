package Mathematical;

import java.text.DecimalFormat;

public class PerfectNumbers {
    static int isPerfectNumber(Long N) {
        long sum = 0;
        long num = N;

        for (int i = 1; i <= (int) (Math.sqrt(N)); i++) {
            if (N % i == 0) {
                long factor = i;

                if (factor != num) {
                    sum += factor;
                }

                long otherFactor = N / i;
                if (factor != otherFactor && otherFactor != num) {
                    sum += otherFactor;
                }
            }
        }

        double low = 2.99999999905;
        DecimalFormat df = new DecimalFormat("##.000");
        df.format(low);

        return sum == num ? 1 : 0;
    }
}
