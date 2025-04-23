import java.util.*;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        double[] arr = Stream.of(sc.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        double max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) max = arr[i];
        }
        double sum = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = arr[i]/max*100;
            sum += arr[i];
        }

        System.out.println(sum/n);
    }
}