import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dots = new int[n][2];

        for(int i = 0; i < n; i++) {
            dots[i][0] = sc.nextInt();
            dots[i][1] = sc.nextInt();
        }

        Arrays.sort(dots, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        for (int[] i : dots) {
            System.out.println(i[0] + " " + i[1]);
        }
    }
}