import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int big = 0;
        int row = 0;
        int col = 0;

        String[][] nums = new String[9][9];
        for (int i = 0; i < 9; i++) {
            nums[i] = sc.nextLine().split(" ");

        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (Integer.parseInt(nums[i][j]) > big) {
                    big = Integer.parseInt(nums[i][j]);
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(big);
        System.out.println((row+1) + " " + (col+1));
    }
}