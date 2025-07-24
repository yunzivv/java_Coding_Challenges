class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int start = 100;
        int end = -100;
        int[] line = new int[200];
    
        if(lines[0][1] > lines[1][0] && lines[1][1] > lines[0][0]){
            start = lines[0][0] > lines[1][0] ? lines[0][0] : lines[1][0];
            end = lines[0][1] > lines[1][1] ? lines[1][1] : lines[0][1];
            for(int i = start+100; i < end+100; i++){
                line[i] = 1;
            }
        }
        if(lines[1][1] > lines[2][0] && lines[2][1] > lines[1][0]){
            start = lines[1][0] > lines[2][0] ? lines[1][0] : lines[2][0];
            end = lines[1][1] > lines[2][1] ? lines[2][1] : lines[1][1];
            for(int i = start+100; i < end+100; i++){
                line[i] = 1;
            }
        }
        if(lines[0][1] >lines[2][0]){
            start = lines[2][0] > lines[0][0] ? lines[2][0] : lines[0][0];
            end = lines[2][1] > lines[0][1] ? lines[0][1] : lines[2][1];
            for(int i = start+100; i < end+100; i++){
                line[i] = 1;
            }
        }
        for(int i = 0; i < 200; i++){
            if(line[i] == 1)answer++;
        }
        return answer;
    }
}