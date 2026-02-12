import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int idx = 1;

        for(int i = 1; i <= n; i++){
            if(idx >= n) {
                System.out.println(i);
                break;
            }
            idx += i * 6;
        }
    }
}