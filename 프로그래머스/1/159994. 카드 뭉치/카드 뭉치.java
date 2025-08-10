class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int index1 = 0;
        int index2 = 0;
        
        for(int i = 0; i < goal.length; i++){
            if(cards1[index1] == goal[i]){
                index1++;
                continue;
            }else if(cards2[index2] == goal[i]){
                index2++;
                continue;
            }else return "No";
        }
        return "yes";
    }
}