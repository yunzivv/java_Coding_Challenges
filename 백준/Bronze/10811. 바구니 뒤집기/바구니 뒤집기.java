import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] basket = new int[n];

        for (int i = 0; i < n; i++) basket[i] = i + 1;

        for (int k = 0; k < m; k++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            while (i < j) {
                int tmp = basket[i];
                basket[i] = basket[j];
                basket[j] = tmp;
                i++; j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(basket[i]);
            if (i < n - 1) sb.append(' ');
        }
        System.out.print(sb.toString());
    }
}