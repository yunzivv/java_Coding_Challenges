class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int k = 0;
        
        for(String s : targets){
            for(char c : s.toCharArray()){
                
                int click = 101;
                
                for(int i = 0; i < keymap.length; i++){
                    int index = keymap[i].indexOf(c);
                    if(index != -1) click = Math.min(click, index + 1);
                }
                // System.out.println(click);
                
                if(click != 101) {
                    answer[k] += click;
                } else {
                    answer[k] = -1;
                    break;
                }
            }
            k++;
        }
        
        return answer;
    }
}