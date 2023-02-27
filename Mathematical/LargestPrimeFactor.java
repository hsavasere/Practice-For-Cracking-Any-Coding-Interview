package Mathematical;

public class LargestPrimeFactor {
    static long largestPrimeFactor(int N) {
        int limit = (int) Math.sqrt(N) + 1;
        int largestPrimeFactor = N;

        while (N % 2 == 0) {
            N /= 2;
        }

        while (N % 3 == 0) {
            N /= 3;
            largestPrimeFactor = 3;
        }

        for (int i = 5; i <= limit; i += 6) {

            // Pattern is 5 and 7, 11 and 13, 19 and 21 ........
            // so for that we are doing the below of repeateadly dividing i and i + 2
            while (N % i == 0) {
                N /= i;
                largestPrimeFactor = i;
            }

            while (N % (i + 2) == 0) {
                N /= (i + 2);
                largestPrimeFactor = (i + 2);
            }

        }


        if (N != 1 || largestPrimeFactor == -1) {
            largestPrimeFactor = N;
        }


        return largestPrimeFactor;
    }
}
