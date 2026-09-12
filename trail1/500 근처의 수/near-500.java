import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i = i + 1) {
            arr[i] = sc.nextInt();
        }

         int max = 0;
         int min = 1000;

        for (int i = 0; i < 10; i = i + 1) {
            if (arr[i] < 500) {
                 if (arr[i] > max) {
                     max = arr[i];
                }
            } else {
                if (arr[i] < min) {
                    min = arr[i];
                }
             }
         }

        System.out.print(max + " " + min);

         sc.close();
    }
}


