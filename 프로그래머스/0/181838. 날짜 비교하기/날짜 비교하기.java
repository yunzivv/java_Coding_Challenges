class Solution {
    public int solution(int[] date1, int[] date2) {
        String day1 = "";
        String day2 = "";
        for(int i = 0; i < 3; i++){
            day1 += date1[i];
            day2 += date2[i];
        }

        if(Integer.parseInt(day1) < Integer.parseInt(day2)) return 1;
        return 0;
    }
}