
import java.util.Scanner;

import static java.lang.System.exit;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of coin flip: ");
        int n= sc.nextInt(),tails=0,heads=0;
        if (n<0)exit(0);
        for (int i=0;i<n;i++){
            double res=Math.random();
            if (res<0.5){
                tails++;
            }
            else{
                heads++;
            }
        }
        float HeadP=(float)(heads*100)/n;
        float TailsP=(float)(tails*100)/n;
        System.out.printf("Percentage of heads: %f",HeadP);
        System.out.printf("Percentage of tails: %f",TailsP);
    }
}
