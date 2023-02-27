package Mathematical;

class SeriesGP {
    public int Nth_term(int a, int r, int n) {
        a = a % 1_000_000_007;
        long powerNthTerm = pow(r, n - 1) % 1_000_000_007;
        return (int) ((a * powerNthTerm) % 1_000_000_007);
    }

    long pow(int r, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return r;
        } else {
            long res1 = pow(r, n / 2) % 1_000_000_007;

            if (n % 2 == 0) {
                return (res1 * res1) % 1_000_000_007;
            } else {
                long res2 = pow(r, n / 2 + 1) % 1_000_000_007;
                // Wherever we are multiplying 2 numbers, we need to do the modular operation
                return (res1 * res2) % 1_000_000_007;
            }
        }
    }
}