class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] lengths = new int[100000];
        for (String s : strArr) {
            lengths[s.length()]++;
        }
        for(int i : lengths) {
            if(answer < i) answer = i;
        }

        return answer;
    }
}