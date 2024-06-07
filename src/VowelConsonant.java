import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character :");
        char c=sc.nextLine().charAt(0);
        char ch=Character.toUpperCase(c);
        if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')System.out.printf("%s is VOWEL",c);
        else System.out.printf("%s is CONSONANT",c);
    }
}
