class Solution {
    public String solution(String myString) {
        String answer = "";
        char c;
        for(int i = 0; i < myString.length(); i++){
            c = myString.charAt(i);
            if(c < 'a'){
                c += 32;
            }
            answer += c;
        }
        return answer;
    }
}