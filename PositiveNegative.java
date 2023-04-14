package ConditionalStatements;


import java.util.Scanner;

//1. Write a Java program to get a number from the user and print whether it is positive or negative.
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int s1=sc.nextInt();
        if (s1>0){
            System.out.println(s1 +" is a positive number");
        } else if (s1<0) {
            System.out.println(s1+" is a negative number");
        } else if (s1==0) {
            System.out.println(s1+ " is zero");
        }
    }
}
