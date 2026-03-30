import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] coordinates = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 0; i < n; i++){
            coordinates[i] = Integer.parseInt(st.nextToken());
            set.add(coordinates[i]);
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;

        for(int x : set){
            map.put(x, idx++);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            sb.append(map.get(coordinates[i])).append(" ");
        }

        System.out.println(sb);
    }
}