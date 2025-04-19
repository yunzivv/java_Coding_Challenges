class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = arr;
        
        for(int[]query : queries){
            for(int s = query[0]; s <= query[1]; s++){
                answer[s]++;
            }
        }
        return answer;
    }
}