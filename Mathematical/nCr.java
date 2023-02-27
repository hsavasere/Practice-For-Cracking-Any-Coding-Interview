package Mathematical;

public class nCr {

    static int calculateNCR(int n, int r) {
        int[][] ncr = new int[n + 1][r + 1];

        // We are considering 0C0 = 0, not required as by default arrays are filled with 0s

        // We are filling first column with 1 as nC0 = 1 for any value of n
        for (int i = 1; i < n + 1; i++) {
            ncr[i][0] = 1;
        }

        // Special case of 1C1 = 1 needs to be handled here, as we are not considering 0C0 = 1, that's why
        ncr[1][1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= r; j++) {
                ncr[i][j] = (ncr[i - 1][j] + ncr[i - 1][j - 1]) % 1_000_000_007;
            }
        }

        return ncr[n][r];
    }

}
