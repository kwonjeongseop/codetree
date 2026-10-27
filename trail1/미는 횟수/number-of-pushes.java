import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int n = A.length();
        int ans = -1;

        for (int i = 1; i <= n; i++) {
            // A를 우측으로 i번 민 문자열 생성
            String shifted = A.substring(n - i) + A.substring(0, n - i);

            // 문자열 내용 비교는 .equals() 사용
            if (shifted.equals(B)) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}