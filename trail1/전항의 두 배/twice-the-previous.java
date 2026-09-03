import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10개의 항을 저장할 크기 10인 배열 선언
        int[] arr = new int[10];

        // 첫 번째 항과 두 번째 항 입력 받기
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        // 세 번째 항(인덱스 2)부터 10번째 항(인덱스 9)까지 계산
        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i - 1] + 2 * arr[i - 2];
        }

        // 10개의 항을 순서대로 출력
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}