import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 두 줄 입력 받기
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // 2. 두 문자열을 이어 붙인 후, 공백(" ")을 빈 문자열("")로 모두 치환
        String result = (str1 + str2).replace(" ", "");

        // 3. 한 번에 결과 출력
        System.out.println(result);

        sc.close();
    }
}