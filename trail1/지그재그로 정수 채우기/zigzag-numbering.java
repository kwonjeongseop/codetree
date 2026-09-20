import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];
        int num = 0;

        // 바깥 반복문: 열(j) 기준 (0 ~ M-1)
        for (int j = 0; j < M; j = j + 1) {
            if (j % 2 == 0) { // 짝수 번째 열: 위 -> 아래 (i: 0 -> N-1)
                for (int i = 0; i < N; i = i + 1) {
                    arr[i][j] = num;
                    num = num + 1;
                }
            } else { // 홀수 번째 열: 아래 -> 위 (i: N-1 -> 0)
                for (int i = N - 1; i >= 0; i = i - 1) {
                    arr[i][j] = num;
                    num = num + 1;
                }
            }
        }

        // 출력: 행(i) 단위 출력
        for (int i = 0; i < N; i = i + 1) {
            for (int j = 0; j < M; j = j + 1) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}