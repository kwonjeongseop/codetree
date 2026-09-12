import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i = i + 1) {
            arr[i] = sc.nextInt();
        }

        int lastIdx = N;

        while (true) {
            int maxIdx = 0;

            for (int i = 0; i < lastIdx; i = i + 1) {
                if (arr[i] > arr[maxIdx]) {
                    maxIdx = i;
                }
            }

            System.out.print((maxIdx + 1) + " ");

            if (maxIdx == 0) {
                break;
            }

            lastIdx = maxIdx;
        }

        sc.close();
    }
}
