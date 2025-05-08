import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String A = "";
        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            if(c > 'Z') A += (char)(c - 32);
            else A += (char)(c + 32);
        }
        System.out.print(A);
    }
}