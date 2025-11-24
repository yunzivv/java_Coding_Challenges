class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        hand = hand.equals("right") ? "R" : "L";
        int[] left = {3, 0};;
        int[] right = {3, 2};;
        
        for(int i : numbers){
            if(i == 0) i = 11; 
            if(i % 3 == 1){
                answer += "L";
                left[0] = (i - 1) / 3;
                left[1] = (i - 1) % 3;
                
            } else if (i % 3 == 0){
                answer += "R";
                right[0] = (i - 1) / 3;
                right[1] = (i - 1) % 3;
                
            } else {
                int l = Math.abs((i - 1) / 3 - left[0]) + Math.abs((i - 1) % 3 - left[1]);
                int r = Math.abs((i - 1) / 3 - right[0]) + Math.abs((i - 1) % 3 - right[1]);
                
                if(l < r){
                    answer += "L";
                    left[0] = (i - 1) / 3;
                    left[1] = (i - 1) % 3;
                } else if(r < l){
                    answer += "R";
                    right[0] = (i - 1) / 3;
                    right[1] = (i - 1) % 3;
                } else {
                    answer += hand;
                    if(hand.equals("R")) {
                        right[0] = (i - 1) / 3;
                        right[1] = (i - 1) % 3;
                    } else {
                        left[0] = (i - 1) / 3;
                        left[1] = (i - 1) % 3;
                    }
                }
            }
        }
        
        return answer;
    }
}