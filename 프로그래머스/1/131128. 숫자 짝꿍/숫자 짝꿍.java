class Solution {
    public String solution(String X, String Y) {
        
        StringBuilder sb = new StringBuilder();
        
        String answer = "";
        int[] alpha = new int[26];
        int[] alpha2 = new int[26];
        
        for(char c : X.toCharArray()){
            alpha[c - 48]++;
        }
        for(char c : Y.toCharArray()){
            if(alpha[c - 48] != 0 && alpha[c - 48] > alpha2[c - 48]) alpha2[c - 48]++;
        }
        
        for (int i = 9; i >= 0; i--) {
            while (alpha2[i]-- > 0) {
                sb.append(i);
            }
        }

        if (sb.length() == 0) return "-1";
        if (sb.charAt(0) == '0') return "0";

        return sb.toString();
    }
}