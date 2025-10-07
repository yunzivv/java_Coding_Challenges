import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        String[] tuple = s.substring(2, s.length() - 2).split("\\},\\{");
        
        Arrays.sort(tuple, (a, b) -> a.length() - b.length());
        
        List<Integer> list = new ArrayList<>();
        
        for(String element : tuple){
            for(String numStr : element.split(",")){
                int num = Integer.parseInt(numStr);
                if(!list.contains(num)) list.add(num);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}