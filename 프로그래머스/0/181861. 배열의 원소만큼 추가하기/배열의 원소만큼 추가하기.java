class Solution {
    public int[] solution(int[] arr) {
        int count = 0;
        for(int i : arr){
            for(int a = 0; a < i; a++){
                count++;
            }
        }
        
        int[] answer = new int[count];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            for(int a = 0; a < arr[i]; a++){
                answer[index] = arr[i];
                index++;
            }
        }
        
        return answer;
    }
}