import java.util.Scanner;

import static java.lang.System.exit;

public class LeapYear {
    public static boolean CheckYear(int year){
        if (year%4==0){
            if (year%100==0){
                if(year%400==0){
                    return true;
                }
                else return false;
            }
            else return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year= sc.nextInt();
        if (String.valueOf(year).length()!=4)exit(0);
        boolean res=CheckYear(year);
        if (res){
            System.out.printf("Year %d is a leap year.",year);
        }
        else System.out.printf("Year %d is not a leap year",year);
    }
}
