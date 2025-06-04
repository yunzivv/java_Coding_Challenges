class Solution {
    public String solution(String s) {
        String[] num = s.split(" ");
        int[] no = new int[num.length];
        
        for(int i = 0; i < num.length; i++){
            no[i] = Integer.parseInt(num[i]);
        }
        int small = 10000;
        int big = -10000;
        for(int i = 0; i < num.length; i++){
            if(small > no[i]) small = no[i];
            if(big < no[i])big = no[i];
        }
        
        return "" + small + " " + big;
    }
}