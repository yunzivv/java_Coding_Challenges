class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 1;
        if(arr2.length > arr1.length){
            answer = -1;
        } else if (arr2.length == arr1.length){
            int one = 0;
            for(int i = 0; i < arr1.length; i++){
                one += arr1[i];
            }
            int two = 0;
            for(int i = 0; i < arr1.length; i++){
                two += arr2[i];
            }
            if(one > two){
                answer = 1;
            } else if(two > one){
                answer = -1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}