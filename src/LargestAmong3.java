import java.util.Scanner;

public class LargestAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        int largest;
         if (a>=b && a>=c)largest=a;
         else if (b>=a && b>=c)largest=b;
         else largest=c;
        System.out.printf("%d is the largest",largest);
    }
}
