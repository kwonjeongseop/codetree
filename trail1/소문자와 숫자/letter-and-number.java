import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 문자열 입력받기
        String s = sc.next();

        // 2. 문자열 길이만큼 순회
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 3. 숫자, 소문자, 대문자 판별 및 출력
            if (c >= '0' && c <= '9') {
                System.out.print(c);
            } else if (c >= 'a' && c <= 'z') {
                System.out.print(c);
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32); // 대문자를 소문자로 변환
                System.out.print(c);
            }
        }

        sc.close();
    }
}