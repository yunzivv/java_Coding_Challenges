class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] math = binomial.split(" ");
        if(math[1].equals("+")){
            answer = Integer.parseInt(math[0]) + Integer.parseInt(math[2]);
        } else if(math[1].equals("-")){
            answer = Integer.parseInt(math[0]) - Integer.parseInt(math[2]);
        } else {
            answer = Integer.parseInt(math[0]) * Integer.parseInt(math[2]);
        }
        return answer;
    }
}