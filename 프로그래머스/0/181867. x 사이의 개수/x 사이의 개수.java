class Solution {
    public int[] solution(String myString) {
        String[] notX = myString.split("x", -1);
        int[] answer = new int[notX.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = notX[i].length();
        }
        return answer;
    }
}
