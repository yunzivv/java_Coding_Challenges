class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int b = 1;
        int sum1 = 0;
        int sum2 = 0;

        for(int i = bin1.length() - 1; i >= 0; i--){
            if(bin1.charAt(i) == '1') sum1 += b;
            b *= 2;
        }
        b = 1;
        for(int i = bin2.length() - 1; i >= 0; i--){
            if(bin2.charAt(i) == '1') sum2 += b;
            b *= 2;
        }
        sum1 += sum2;
        while(sum1 > 0){
            if(sum1 % 2 == 0) answer = '0' + answer;
            else answer = '1' + answer;
            sum1 /= 2;
        }
        return answer == "" ? "0" : answer;
    }
}