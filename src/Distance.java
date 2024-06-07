import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x coordinate");
        float x= sc.nextInt();
        System.out.println("Enter the y coordinate");
        float y= sc.nextInt();
        double dist=Math.sqrt(Math.pow(x,x)+Math.pow(y,y));
        System.out.printf("Distance between (0,0) and (%.0f,%.0f) is : %f",x,y,dist);
    }
}
