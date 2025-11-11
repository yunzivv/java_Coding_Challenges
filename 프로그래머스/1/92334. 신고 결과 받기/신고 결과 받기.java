import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int len = id_list.length;
        int[] answer = new int[len];
        if(len <= k) return answer;
        
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        String[] reportD = hashSet.toArray(new String[0]);
        
        int[][] table = new int[len][len];
        int[] sum = new int[len];
        
        for(String s : reportD){
            String[] r = s.split(" ");
            table[Arrays.asList(id_list).indexOf(r[0])][Arrays.asList(id_list).indexOf(r[1])] = 1;
            sum[Arrays.asList(id_list).indexOf(r[1])]++;
        }
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(table[i][j] == 1 && sum[j] >= k) answer[i]++;
            }
        }
        
        return answer;
    }
}