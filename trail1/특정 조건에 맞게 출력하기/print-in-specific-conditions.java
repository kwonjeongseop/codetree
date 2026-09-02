import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[100];
        int count = 0; 

        while (true) {
            int num = sc.nextInt();
            
            if (num == 0) {
                break;
            }
            
            arr[count] = num;
            count++;
        }

        for (int i = 0; i < count; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print((arr[i] + 3) + " ");
            } else {
                System.out.print((arr[i] / 2) + " ");
            }
        }

        sc.close();
    }
}