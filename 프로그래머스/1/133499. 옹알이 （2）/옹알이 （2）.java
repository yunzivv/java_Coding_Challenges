class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String s : babbling){
            if(s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")) continue;
            s = s.replace("aya", "1");
            s = s.replace("ye", "1");
            s = s.replace("woo", "1");
            s = s.replace("ma", "1");
            s = s.replace("1","");
            if(s.length() == 0) answer++;
        }
        return answer;
    }
}