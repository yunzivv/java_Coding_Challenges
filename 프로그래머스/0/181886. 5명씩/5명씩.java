class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length + 4) / 5];
        int index = 0;
        for(int i = 0; i < names.length; i += 5){
            answer[index] = names[i];
            index++;
        }
        return answer;
    }
}