package ConditionalStatements;

public class test {
    public static void main(String[] args) {
        int n=7;
        int count=n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count);
                count--;
                break;
            }

        }
    }
}
