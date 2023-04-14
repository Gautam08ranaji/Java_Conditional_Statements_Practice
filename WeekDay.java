package ConditionalStatements;

import java.util.Scanner;
//3. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays
// the name of the weekday.
public class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number between 1 to 7");
        int Day = sc.nextInt();
//        if (n1<1&&n1>7){
//            System.out.println(" enter valid number between 1 to 7");
//        }
        switch (Day) {
            case 1 -> System.out.println("sunday");
            case 2 -> System.out.println("MonDay");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("ThursDay");
            case 6 -> System.out.println("FriDay");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("invalid input please enter the number between 1 to 7");
        }
    }
}
