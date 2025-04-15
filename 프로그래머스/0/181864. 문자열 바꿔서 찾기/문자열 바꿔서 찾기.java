class Solution {
    public int solution(String myString, String pat) {
        String check = "";
        for(int i = 0; i < myString.length(); i ++){
            char a = myString.charAt(i);
            if(a == 'A'){
                a += 1;
            }else {
                a -= 1;
            }
            check += a;
        }
        if(check.contains(pat)){
            return 1;
        } else {
            return 0;
        }
    }
}