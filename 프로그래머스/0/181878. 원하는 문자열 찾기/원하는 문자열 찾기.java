class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char c;
        char c2;
        String m = "";
        String p = "";
        for(int i = 0; i < myString.length(); i++){
            c = myString.charAt(i);
            if(c < 'a'){
                c += 32;
            }
            m += c;
        }
        for(int i = 0; i < pat.length(); i++){
            c2 = pat.charAt(i);
            if(c2 < 'a'){
                c2 += 32;
            }
            p += c2;
        }
        
        if(m.contains(p)){
            answer = 1;
        }
        
        return answer;
    }
}