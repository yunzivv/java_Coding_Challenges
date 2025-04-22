class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        for(int i = 0; i < str.length - 1; i++){
            if(str[i+1].equals("Z") || str[i].equals("Z")) continue;
            answer += Integer.parseInt(str[i]);
        }
        if(!str[str.length - 1].equals("Z")) answer += Integer.parseInt(str[str.length - 1]);
        return answer;
    }
}