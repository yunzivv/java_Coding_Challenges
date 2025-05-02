class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a = i; a <= j; a++){
            String[] check = String.valueOf(a).split("");
            for(int b = 0; b < check.length; b++){
                if(check[b].equals(String.valueOf(k))){
                    answer++;
                }
            }
        }
        return answer;
    }
}