import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        int[] answer = new int[numlist.length];
        List<Integer> list = new ArrayList<>();

        for(int i : numlist) {
            list.add(i-n);
        }

        int index = 0;
        while(list.size() > 0) {
            int abs = 10000;
            int num = 100;
            int remove = -1;
            for(int i = 0; i < list.size(); i++) {
                if(Math.abs(list.get(i)) <= abs){
                    abs = Math.abs(list.get(i));
                    num = list.get(i) + n;
                    remove = i;
                }
            }
            answer[index++] = num;
            list.remove(remove);
        }


        return answer;
    }
}