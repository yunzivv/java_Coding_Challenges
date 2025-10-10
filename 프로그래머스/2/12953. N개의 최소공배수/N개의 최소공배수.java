class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int big = 0;
        for (int n : arr) {
            if(big < n) big = n;
        }
        
        int last = arr[arr.length - 1];
        for(int i = 1; i < 2147483647; i++){
            boolean isLCM = LCM(big * i, arr);
            if(isLCM) return big * i;
        }
        return answer;
    }
    
    public boolean LCM(int num, int[] list){
        
        for(int i : list){
            if(num % i != 0) {
                return false;
            }
        }
        return true;
    }
}