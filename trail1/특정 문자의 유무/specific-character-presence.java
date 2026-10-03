import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        // "ee"가 포함되어 있는지 확인
        if (s.contains("ee")) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }
        
        // "ab"가 포함되어 있는지 확인
        if (s.contains("ab")) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}