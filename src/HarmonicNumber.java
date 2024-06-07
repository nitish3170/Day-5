import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N ");
        int n= sc.nextInt();
        float res=0;
        for (int i=1;i<n;i++){
            res+=(float)1/i;
        }
        System.out.printf("%d th Harmonic number: %f",n,res);
    }
}
