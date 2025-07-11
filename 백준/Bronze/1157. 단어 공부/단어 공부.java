import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] ascii = new int[26];

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                ascii[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                ascii[c - 'a']++;
            }
        }
        int[] ascii2 = ascii.clone();
        Arrays.sort(ascii2);
        if (ascii2[25] == ascii2[24]) {
            System.out.println("?");
            return;
        }
        int big = 0;
        char c = 'a';
        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i] > big) {
                big = ascii[i];
                c = (char) (i + 65);
            }


        }
        System.out.println(String.valueOf(c));
    }
}