import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] log = br.readLine().split(" ");
            if(log[1].startsWith("e")) set.add(log[0]);
            else set.remove(log[0]);
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        
        for(String leave : list){
            System.out.println(leave);
        }
    }
}