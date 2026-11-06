import java.util.Scanner;

public class Main {

    public static int printDecimal(int A, int B){ 

        int sum = 0;

        for (int i = A; i <= B; i++) {
            int num = i;
            boolean prime = true;

            if (num <= 1) {
                prime = false;
            } else if (num == 2) {
                prime = true;
            } else if (num % 2 == 0) {
                prime = false;
            } else {
            
                for (int j = 3; j <= Math.sqrt(num); j += 2) {
                    if (num % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                // System.out.println(num);
                sum = sum + num;
            }
        }

        return sum; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        Main main = new Main();

        int sum = printDecimal(A, B);

        System.out.println(sum);

        sc.close();
    }
}