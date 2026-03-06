import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String n = String.valueOf(sc.nextInt());
        int[] arr = new int[n.length()];
        int idx = 0;

        for(char c : n.toCharArray()) {arr[idx++] = c - '0';}

        Arrays.sort(arr);

        for(int i = n.length()-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}