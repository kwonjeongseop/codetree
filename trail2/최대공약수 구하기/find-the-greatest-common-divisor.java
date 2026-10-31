import java.util.Scanner;

public class Main {
    public static void printGcd(int n, int m) {
        int min = Math.min(n, m);
        int gcd = 1;

        for (int i = 1; i <= min; i = i + 1) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

         printGcd(n, m);

        sc.close();
    }
}