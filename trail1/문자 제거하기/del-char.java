import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

                while (str.length() > 1) {
                        int idx = sc.nextInt();

                    if (idx >= str.length()) {
                        idx = str.length() - 1;
                    }

                    str = str.substring(0, idx) + str.substring(idx + 1);

                    System.out.println(str);

                }

        sc.close();
    }
}