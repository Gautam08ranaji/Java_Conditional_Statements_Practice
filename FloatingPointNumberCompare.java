package ConditionalStatements;
// 4. Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal
// places.
public class FloatingPointNumberCompare {
    public static void main(String[] args) {
        double f1 = 25.586;
        double f2 = 25.586;
// Direct method
//        if (f1 == f2) {
//            System.out.println("numbers are same");
//        }else {
//            System.out.println(" not same");
//        }

//     another method

        f1=Math.round(f1*1000);
        f1= f1/1000;

        f2 = Math.round(f2*1000);
        f2 = f2/1000;

        if (f1==f2){
            System.out.println("same up to three decimal");
        }else {
            System.out.println(" not same up to three decimal");
        }
    }
}
