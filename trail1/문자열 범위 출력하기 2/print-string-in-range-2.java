import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int num = sc.nextInt();

        if (num > str.length()) {
            num = str.length();
        }

        for (int i = str.length() - 1; i >= str.length() - num; i = i - 1) {
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}