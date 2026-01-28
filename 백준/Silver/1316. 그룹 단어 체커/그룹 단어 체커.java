import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] words = new String[size];

        for(int i = 0; i < size; i++){
            words[i] = sc.next();
        }

        int answer = 0;

        for(int i = 0; i < words.length; i++){
            int[] alpha = new int[26];
            char before = 0;
            answer ++;
            for(char c : words[i].toCharArray()){
                if(before==c){continue;}
                alpha[c - 'a']++;
                before = c;
                if(alpha[c - 'a'] > 1) {
                    answer--;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
