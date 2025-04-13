class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 1;
        int index = 1;
        if(my_string.length() >= is_suffix.length()){
            for(int i = 0; i < is_suffix.length(); i++){
                if(my_string.charAt(my_string.length() - index) != is_suffix.charAt(is_suffix.length() - index)){
                    return 0;
                }
                index++;
            }
        }else {
            return 0;   
        }
        return answer;
    }
}