class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 1;
        if(my_string.length() > is_prefix.length()){
            for(int i = 0; i < is_prefix.length(); i++){
                if(my_string.charAt(i) != is_prefix.charAt(i)){
                    return 0;
                }
            }
        }else {
            return 0;   
        }
        return answer;
    }
}