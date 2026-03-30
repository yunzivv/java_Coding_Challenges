import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int shom = 665;

        while(n != cnt){
            shom++;

            String s = String.valueOf(shom);
            if(s.contains("666"))cnt++;
        }

        System.out.println(shom);
    }

}