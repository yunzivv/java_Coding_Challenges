import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if(n % i == 0 && check(i))answer.add(i);
        }
        
        return answer;
    }
    public boolean check(int i){
        for(int j = 2; j < i; j++){
            if(i % j == 0)return false;
        }
        return true;
    }
}