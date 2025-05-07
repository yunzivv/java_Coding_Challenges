import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] top3 = {100, 100, 100};
        for(int i = 0; i < rank.length; i++){
            if(!attendance[i]) rank[i] = 101;
        }
        int index = 0;
        for(int i = 0; i < 3; i++) {
            int ranking = 101;
            int rankIdx = 0;
            for(int j = 0; j < rank.length; j++){
                if(rank[j] < ranking){
                    ranking = rank[j];
                    rankIdx = j;
                }
            }
            top3[index++] = rankIdx;
            rank[rankIdx] = 101;
        }

        return top3[0] * 10000 + top3[1] * 100 + top3[2];
    }
}