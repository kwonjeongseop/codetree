import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10점대부터 100점대까지 세기 위해 크기 11 배열 선언 (인덱스 1~10 사용)
        int[] count = new int[11];

        while (true) {
            int score = sc.nextInt();

            // 0이 들어오면 종료
            if (score == 0) {
                break;
            }

            // 10점 미만은 세지 않음
            if (score < 10) {
                continue;
            }

            // 점수를 10으로 나눈 몫에 해당하는 방의 카운트 1 증가
            int category = score / 10;
            count[category] = count[category] + 1;
        }

        // 100점부터 10점까지 내림차순(10 -> 1)으로 출력
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println((i * 10) + " - " + count[i]);
        }

        sc.close();
    }
}