import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {
        BigInteger ballB = factorial(BigInteger.valueOf(balls));
        BigInteger shareB = factorial(BigInteger.valueOf(share));
        BigInteger ballSubShareB = factorial(BigInteger.valueOf(balls - share));
        BigInteger a = ballB.divide(ballSubShareB.multiply(shareB));
        int answer = a.intValue();
        return answer;
    }
    
    public BigInteger factorial(BigInteger n){
        BigInteger one = new BigInteger("1");
        BigInteger answer = new BigInteger("1");
        for(BigInteger i = n; i.compareTo(BigInteger.ZERO) != 0; i = i.subtract(one)){
            answer = answer.multiply(i);
        }
        return answer;
    }
    
}