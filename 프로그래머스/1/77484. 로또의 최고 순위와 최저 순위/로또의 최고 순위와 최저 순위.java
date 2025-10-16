class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int zero = 0;
        int agreement = 0;
        for(int my : lottos){
            if(my == 0) zero++;
            for(int win : win_nums){
                if(win == my) agreement++;
            }
        }
        int best = 7 - (agreement + zero)  == 7 ? 6 : 7 - (agreement + zero);
        int worst =  7 - agreement == 7 ? 6 : 7 - agreement;
        
        return new int[]{best, worst};
    }
}