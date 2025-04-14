import java.util.*;
class Solution {
    public int[] solution(int n) {
        int temp = n;
        int index = 0;
        while(n > 1){
            if(n % 2 == 0){
                n /= 2;
            }else {
                n = 3*n+1;
            }
            index++;
        }
        
        int[] answer = new int[index+1];
        n = temp;
        answer[0] = n;
        
        for(int i = 1; i <= index; i++){
            if(n % 2 == 0){
                n /= 2;
            }else {
                n = 3*n+1;
            }
            answer[i] = n;
        }
        return answer;
    }
}