class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        hand = hand.equals("right") ? "R" : "L";
        
        // 초기 좌표
        int[] left = {3, 0};;
        int[] right = {3, 2};;
        
        for(int i : numbers){
            
            // 0일 때 11로 보정
            if(i == 0) i = 11; 
            
            // 좌측 키패드
            if(i % 3 == 1){
                answer += "L";
                left[0] = (i - 1) / 3;
                left[1] = (i - 1) % 3;
                
            // 우측 키패드
            } else if (i % 3 == 0){
                answer += "R";
                right[0] = (i - 1) / 3;
                right[1] = (i - 1) % 3;
                
            // 중앙 키패드
            } else {
                
                // 입력할 키와 현재 위치의 거리
                int l = Math.abs((i - 1) / 3 - left[0]) + Math.abs((i - 1) % 3 - left[1]);
                int r = Math.abs((i - 1) / 3 - right[0]) + Math.abs((i - 1) % 3 - right[1]);
                
                // 왼손이 가까울 때
                if(l < r){
                    answer += "L";
                    left[0] = (i - 1) / 3;
                    left[1] = (i - 1) % 3;
                    
                // 오른손이 가까울 때
                } else if(r < l){
                    answer += "R";
                    right[0] = (i - 1) / 3;
                    right[1] = (i - 1) % 3;
                
                // 거리가 같을 때 메인 손으로
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