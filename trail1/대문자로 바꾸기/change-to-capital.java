import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[5][3];
        int N = arr.length;

        for (int i = 0; i < N; i = i + 1) {
            for (int j = 0; j < N - 2; j = j + 1) {
        arr[i][j] = Character.toUpperCase(sc.next().charAt(0));

        System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}