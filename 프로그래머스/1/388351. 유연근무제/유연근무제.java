class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        
        int answer = 0;
        int[] awards = new int[schedules.length];
        int len = schedules.length;
        
        for(int i = 0; i < len; i++){
            int t = schedules[i] / 100;
            int m = (schedules[i] % 100) + 10;
            
            if(m > 59) {
                m -= 60;
                t = (t + 1) % 24;
            }
            schedules[i] = (t * 100) + m;
        }
        
        for(int i = 0; i < timelogs[0].length; i++){
            if(startday == 6){
                startday++;
                continue;
            }
            if(startday == 7){
                startday = 1;
                continue;
            }
            
            for(int j = 0; j < len; j++){
                if(schedules[j] < timelogs[j][i]) awards[j] = -1;
            }
            startday++;
        }
        for(int i : awards){
            if(i == 0) answer++;
        }

        return answer;
    }
}