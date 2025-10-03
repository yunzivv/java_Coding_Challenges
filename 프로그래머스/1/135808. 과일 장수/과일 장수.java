import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> sortedList = Arrays.stream(score)
                                 .boxed()
                                 .sorted(Collections.reverseOrder())
                                 .collect(Collectors.toList());
        
        for(int i = m-1; i < score.length; i += m){
            answer += sortedList.get(i) * m;
        }
        
        return answer;
    }
}