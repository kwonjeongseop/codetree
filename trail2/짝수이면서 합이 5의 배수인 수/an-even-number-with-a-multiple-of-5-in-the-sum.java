import java.util.Scanner;

public class Main {
    // 짝수이면서 각 자리 숫자의 합이 5의 배수인지 확인하는 함수
    public static boolean isMagicNumber(int n) {
        // 1. 짝수 조건 확인
        boolean isEven = (n % 2 == 0);
        
        // 2. 각 자리 숫자의 합 계산 (십의 자리 + 일의 자리)
        int sum = (n / 10) + (n % 10);
        
        // 3. 합이 5의 배수인지 확인
        boolean isSumMultipleOf5 = (sum % 5 == 0);

        // 두 조건을 모두 만족해야 참(true)
        return isEven && isSumMultipleOf5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 함수 호출 결과를 받아 출력
        if (isMagicNumber(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}