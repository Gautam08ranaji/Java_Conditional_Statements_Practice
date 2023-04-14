package ConditionalStatements;

public class Number_Rhombus {
    public static void main(String[] args) {
        int n=7;
        int count=2;
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                if (j == 1) {
                    continue;
                }
                if (count >7) {
                    count=2;
                }
                System.out.print(count);
                count++;

            }
                for (int k = 1; k <=i ; k++) {
                    System.out.print(k);

                }


            System.out.println();

        }
    }
}
