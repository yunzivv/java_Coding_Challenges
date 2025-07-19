class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")){
            int count1 = s.length();
            String s1 = s.replace("0","");
            int count2 = s1.length();
            answer[1] += count1 - count2;
            s = Integer.toBinaryString(count2);
            answer[0]++;
        }
        return answer;
    }
}