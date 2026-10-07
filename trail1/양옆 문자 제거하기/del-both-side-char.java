import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 문자열 입력받기
        String str = sc.next();

        // 2. 문자열 길이 구하기
        int len = str.length();

        // 3. 앞에서 2번째(인덱스 1), 뒤에서 2번째(인덱스 len - 2) 문자를 제외하고 연결
        String result = str.substring(0, 1) + str.substring(2, len - 2) + str.substring(len - 1);

        // 4. 결과 출력
        System.out.println(result);

        sc.close();
    }
}