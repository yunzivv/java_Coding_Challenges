import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] numbers = new int[Integer.parseInt(s.split(" ")[0])];
        int cut = Integer.parseInt(s.split(" ")[1]);
        String nums = sc.nextLine();
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(nums.split(" ")[i]);
        }
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - cut]);

    }
}