import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();

        if(p1 + p2 + p3 != 180) System.out.println("Error");
        else if(p1 == p2 && p1 == 60) System.out.println("Equilateral");
        else if(p1 == p2 || p1 == p3 || p2 == p3) System.out.println("Isosceles");
        else System.out.println("Scalene");
    }
}