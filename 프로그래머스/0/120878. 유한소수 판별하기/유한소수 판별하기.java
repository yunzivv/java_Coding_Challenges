class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int d = 1;
        while(d != 0){
            a /= d;
            b /= d;
            d = div(a, b);
        }

        while(true){
            if(b % 5 == 0) b /= 5;
            else if(b % 2 == 0) b /= 2;
            else if(b == 1)return 1;
            else return 2;
        }
    }

    public int div(int a, int b){
        int small = a;
        int big = b;
        if(a > b){
            small = b;
            big = a;
        }
        for(int i = small; i > 1; i--) {
            if (small % i == 0 && big % i == 0) return i;
        }
        return 0;
    }
}