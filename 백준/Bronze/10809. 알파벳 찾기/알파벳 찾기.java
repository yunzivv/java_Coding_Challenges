import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] alphabet = new int[26];
        for(int i = 0; i < alphabet.length; i++){
            alphabet[i] = -1;
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(alphabet[c-97] == -1){
                alphabet[c-97] = i;
            }
        }
        for(int i = 0; i < alphabet.length; i++){
            System.out.print(alphabet[i] + " ");
        }

    }

}