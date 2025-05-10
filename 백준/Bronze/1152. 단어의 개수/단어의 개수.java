import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] words = s.split(" ");
        if(words[0].equals("")) System.out.println(0);
        else System.out.println(words.length);
    }
}