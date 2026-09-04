import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] countArr = new int[10];

        for (int i = 0; i < N; i = i + 1) {
            int num = sc.nextInt();
            countArr[num] = countArr[num] + 1;
        }

        for (int i = 1; i <= 9; i = i + 1) {
            System.out.println(countArr[i]);
        }

        sc.close();
    }
}