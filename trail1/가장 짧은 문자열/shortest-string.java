import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 세 문자열 입력 받기
        String str1 = sc.next(); // "Leebros" (7)
        String str2 = sc.next(); // "CodeTree" (8)
        String str3 = sc.next(); // "BranchandBound" (14)

        // 2. 각각의 문자열 길이 계산
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        // 3. Math.max / Math.min으로 안전하게 극값 추출 (길이 중복 상황 완벽 대응)
        int maxLen = Math.max(len1, Math.max(len2, len3));
        int minLen = Math.min(len1, Math.min(len2, len3));

        // 4. 차이값 출력
        System.out.println(maxLen - minLen);

        sc.close();
    }
}