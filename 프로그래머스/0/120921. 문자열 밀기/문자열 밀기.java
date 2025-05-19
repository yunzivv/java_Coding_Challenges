class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)) return 0;
        int count = 0;
        for(int i = 1; i <= A.length(); i++) {
            String s = "";
            count++;
            s = A.substring(0, B.length()-i);
            s = A.substring(B.length()-i) + s;
            if(B.equals(s)) return count;
        }
        return -1;
    }
}