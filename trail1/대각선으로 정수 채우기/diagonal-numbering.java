import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];
        int num = 1;

        // 1. 첫 번째 행(row = 0)에서 시작하는 대각선들
        for (int startCol = 0; startCol < M; startCol = startCol + 1) {
            int currRow = 0;
            int currCol = startCol;

            // 대각선 방향(아래-왼쪽 ↙)으로 이동하며 채우기
            while (currRow < N && currCol >= 0) {
                arr[currRow][currCol] = num;
                num = num + 1;
                currRow = currRow + 1; // 행 증가
                currCol = currCol - 1; // 열 감소
            }
        }

        // 2. 마지막 열(col = M - 1)의 나머지 행(row = 1 ~ N-1)에서 시작하는 대각선들
        for (int startRow = 1; startRow < N; startRow = startRow + 1) {
            int currRow = startRow;
            int currCol = M - 1;

            // 대각선 방향(아래-왼쪽 ↙)으로 이동하며 채우기
            while (currRow < N && currCol >= 0) {
                arr[currRow][currCol] = num;
                num = num + 1;
                currRow = currRow + 1; // 행 증가
                currCol = currCol - 1; // 열 감소
            }
        }

        // 3. 배열 출력 (행 우선)
        for (int i = 0; i < N; i = i + 1) {
            for (int j = 0; j < M; j = j + 1) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}