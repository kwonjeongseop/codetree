import java.util.Scanner;

public class Main {
    // 세 정수를 전달받아 최솟값을 구하여 출력하는 함수
    public static void printMin(int a, int b, int c) {
        int min = a;

        // b가 min보다 작으면 min 갱신
        if (b < min) {
            min = b;
        }
        // c가 min보다 작으면 min 갱신
        if (c < min) {
            min = c;
        }

        System.out.println(min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 함수 호출
        printMin(a, b, c);

        sc.close();
    }
}