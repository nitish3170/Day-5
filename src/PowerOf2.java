import java.util.Scanner;

import static java.lang.System.exit;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of N between 0 to 31");
        int n= sc.nextInt();
        if (n<0 || n>31){
            System.out.println("Enter value between 0 and 31");
            exit (0);
        }
        for (int i=0;i<n;i++){
            System.out.printf("2 ^ %d : %d\n",i,(int)Math.pow(2,i));
        }
    }
}
