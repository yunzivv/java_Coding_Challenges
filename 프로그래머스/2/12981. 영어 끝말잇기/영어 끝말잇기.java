class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
 
        for(int i = 1; i < words.length; i++){
            boolean flag = false;
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            for(int j = 0; j < i; j++){
               if(words[i].equals(words[j])){
                   System.out.println("hel");
                    flag = true;
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    break;
               }
            }
            if(flag) break;
        }

        return answer;
    }
}