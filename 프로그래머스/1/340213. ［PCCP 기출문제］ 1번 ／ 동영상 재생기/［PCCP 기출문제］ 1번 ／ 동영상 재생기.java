import java.util.Arrays;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        int len = Integer.parseInt(video_len.replace(":", ""));
        int start = Integer.parseInt(op_start.replace(":", ""));
        int end = Integer.parseInt(op_end.replace(":", ""));        
        
        int[] now = Arrays.stream(pos.split(":"))
                         .mapToInt(Integer::parseInt)
                         .toArray();
        
        int n = now[0] * 100 + now[1];
        
        for(String s : commands){
            if(start <= n && end >= n){
                now[0] = end / 100;
                now[1] = end % 100;
                System.out.println("skip: " + now[0] + ":" + now[1]);
            }
            if(s.startsWith("n")){
                now[0] += (now[1] + 10) / 60;
                now[1] = (now[1] + 10) % 60;
                
                if(now[0] * 100 + now[1] > len){
                    now[0] = len / 100;
                    now[1] = len % 100;
                }
                System.out.println("next: " + now[0] + ":" + now[1]);
            } else {
                if(now[1] < 10) {
                    now[0]--;
                    now[1] += 50;
                }else now[1] -= 10;
                if(now[0] * 100 + now[1] < 0){
                    now[0] = 0;
                    now[1] = 0;
                }
                System.out.println("prev: " + now[0] + ":" + now[1]);
            }
            n = now[0] * 100 + now[1];
        }
        if(start <= n && end >= n){
                now[0] = end / 100;
                now[1] = end % 100;
            }
        
        
        return (now[0] < 10 ? "0" + now[0] : now[0]) 
            + ":" 
            + (now[1] < 10 ? "0" + now[1] : now[1]) ;
    }
}