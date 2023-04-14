package ConditionalStatements;
//11. Write a program in Java to input 5 numbers from keyboard and find their sum and average
import java.util.Scanner;

public class AverageOfN_Numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double n = 5,sum=0;


        System.out.println("the input 5 numbers are:");
        for (int i = 1; i <=n ; i++) {
            System.out.println(i);
            sum +=i;
        }
        System.out.println("the sum of 5 numbers are: "+sum);
        double avg = sum/n;
        System.out.println("the average of  numbers are "+avg);
    }
}
