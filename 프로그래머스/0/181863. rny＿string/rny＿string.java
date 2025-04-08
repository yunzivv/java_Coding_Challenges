class Solution {
    public String solution(String rny_string) {
        String answer = "";
        for(int a = 0; a < rny_string.length(); a++){
            if(rny_string.charAt(a) == 'm') {
                answer += "rn";
            } else {
                answer += rny_string.charAt(a);
            }
        }
        return answer;
    }
}