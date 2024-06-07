import java.util.Scanner;

public class TwoDimensionalArray {
    public static void PopulateArray(int[][] array,int rows,int columns){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of array");
        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                array[i][j]=sc.nextInt();
            }
        }
    }
    public static void PrintArray(int [][] array,int rows,int columns){
        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number if rows: ");
        int rows= sc.nextInt();
        System.out.println("Enter number of columns: ");
        int columns= sc.nextInt();
        int [][] array=new int[rows][columns];
        PopulateArray(array,rows,columns);
        PrintArray(array,rows,columns);
    }
}
