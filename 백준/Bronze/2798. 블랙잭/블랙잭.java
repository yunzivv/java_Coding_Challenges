import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int ans = 0;

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] nums = new int[N];
        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < N - 2; i++){
            for(int j = i + 1;  j < N - 1; j++){
                for(int k = j + 1; k < N; k++){
                    if(nums[i] + nums[j] + nums[k] <= M) ans = Math.max(ans, nums[i] + nums[j] + nums[k]);
                }
            }
        }

        System.out.println(ans);
    }
}