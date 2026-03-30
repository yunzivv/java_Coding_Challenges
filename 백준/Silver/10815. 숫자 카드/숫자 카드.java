import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] cards = new int[20_000_000];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            cards[Integer.parseInt(st.nextToken()) + 10_000_000] = 1;
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++){
            if(cards[Integer.parseInt(st.nextToken()) + 10_000_000] == 1){
                sb.append(1).append(" ");
            }else sb.append(0).append(" ");
        }

        System.out.println(sb);
    }
}