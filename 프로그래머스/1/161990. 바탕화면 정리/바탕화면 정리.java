class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {-1, 50, -1, -1};
        
        for(int i = 0; i < wallpaper.length; i++){
            if(wallpaper[i].contains("#") && answer[0] == -1) answer[0] = i;
            if(wallpaper[i].contains("#")) answer[2] = i + 1;
            int index = 0;
            for(char c : wallpaper[i].toCharArray()){
                if(c == '#'){
                    answer[1] = Math.min(index, answer[1]);
                    answer[3] = Math.max(index + 1, answer[3]);
                }
                index++;
            }
        }
        
        return answer;
    }
}