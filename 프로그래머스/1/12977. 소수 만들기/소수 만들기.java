class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;

        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                for(int k = j + 1; k < len; k++){
                    if(isPrime(nums[i] + nums[j] + nums[k])) answer++;
                }
            }   
        }
        return answer;
    }
    
    boolean isPrime(int num){
        for(int a = 2; a < num; a++){
            if(num % a == 0)return false;
        }
        System.out.println(num);
        return true;
    }
}