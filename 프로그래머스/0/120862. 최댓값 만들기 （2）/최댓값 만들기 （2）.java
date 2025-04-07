class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int temp = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        if(numbers[0] * numbers[1] > numbers[numbers.length-1]*numbers[numbers.length-2]) {
            answer = numbers[0] * numbers[1];
        } else {
            answer =numbers[numbers.length-1]*numbers[numbers.length-2];
        }
        return answer;
    }
}