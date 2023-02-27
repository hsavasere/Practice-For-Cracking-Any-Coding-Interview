package Puzzles;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeDivisors {
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q) {
        ArrayList<Long> primeNumbers = getPrimes();
        ArrayList<Integer> result = new ArrayList<>();

        for (long i : query) {
            int index = Collections.binarySearch(primeNumbers, (long) (Math.sqrt(i)));
            result.add(Math.abs(index + 1));
        }
        return result;
    }

    static ArrayList<Long> getPrimes() {
        boolean[] primes = new boolean[1_000_001];

        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }

        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i <= Math.sqrt(primes.length) + 1; i++) {
            if (primes[i]) {
                int j = i * 2;
                while (j < primes.length) {
                    primes[j] = false;
                    j += i;
                }
            }
        }

        ArrayList<Long> result = new ArrayList<>();

        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                result.add((long) i);
            }
        }

        return result;
    }
}
