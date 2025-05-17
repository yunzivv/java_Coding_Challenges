class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int cha = common[1] - common[0];
        int last = common.length - 1;
        
        if(common[1] + cha == common[2]){
             answer = common[last] + cha;
        } else {
            answer = common[last] * (common[1] / common[0]);
        }
        
        return answer;
    }
}