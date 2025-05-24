import java.util.*;
class Solution {
    public long solution(long n) {

        double d = Math.sqrt(n);
        if(d == (int)d) {
            d += 1;
        } else return -1;

        return (long)d * (long)d;
    }
}