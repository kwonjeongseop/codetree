import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i = i + 1) {
            arr[i] = sc.nextInt();
        }

        int minDiff = 100;

        for (int i = 0; i < N - 1; i = i + 1) {
            int diff = arr[i + 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        System.out.println(minDiff);

        sc.close();
    }
}