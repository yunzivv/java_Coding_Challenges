import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        boolean flag = false;
        int index = -1;
        List<Integer> list = new ArrayList<>();

        for(char c : dartResult.toCharArray()){
            if(index >= 0) System.out.println(index + " " + list.get(index));
            if(c >= '0' && c <= '9'){
                if(flag){
                    list.set(index, list.get(index) * 10 + (int)(c - 48));
                } else {
                    list.add((int) c - 48);
                    index++;
                }
                flag = true;
            } else {
                flag = false;
                if(c == 'D'){
                    list.set(index, (int) Math.pow(list.get(index), 2));
                } else if(c == 'T'){
                    list.set(index, (int) Math.pow(list.get(index), 3));
                } else if(c == '*'){
                    list.set(index, list.get(index) * 2);
                    if(index > 0) list.set(index - 1, list.get(index - 1) * 2);
                } else if(c == '#'){
                    list.set(index, list.get(index) * -1);

                }
            }
        }
        for(int i : list) answer += i;

        return answer;
    }
}