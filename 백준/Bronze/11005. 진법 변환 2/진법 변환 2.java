import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num =  scanner.nextInt();
        int formation =  scanner.nextInt();

        String answer = "";

        while(num > 0){
            String s = String.valueOf(num % formation);
            if(num % formation >= 10) s = String.valueOf((char)('A' + (num % formation - 10)));
            answer = s + answer;
            num /= formation;
        };

        System.out.println(answer);

    }
}