import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int h = sc.nextInt(), w = sc.nextInt();

        int minX = Math.min(Math.abs(h - x), Math.abs(0 - x));
        int minY = Math.min(Math.abs(w - y), Math.abs(0 - y));

        System.out.println(Math.min(minX, minY));
    }
}