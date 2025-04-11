class Solution {
    public String solution(int age) {
        String answer = "";
        int i;
        while(age > 0){
            i = (age % 10) + 97;
            char c = (char)i;
            answer = c + answer;
            age /= 10;
        }
        return answer;
    }
}