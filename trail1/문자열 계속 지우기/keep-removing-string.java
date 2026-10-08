import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

            String a = sc.next();
            String b = sc.next();

            while (a.contains(b)) {
                    a = a.replaceFirst(b, "");
            }

            System.out.println(a);

            sc.close();
    }
}
