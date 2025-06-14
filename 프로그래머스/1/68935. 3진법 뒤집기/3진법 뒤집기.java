class Solution {
    public int solution(int n) {
        String three = Integer.toString(n, 3);
        String reverse = "";
        for(int i = three.length() - 1; i >= 0; i--) {
            reverse = reverse + three.substring(i, i + 1);
        }
        int answer = Integer.parseInt(reverse, 3);
        return answer;
    }
}