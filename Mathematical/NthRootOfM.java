package Mathematical;

public class NthRootOfM {
    public int NthRoot(int n, int m) {
        double root = findRoot(n, m);
        int roundedIntegerRoot = (int) Math.round(root);

        return Math.abs(root - roundedIntegerRoot) < 1e-12 ? roundedIntegerRoot : -1;
    }

    public double findRoot(int n, int m) {
        double low = 1;
        double high = m;
        double eps = 1e-12;

        while (high - low > eps) {
            double mid = (low + high) / 2;
            if (multiply(mid, n) < m) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return low;
    }

    double multiply(double number, int n) {
        double ans = 1.0;
        for (int i = 1; i <= n; i++) {
            ans = ans * number;
        }
        return ans;
    }
}
