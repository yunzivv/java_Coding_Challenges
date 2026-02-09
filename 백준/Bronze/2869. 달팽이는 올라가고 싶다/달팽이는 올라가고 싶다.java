import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int up =  sc.nextInt();
        int down =  sc.nextInt();
        int goal = sc.nextInt();

        BigDecimal bigGoal = BigDecimal.valueOf(goal);
        BigDecimal bigUp   = BigDecimal.valueOf(up);
        BigDecimal bigStep = BigDecimal.valueOf(up - down);

        BigDecimal answer;
        if (goal <= up) {
            answer = BigDecimal.ONE;
        } else {
            answer = bigGoal.subtract(bigUp)
                    .divide(bigStep, 0, RoundingMode.CEILING)
                    .add(BigDecimal.ONE);
        }

        System.out.println(answer.toBigInteger());
    }
}