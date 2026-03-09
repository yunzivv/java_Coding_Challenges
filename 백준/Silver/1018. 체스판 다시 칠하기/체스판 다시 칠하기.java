import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] board = new String[n];
        for(int i = 0; i < n; i++){
            board[i] = sc.next();
        }

        int check = 250;


        for(int x = 0; x <= n - 8; x++){
            for(int y = 0; y <= m - 8; y++){

                int w = 0;
                int b = 0;

                for(int i = x; i < x + 8; i++){
                    for(int j = y; j < y + 8; j++){

                        if((i + j) % 2 == 0){
                            if(board[i].charAt(j) != 'W') w++;
                            if(board[i].charAt(j) != 'B') b++;
                        } else {
                            if(board[i].charAt(j) != 'B') w++;
                            if(board[i].charAt(j) != 'W') b++;
                        }
                    }
                }

                check = Math.min(check, Math.min(w, b));
            }
        }

        System.out.println(check);
    }
}