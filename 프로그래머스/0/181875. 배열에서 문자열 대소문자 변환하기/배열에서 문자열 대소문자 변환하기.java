class Solution {
    public String[] solution(String[] strArr) {
        
        String[] answer = new String[strArr.length];
        
        for(int i = 0; i < strArr.length; i++){
            String str = "";
            char s;
            if ((i + 1) % 2 != 0) { // 홀수
                for(int stri = 0; stri < strArr[i].length(); stri++){
                    s = strArr[i].charAt(stri);
                    if(strArr[i].charAt(stri) < 'a'){
                        s += 32;
                    }
                    str += s;    
                }
                answer[i] = str;
                
            } else { // 짝수
                for(int stri = 0; stri < strArr[i].length(); stri++){
                    s = strArr[i].charAt(stri);
                    if(strArr[i].charAt(stri) > 'Z'){
                        s -= 32;
                    }
                    str += s;    
                }
                answer[i] = str;
            }
        }
        return answer;
    }
}