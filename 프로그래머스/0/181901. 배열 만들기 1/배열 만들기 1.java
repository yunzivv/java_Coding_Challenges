import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> arrAn = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(i % k == 0){
                arrAn.add(i);
            }
        }
        
        int[] answer = new int[arrAn.size()];
        for(int i = 0; i < arrAn.size(); i++){
            answer[i] = arrAn.get(i);
        }
        
        return answer;
    }
}