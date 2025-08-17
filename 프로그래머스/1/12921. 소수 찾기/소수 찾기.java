import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n) {

        return (int) IntStream.rangeClosed(1, n)
                              .filter(i -> isPrime(i))
                              .count();
    }

    public boolean isPrime(int num) {
        if (num == 2) return true;
        if (num <= 1 || num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }

        return true;
    }
}