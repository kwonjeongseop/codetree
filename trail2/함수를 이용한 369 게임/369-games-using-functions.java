import java.util.Scanner;

public class Main {

    public static boolean contains369(int n) {
        while (n > 0) {
            int digit = n % 10; // 일의 자리 숫자 확인
            if (digit == 3 || digit == 6 || digit == 9) {
                return true;
            }
            n = n / 10; // 다음 자릿수로 이동
        }
        return false;
    }


    public static boolean is369Number(int n) {
        return (n % 3 == 0) || contains369(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;


        for (int i = a; i <= b; i = i + 1) {
            if (is369Number(i)) {
                cnt = cnt + 1;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}