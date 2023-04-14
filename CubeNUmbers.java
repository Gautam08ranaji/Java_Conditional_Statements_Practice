package ConditionalStatements;

import java.util.Scanner;

//12. Write a program in Java to display the cube of the number upto given an integer.
public class CubeNUmbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Hey Gautam, plz the number");
        int sum=0;
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            sum = i*i*i;
            System.out.println("Number is "+n+" and cube of" +n+" is " +sum);
        }
    }
}
