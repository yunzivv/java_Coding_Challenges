class Solution {
    public int[] solution(int[] arr, int n) {
        int a = arr.length;
        int[] answer = new int[a];
        if(a % 2 == 0){
            for(int i = 0; i < a; i++){
                if(i % 2 == 1){
                    arr[i] += n;
                }
                answer[i] = arr[i];
            }
        } else {
            for(int i = 0; i < a; i++){
               if(i % 2 == 0){
                    arr[i] += n;
                }
                answer[i] = arr[i]; 
            }
        }
        return answer;
    }
}