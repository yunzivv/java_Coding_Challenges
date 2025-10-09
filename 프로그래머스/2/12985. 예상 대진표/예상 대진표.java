

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        
        while(a != b){
        
            if(a == b) break;
            System.out.println("a: " + a + " b: " + b);
            a = (int) Math.ceil(a / 2.0);
            b = (int) Math.ceil(b / 2.0);
            answer++;
        }

        return --answer;
    }
}