import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            int length = str.length();

            if (type == 1) {
                str = str.substring(1) + str.substring(0, 1);
            } else if (type == 2) {
                str = str.substring(length - 1) + str.substring(0, length - 1);
            } else if (type == 3) {
                str = new StringBuilder(str).reverse().toString();
            }

            System.out.println(str);
        }

        sc.close();
    }
}