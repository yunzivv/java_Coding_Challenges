import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m >= 45) {
            System.out.println(h);
            System.out.println(m - 45);
        }  else {
            h -= 1;
            if (h == -1) {
                h = 23;
            }
            m = m + 15;
            System.out.println(h);
            System.out.println(m);
        }

    }
}