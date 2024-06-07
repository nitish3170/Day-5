import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        if (n%2==0){
            System.out.printf("%d is Even",n);
        }
        else System.out.printf("%d is Odd",n);
    }
}
