import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] s = new String[5][16];
        for (int i = 0; i < 5; i++) {
            s[i] = sc.nextLine().split("");

        }
        for(int j = 0; j < 15; j++) {
            for(int i = 0; i < 5; i++) {
                try{
                    if(s[i][j] != null) {
                        System.out.print(s[i][j]);
                    }
                }catch(Exception e){
                    continue;
                }

            }
        }
    }
}