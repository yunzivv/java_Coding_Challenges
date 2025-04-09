class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if(ele >= 50 && ele % 2 == 0){
                ele /= 2;
            }else if(ele < 50 && ele % 2 == 1){
                ele *= 2;
            }
            answer[i] = ele;
        }
        return answer;
    }
}