class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {

        int answer = health;
        int time = 0;
        int sequence = 0;
        
        for(int i = attacks[0][0]; i <= attacks[attacks.length - 1][0]; i++){
            if(i == attacks[time][0]){
                answer -= attacks[time][1];
                time++;
                sequence = 0;
            } else {
                answer += bandage[1];
                if(++sequence == bandage[0]){
                    // System.out.println("success");
                    answer += bandage[2];
                    sequence = 0;
                }
            }
            if(answer < 1) return -1;
            if(answer > health) answer = health;
            // System.out.println(i + " " + answer);
        }
        
        return answer;
    }
}