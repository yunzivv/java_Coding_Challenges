import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] returns = new int[count];
        int[][] coins = new int[count][4];

        for(int i = 0; i < returns.length; i++){
            returns[i] = sc.nextInt();
        }

        for(int i = 0; i < count; i++){
            coins[i][0] = returns[i] / 25;
            returns[i] %= 25;
            coins[i][1] = returns[i] / 10;
            returns[i] %= 10;
            coins[i][2] = returns[i] / 5;
            coins[i][3] = returns[i] % 5;
        }

        for(int i = 0; i < coins.length; i++){
            for(int j = 0; j < coins[i].length; j++){
                System.out.print(coins[i][j]);
                if(j != coins[i].length - 1) System.out.print(" ");
            }
            System.out.println();
        }

    }
}