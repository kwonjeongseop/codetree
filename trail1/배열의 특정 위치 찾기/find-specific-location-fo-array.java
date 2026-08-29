import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        // 10개의 정수 입력받기
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int evenSum = 0; // 짝수 번째 입력값의 합
        int sum3 = 0;    // 3의 배수 번째 입력값의 합

        for (int i = 0; i < 10; i++) {
            // (i + 1)이 번째 수가 됩니다.
            
            // 짝수 번째 (인덱스 1, 3, 5, 7, 9)
            if ((i + 1) % 2 == 0) {
                evenSum += arr[i];
            }
            
            // 3의 배수 번째 (인덱스 2, 5, 8)
            if ((i + 1) % 3 == 0) {
                sum3 += arr[i];
            }
        }

        // 3의 배수 번째 평균 (3개의 값)
        double avg3 = (double) sum3 / 3;

        // 공백을 사이에 두고 합과 소수 첫째 자리까지의 평균 출력
        System.out.printf("%d %.1f\n", evenSum, avg3);

        sc.close();
    }
}
