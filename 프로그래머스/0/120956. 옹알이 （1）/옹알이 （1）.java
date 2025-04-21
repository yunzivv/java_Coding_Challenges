class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possible = {"aya", "ye", "woo", "ma"};
        for(int i = 0; i < babbling.length; i++){
            String str = babbling[i];
            for(int j = 0; j < 4; j++){
                if(babbling[i].contains(possible[j])){
                    str = str.replaceFirst(possible[j], "");
                }
            }
            if(str.length() == 0) answer++;     
        }
        return answer;
    }
}