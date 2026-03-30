import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s.split(" ")[0]);
        int m = Integer.parseInt(s.split(" ")[1]);

        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(br.readLine());
        }

        for(int i = 0; i < m; i++){
            if(set.contains(br.readLine())) answer++;
        }

        System.out.println(answer);
    }
}