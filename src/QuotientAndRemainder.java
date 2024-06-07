import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dividend ");
        int divd= sc.nextInt();
        System.out.println("Enter the divisor ");
        int div= sc.nextInt();
        System.out.printf("Qoutient : %d\n",divd/div);
        System.out.printf("Remainder : %d",divd%div);
    }
}
