import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int[][] map = new int [sc.nextInt()][2];

        for(int i = 0; i < map.length; i++){
            map[i][0] = sc.nextInt();
            map[i][1] = sc.nextInt();
        }

        int minX = 100_000, maxX = -100_000, minY = 100_000, maxY = -100_000;

        for(int[] m : map){
            if(m[0] < minX) minX = m[0];
            if(m[0] > maxX) maxX = m[0];
            if(m[1] < minY) minY = m[1];
            if(m[1] > maxY) maxY = m[1];
        }

        System.out.println((maxX - minX) * (maxY - minY));
    }
}