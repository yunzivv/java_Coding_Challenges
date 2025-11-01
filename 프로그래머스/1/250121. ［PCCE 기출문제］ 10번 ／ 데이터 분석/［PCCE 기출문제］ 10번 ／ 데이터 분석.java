import java.util.*;
import static java.util.Arrays.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        int extData = ext.equals("code") ? 0 : ext.equals("date") ? 1 : ext.equals("maximum") ? 2 : 3;
        int count =  sort_by.equals("code") ? 0 : sort_by.equals("date") ? 1 : sort_by.equals("maximum") ? 2 : 3;
        List<int[]> res = new ArrayList<>();

        for(int[] dataArr : data){
            if(dataArr[extData] < val_ext) {
                res.add(dataArr);
            }
        }

        int[][]answer = new int[res.size()][4];
        int index = 0;
        for(int[] r : res){
            answer[index++] = r;
        }

        sort(answer, Comparator.comparingInt(o -> o[count]));

        return answer;
    }
}