import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());

        int min = -1;
        int sum = 0;

        for (int i = n; i <= m; i++) {
            if(isPrime(i)) {
                if(min == -1) min = i;
                sum += i;
            }
        }

        if(min != -1) System.out.println(sum);
        System.out.println(min);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n <= 3) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}