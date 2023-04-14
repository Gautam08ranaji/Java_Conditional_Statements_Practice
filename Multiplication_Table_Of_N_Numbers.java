package ConditionalStatements;
//13. Write a program in Java to display the multiplication table of a given integer.
import java.util.Scanner;

public class Multiplication_Table_Of_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to generate the multiplication Tablle");
        int n = sc.nextInt();
        int table =0;
        for (int i = 1; i <=10 ; i++) {
            table = n*i;
            System.out.println(n+" X "+i+" = "+ table);
        }
    }
}
