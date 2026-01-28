import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int answer = 0;
        int count = sc.nextInt();
        int[][] papers =  new int[count][2];
        for (int i = 0; i < count; i++) {
            papers[i][0] = sc.nextInt();
            papers[i][1] = sc.nextInt();
        }

        int[][] paper = new int[100][100];
        for(int i = 0; i < papers.length; i++){
            for(int j = papers[i][0]; j < papers[i][0] + 10; j++){
                for(int k = papers[i][1]; k < papers[i][1] + 10;k++){
                    paper[j][k] = 1;
                }
            }
        }

        for(int i = 0; i < paper.length; i++){
            for(int j = 0; j < paper.length; j++){
                if(paper[i][j] == 1) answer++;
            }
        }

        System.out.println(answer);
    }
}