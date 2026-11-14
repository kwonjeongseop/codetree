import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n %i == 0) { 
                return false;
            }
        }
        return true;
    }

     public static boolean isEvenDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; 
            n /= 10;
        }
        return sum % 2 == 0; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (isPrime(i) && isEvenDigitSum(i)) { 
                cnt++;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}