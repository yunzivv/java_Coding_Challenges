import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumprice = sc.nextInt();
        int totalcount = sc.nextInt();
        int[] receiptlist = new int[totalcount * 2];

        int checkprice = 0;
        int lastindex = 0;

        for (int i = 0; i < totalcount * 2; i++) {
            receiptlist[i] = sc.nextInt();
        }

        for (int i = 0; i < totalcount; i++){
            checkprice += receiptlist[lastindex] * receiptlist[lastindex+1];
            lastindex += 2;
        }
        if (checkprice == sumprice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}