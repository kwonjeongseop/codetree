import java.util.Scanner;

public class Main {
  
    public static int getLcm(int n, int m) {
     
        for (int i = 1; i <= n * m; i = i + 1) {
            if (i % n == 0 && i % m == 0) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

      
        int lcm = getLcm(n, m);

        System.out.println(lcm);

        sc.close();
    }
}