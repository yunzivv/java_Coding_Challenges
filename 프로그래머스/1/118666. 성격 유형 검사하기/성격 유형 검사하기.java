class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int len = survey.length;
        int[] total = new int[4];
        
        
        for(int i = 0; i < len; i++){
            char c = survey[i].charAt(0);
            int score = choices[i] - 4;
            if(c == 'R') total[0] -= score;
            else if(c == 'T') total[0] += score;
            else if(c == 'C') total[1] -= score;
            else if(c == 'F') total[1] += score;
            else if(c == 'J') total[2] -= score;
            else if(c == 'M') total[2] += score;
            else if(c == 'A') total[3] -= score;
            else if(c == 'N') total[3] += score;
        }
        
        answer += total[0] < 0 ? "T" : "R";
        answer += total[1] < 0 ? "F" : "C";
        answer += total[2] < 0 ? "M" : "J";
        answer += total[3] < 0 ? "N" : "A";
        
        return answer;
    }
}