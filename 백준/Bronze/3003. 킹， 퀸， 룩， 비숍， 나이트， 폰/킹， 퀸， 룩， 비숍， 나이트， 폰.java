import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int king = sc.nextInt();
        int queen = sc.nextInt();
        int rook = sc.nextInt();
        int bishop = sc.nextInt();
        int night = sc.nextInt();
        int pawn = sc.nextInt();

        System.out.print((king - 1)*-1 + " ");
        System.out.print((queen - 1)*-1 + " ");
        System.out.print((rook - 2)*-1 + " ");
        System.out.print((bishop - 2)*-1 + " ");
        System.out.print((night - 2)*-1 + " ");
        System.out.print((pawn - 8)*-1);
    }
}