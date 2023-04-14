package ConditionalStatements;

// 7 .Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel of
// Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z),
// or is a string of length > 1, print an error message
import java.util.Scanner;

public class Consonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet");
        String s1 = sc.next();

        if (s1.length()>1) {
            System.out.println("not a single character");
        } else if (s1.equals("a") || s1.equals("e") || s1.equals("i") || s1.equals("o") || s1.equals("u")) {
            System.out.println(s1+" is  vowels");
        } else if (s1.charAt(0) >=65 && s1.charAt(0)<=90||s1.charAt(0)>=97 || s1.charAt(0)>=122) {
            System.out.println("Consonent");
        } else  {
            System.out.println("invalid input");
        }
    }
}
