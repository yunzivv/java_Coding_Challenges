import java.util.* ;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String myString) {
        String[] a = myString.split("x");
        
        List<String> list = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            list.add(a[i]);
        }
        Collections.sort(list);
        while(list.remove("")) {};
        String answer[] = list.toArray(new String[list.size()]);
        
        return answer;
    }
}