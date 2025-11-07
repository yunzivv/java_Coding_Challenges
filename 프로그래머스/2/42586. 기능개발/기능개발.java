import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> rs = new ArrayList<>();
        int len = progresses.length;
        int job = 0;
        
        List<Integer> progress = Arrays.stream(progresses)                        
                                .boxed()                        
                                .collect(Collectors.toList());
        
        List<Integer> speed = Arrays.stream(speeds)                        
                                .boxed()                        
                                .collect(Collectors.toList());
        
        while(progress.size() > 0){
            if(progress.get(0) >= 100){
                job++;
                progress.remove(0);
                speed.remove(0);
            } else {   
                if(job != 0){
                    rs.add(job);
                    job = 0;
                }
                for(int i = 0; i < progress.size(); i++){
                    progress.set(i, progress.get(i) + speed.get(i));
                }
            }
            
        }
        rs.add(job);
        int[] answer = rs.stream()
                .mapToInt(i -> i)
                .toArray();
        
        return answer;
    }
}