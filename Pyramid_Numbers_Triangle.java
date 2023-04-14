package ConditionalStatements;
//16 Write a program in Java to print such pattern like a pyramid with a number which will repeat the number in the same
// row
import java.util.Scanner;

public class Pyramid_Numbers_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
