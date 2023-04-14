package ConditionalStatements;
// 9 .
// Write a program in Java to display n terms of natural numbers and their sum
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter the number");
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            System.out.println(i);
            sum+= i;
        }
        System.out.println("the  sum of "+ input+" natural numbers are "+ sum);

    }
}
