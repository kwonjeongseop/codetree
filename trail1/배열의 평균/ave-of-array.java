import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];
        int sumTotal = 0;

        for (int i = 0; i < 2; i = i + 1) {
            for (int j = 0; j < 4; j = j + 1) {
                arr[i][j] = sc.nextInt();
                sumTotal = sumTotal + arr[i][j];
            }
        }

        for (int i = 0; i < 2; i = i + 1) {
            int sumRow = 0;
            for (int j = 0; j < 4; j = j + 1) {
                sumRow = sumRow + arr[i][j];
            }
            System.out.printf("%.1f ", (double) sumRow / 4);
        }
        System.out.println();

        for (int j = 0; j < 4; j = j + 1) {
            int sumCol = 0;
            for (int i = 0; i < 2; i = i + 1) {
                sumCol = sumCol + arr[i][j];
            }
            System.out.printf("%.1f ", (double) sumCol / 2);
        }
        System.out.println();

        System.out.printf("%.1f", (double) sumTotal / 8);

        sc.close();
    }
}
