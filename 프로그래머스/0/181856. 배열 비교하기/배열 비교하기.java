class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr2.length == arr1.length){
            int one = 0;
            int two = 0;
            for(int i = 0; i < arr1.length; i++){
                one += arr1[i];
                two += arr2[i];
            }
            return one > two ? 1 : two > one ? -1 : 0;
        }
        return arr1.length > arr2.length ? 1 : -1;
    }
}