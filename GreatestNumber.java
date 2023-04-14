package ConditionalStatements;

import java.util.Scanner;

//2.Take three numbers from the user and print the greatest number.
// This code is Written by GAUTAM RANA
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter 1 number");
        int num1= Sc.nextInt();
        System.out.println("enter 2 number");
        int num2= Sc.nextInt();
        System.out.println("enter 3 number");
        int num3= Sc.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println(num1 + " num1 is greater then "+ num2 +" and "+ num3);
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2 + " num 2 is greater then "+ num1 +" and "+ num3);
        }else {
            System.out.println(num3 + " num3 is greater then "+ num1 +" and "+ num2);
        }

    }
}
