package Mathematical;

import java.util.PriorityQueue;

public class JumpingNumbers {
    static long jumpingNums(long X) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int largestJumpingNumber = -1;

        for (int i = 1; i <= 9; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty() && queue.peek() <= X) {
            int num = queue.remove();
            int endingDigit = num % 10;

            if (num > X) {
                break;
            } else {
                largestJumpingNumber = num;

                if (endingDigit == 0) {
                    queue.add(num * 10 + 1);
                } else if (endingDigit == 9) {
                    queue.add(num * 10 + 8);
                } else {
                    queue.add(num * 10 + (endingDigit - 1));
                    queue.add(num * 10 + (endingDigit + 1));
                }
            }
        }
        return largestJumpingNumber;
    }
}
