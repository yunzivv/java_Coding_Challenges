class Solution {
    public int[] solution(String my_string) {
        int[] array = new int[100];
        int a = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) - 48>= 0 && (int)my_string.charAt(i)  - 48 <= 9) {
                array[a] = (int)my_string.charAt(i)-48;
                a++;
            }
        }
        int[] answer = new int[a];
        int temp = 0;
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < a; j++) {
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < a; i++) {
            answer[i] = array[i];
        }
        
        return answer;
    }
}