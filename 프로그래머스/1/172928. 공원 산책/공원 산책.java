class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int[] answer = {0,0};
        int x = park[0].length();
        int y = park.length;
        
        for(int i = 0; i < y; i++){
            if(park[i].contains("S")){
                answer[0] = i;
                for(int j = 0; j < x; j++){
                    if(park[i].charAt(j) == 'S') {
                        answer[1] = j;
                        break;
                    }
                }
                break;
            }
        }
        
        for(String s : routes){
            char ewsn = s.charAt(0);
            int block = s.charAt(2) - 48;
            boolean can = true;
            
            if(ewsn == 'E'){
                if(answer[1] + block >= x) continue;
                for(int i = answer[1]; i <= answer[1] + block; i++){
                    if(park[answer[0]].charAt(i) == 'X') {
                        can = false;
                        break;
                    }
                }
                if(can) answer[1] += block;
                System.out.println(s + " " + answer[0] + answer[1]);
                
            } else if(ewsn == 'W'){
                if(answer[1] - block < 0) continue;
                for(int i = answer[1]; i >= answer[1] - block; i--){
                    if(park[answer[0]].charAt(i) == 'X') {
                        can = false;
                        break;
                    }
                }
                if(can) answer[1] -= block;
                System.out.println(s + " " + answer[0] + answer[1]);
                
            } else if(ewsn == 'N'){
                if(answer[0] - block < 0) continue;
                for(int i = answer[0]; i >= answer[0] - block; i--){
                    if(park[i].charAt(answer[1]) == 'X') {
                        can = false;
                        break;
                    }
                }
                if(can) answer[0] -= block;
                System.out.println(s + " " + answer[0] + answer[1]);
                
            } else {
                if(answer[0] + block >= y) continue;
                for(int i = answer[0]; i <= answer[0] + block; i++){
                    if(park[i].charAt(answer[1]) == 'X') {
                        can = false;
                        break;
                    }
                }
                if(can) answer[0] += block;
                System.out.println(s + " " + answer[0] + answer[1]);
            }
            can = true;
        }
        return answer;
    }
}