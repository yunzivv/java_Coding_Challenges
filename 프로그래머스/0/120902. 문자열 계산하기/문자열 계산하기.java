class Solution {
    public int solution(String my_string) {
        String[] cal = my_string.split(" ");
        int answer = Integer.parseInt(cal[0]);
        for(int i = 1; i < cal.length; i++){
            if(cal[i].equals("+")) answer += Integer.parseInt(cal[++i]);
            else answer -= Integer.parseInt(cal[++i]);
        }
        return answer;
    }
}