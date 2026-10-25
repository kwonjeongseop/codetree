import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();

            // "END" 입력 시 프로그램 종료
            if (str.equals("END")) {
                break;
            }

            // 문자열을 거꾸로 순회하며 출력
            for (int i = str.length()-1; i>=0; i=i-1) {
                System.out.print(str.charAt(i));
            }
            System.out.println(); // 줄바꿈
        }

        sc.close();
    }
}
