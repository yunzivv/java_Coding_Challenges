import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        
        int l = elements.length;
        
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        int[] newEle = new int[l * 2 - 1];
        for(int i = 0; i < newEle.length; i++) newEle[i] = elements[i % l];
        
        for(int i = 1; i < l; i++){
            for(int j = 0; j < l; j++){
                int s = 0;
                for(int k = j; k < j + i; k++){
                    s += newEle[k];
                }
                set.add(s);
            }
        }
        
        return set.size() + 1;
    }
}