import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();

        int reOne = 0;
        int reTwo = 0;
        for(int i = 1; i <= 3; i++) {
            reOne += one % 10;
            reTwo += two % 10;
            one /= 10;
            two /= 10;
            if(i == 3) break;
            reOne *= 10;
            reTwo *= 10;
        }
        System.out.println(reOne > reTwo ? reOne : reTwo);
    }
}