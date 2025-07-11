import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.replaceAll("c=", "1");
        s = s.replaceAll("c-", "2");
        s = s.replaceAll("dz=", "3");
        s = s.replaceAll("d-", "4");
        s = s.replaceAll("lj", "5");
        s = s.replaceAll("nj", "6");
        s = s.replaceAll("s=", "7");
        s = s.replaceAll("z=", "8");

        System.out.println(s.length());
    }
}