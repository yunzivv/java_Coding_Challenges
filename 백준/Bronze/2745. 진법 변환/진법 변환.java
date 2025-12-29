import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String num =  scanner.next();
        int formation =  scanner.nextInt();

        long answer = 0;
        int nth = 0;

        for(int i = num.length() - 1; i >= 0; i--){
            int n;
            if(num.charAt(i) >= 'A') n = num.charAt(i) - 55;
            else n = Integer.parseInt(num.substring(i, i + 1));

            answer += Math.pow(formation, nth++) * n;
        }

        System.out.println(answer);
    }
}