import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while(true){
            int[] tri = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
            Arrays.sort(tri);

            if(tri[0] == 0 && tri[1] == 0 && tri[2] == 0) break;
            else if(tri[0] + tri[1] <= tri[2]) System.out.println("Invalid");
            else if(tri[0] == tri[1] && tri[0] == tri[2]) System.out.println("Equilateral");
            else if(tri[0] != tri[1] && tri[1] != tri[2]) System.out.println("Scalene");
            else System.out.println("Isosceles");
        }
    }
}