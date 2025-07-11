import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        for(int i = 1; i <= star; i++) {
            for(int j = star; j > i; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
                if(j != 0)System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= star-1; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = star; j > i; j--) {
                System.out.print("*");
                if(j != star)System.out.print("*");
            }
            System.out.println();
        }
    }
}