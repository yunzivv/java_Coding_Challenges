class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 1;
        for(int i = 0; i < code.length(); i++){
            if(code.charAt(i) == 49)  {
                mode *= -1;
                continue;
            };
            if(mode == 1 && i % 2 == 0){
                answer += String.valueOf(code.charAt(i));
            }else if(mode == -1 && i % 2 == 1){
                answer += String.valueOf(code.charAt(i));
            }
        }
        if(answer.length() == 0) return "EMPTY";
        return answer;
    }
}