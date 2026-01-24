class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String target = Integer.toString(n, k);
        
        String[] nums = target.split("0");        
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i].length() == 0 || nums[i].equals("1")) continue;
            if (isPrimeLong(Long.parseLong(nums[i]))) answer++;
        }
        
        return answer;
    }
    
    public static boolean isPrimeLong(long n) {
        if (n < 2) return false;
        if (n <= 3) return true;
        if (n % 2 == 0) return false;

        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

}