import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(a < 68) answer += 3;
            else if(a < 71) answer += 4;
            else if(a < 74) answer += 5;
            else if(a < 77) answer += 6;
            else if(a < 80) answer += 7;
            else if(a < 84) answer += 8;
            else if(a < 87) answer += 9;
            else if(a < 91) answer += 10;
        }
        System.out.println(answer);
    }
}