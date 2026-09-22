import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        int num = 1; // 1부터 시작

        // 오른쪽 열(N-1)부터 왼쪽(0)으로 이동
        for (int j = N - 1; j >= 0; j = j - 1) {
            
            // 오른쪽 끝에서부터 떨어진 거리가 짝수일 때 (아래 -> 위)
            if ((N - 1 - j) % 2 == 0) {
                for (int i = N - 1; i >= 0; i = i - 1) {
                    arr[i][j] = num;
                    num = num + 1;
                }
            } 
            // 홀수일 때 (위 -> 아래)
            else {
                for (int i = 0; i < N; i = i + 1) {
                    arr[i][j] = num;
                    num = num + 1;
                }
            }
        }

        // 출력 부
        for (int i = 0; i < N; i = i + 1) {
            for (int j = 0; j < N; j = j + 1) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}