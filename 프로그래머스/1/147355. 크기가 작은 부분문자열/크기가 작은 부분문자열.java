class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        for(int i = 0; i <= t.length() - pLen; i++){
            if(Long.parseLong(p) >= Long.parseLong(t.substring(i, i + pLen))) answer++;
        }
        return answer;
    }
}