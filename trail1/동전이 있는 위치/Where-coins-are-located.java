import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. N(격자 크기)과 M(동전 개수) 입력받기
        int N = sc.nextInt();
        int M = sc.nextInt();

        // N x N 크기의 2차원 배열 선언 (기본값 0으로 초기화됨)
        int[][] arr = new int[N][N];

        // 2. M개의 동전 위치를 입력받아 배열에 1 표시하기
        for (int i = 0; i < M; i = i + 1) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            // 1-based 좌표를 0-based 인덱스로 보정하여 1 저장
            arr[r-1][c-1] = 1;
        }

        // 3. N x N 격자 출력하기
        for (int i = 0; i < N; i = i + 1) {
            for (int j = 0; j < N; j = j + 1) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}