import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a= sc.nextInt();
        System.out.println("Enter second number : ");
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.printf("First number after swapping : %d",a);
        System.out.printf("Second number after swapping : %d",b);
    }
}
