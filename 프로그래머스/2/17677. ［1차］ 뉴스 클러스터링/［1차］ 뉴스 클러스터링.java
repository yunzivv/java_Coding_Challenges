import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int intersection = 0;
        
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        for(int i = 0; i < str1.length() - 1; i++){
            String a = upper(str1, i);
            String b = upper(str1, i + 1);
            if(a.matches("[a-zA-Z]") && b.matches("[a-zA-Z]")) list1.add(a+b);
        }
        
        for(int i = 0; i < str2.length() - 1; i++){
            String a = upper(str2, i);
            String b = upper(str2, i + 1);
            
            if(a.matches("[a-zA-Z]") && b.matches("[a-zA-Z]")) list2.add(a+b);
        }
        
        if(list1.size() == 0 && list2.size() == 0) return 65536;
        for(String s : list1){
            if(list2.contains(s)){
                intersection++;
                list2.remove(s);
            }
        }
            
        return (int)(intersection * 1.0 / (list1.size() + list2.size()) * 65536);
    }
    
    public String upper(String s, int i) { return String.valueOf(s.charAt(i)).toUpperCase(); }
}