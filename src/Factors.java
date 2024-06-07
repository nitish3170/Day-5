import java.util.Scanner;

public class Factors {
    public static boolean CheckPrime(int n) {
        int flag=0;
        for (int i=2;i<(float)Math.sqrt(n);i++){
            if (n%i==0){
                flag=1;
            }
        }
        if (flag==1) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= sc.nextInt();
        System.out.println("Prime Factors :");
        for (int i=2;i*i<=n;i++){
            if (n%i==0 && CheckPrime(i)){
                System.out.println(i);
                int fac2=n/i;
                if (i!=fac2 && n%fac2==0 && CheckPrime(fac2)) {
                    System.out.println(fac2);
                }
            }
        }
        if(CheckPrime(n)){
            System.out.println(n);
        }
    }
}
