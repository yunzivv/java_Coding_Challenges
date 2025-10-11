import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        int answer = 0;
        for(int i = citations.length; i > 0; i--){
            int quotation = 0;
            for(int j = 0; j < citations.length; j++){
                if(citations[j] >= i) {
                    quotation++;
            }}
            if(quotation >= i) answer = Math.max(answer, i);
        }
          
        return answer;
    }
}