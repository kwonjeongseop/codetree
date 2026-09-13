import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i = i + 1) {
            arr[i] = sc.nextInt();
        }

        int maxProfit = 0;

        for (int i = 0; i < N; i = i + 1) {
            for (int j = i + 1; j < N; j = j + 1) {
                int profit = arr[j] - arr[i];

                if (profit > maxProfit) {
        maxProfit = profit;
                }
            }
        }

        System.out.println(maxProfit);

        sc.close();
    }
}