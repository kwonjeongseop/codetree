import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 문자열 입력받기
        String s = sc.next();

        // 2. 문자열의 길이만큼 반복문 순회
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 3. 소문자 알파벳인 경우 대문자로 변환 ('a' ~ 'z')
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
                System.out.print(c);
            } 
            // 4. 이미 대문자이거나 알파벳인 경우 그대로 출력 (필요에 따라 조건 조절)
            else if (c >= 'A' && c <= 'Z') {
                System.out.print(c);
            }
        }

        sc.close();
    }
}