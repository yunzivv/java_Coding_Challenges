class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] a = letter.split(" ");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < morse.length; j++){
                if(a[i].equals(morse[j])){
                    answer += (char)(j+97);
                    break;
                }
            }
        }
        return answer;
    }
}