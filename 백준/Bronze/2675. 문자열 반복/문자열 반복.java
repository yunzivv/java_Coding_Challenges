import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            str[i] = sc.nextLine().trim();
        }

        for(int i = 0; i < n; i++) {
            String string = "";
            for(int j = 0; j < str[i].length(); j++) {
                for(int k = 0; k < arr[i]; k++) {
                    string += str[i].charAt(j);
                }
            }
            System.out.println(string);
        }
    }
}