package ConditionalStatements;
//14. Write a program in Java to display the n terms of odd natural number and their sum.
import java.util.Scanner;

public class Odd_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int sum=0;
        int n = sc.nextInt();

        for (int i = 1; i <n ; i++) {
            sum = 2*i-1;
            System.out.println(sum);

        }
    }
}
