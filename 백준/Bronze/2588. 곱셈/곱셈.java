import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int hundred = (b / 100); // 100의 자리수 구하기
        int ten = ((b - hundred*100) / 10); // 10의 자리수 구하기
        int one = b - hundred * 100 - ten * 10; // 1의 자리수 구하기

        System.out.println(a * one);
        System.out.println(a * ten);
        System.out.println(a * hundred);
        System.out.println(a * b);


    }
}