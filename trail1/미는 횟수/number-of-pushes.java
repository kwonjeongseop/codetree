import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int N = A.length();
        int ans = -1;

        for (int i = 1; i <= N; i++) {
            // A를 우측으로 i번 민 문자열 생성
            String shiftR = A.substring(N - i) + A.substring(0, N - i);

            // B와 일치하는지 비교
            if (shiftR.equals(B)) { 
                ans = i; 
                break; 
            }
        }

        System.out.println(ans);

        sc.close();
    }
}