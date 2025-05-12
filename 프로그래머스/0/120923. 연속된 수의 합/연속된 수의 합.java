class Solution {
    public int[] solution(int num, int total) {

        int check = 0;
        boolean isZero = false;
        int[] answer = new int[num];
        if(total == 0){
            isZero = true;
            check = num/2*-1;
        }

        for(int i = 1; i <= total - num; i++){
            if(isZero) break;
            int sum = 0;
            int plus = i;
            for(int j = 0; j < num; j++){
                sum += plus;
                plus++;
            }
            if(sum == total){
                check = i;
                break;
            }
        }

        if(check == 0){
            check = total;
            while(true){
                if(isZero) break;
                int a = 0;
                int sum = 0;
                for(int i = check; i > check - num; i--){
                    sum += i;
                    a = i;
                }
                if(sum == total) {
                    check = a;
                    break;
                }
                check--;
            }
        }

        for(int i = 0; i < num; i++){
            answer[i] = check++;
        }

        return answer;
    }
}