class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            String[] query = quiz[i].split(" ");
            int cal = 0;
            if(query[1].equals("-")){
                cal = Integer.parseInt(query[0]) + Integer.parseInt(query[2]) * -1;
            } else {
                cal = Integer.parseInt(query[0]) + Integer.parseInt(query[2]);
            }
            
            if(cal == Integer.parseInt(query[4])) answer[i] = "O";
            else answer[i] = "X";
        }
        
        
        return answer;
    }
}