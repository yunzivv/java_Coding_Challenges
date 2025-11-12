import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        List<Integer> basket = new ArrayList<>();
        int len = board.length;
        
        for(int i : moves){
            int k = i - 1;
            
            if(basket.size() >= 2){
                int ele = basket.size() - 1;
                if(basket.get(ele - 1) == basket.get(ele)){
                    basket.remove(ele);
                    basket.remove(ele - 1);
                    answer += 2;
                }
            }
            
            for(int j = 0; j < len; j++){
                if(board[j][k] != 0){
                    basket.add(board[j][k]);
                    board[j][k] = 0;
                    break;
                }
            }    
        }
        
        return answer;
    }
}