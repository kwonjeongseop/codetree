import java.util.Scanner;

public class Main {

    public int printer(int N, int sum) {
        int result = sum / 10;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arrN = new int[N];
        int sum = 0;

        for (int i = 0; i < arrN.length; i = i + 1) {
            arrN[i] = i + 1;
        }

        for (int i = 0; i < arrN.length; i = i + 1) {
            sum = sum + arrN[i];
        }

        Main main = new Main();
        int result = main.printer(N, sum);

        System.out.println(result);

        sc.close();
    }
}