class Solution {
    public int solution(int[] numbers, int k) {
        int a = k * 2;
        while(a > numbers.length){
            a -= numbers.length;
        }
        return numbers[(k - 1) * 2 % numbers.length];
    }
}