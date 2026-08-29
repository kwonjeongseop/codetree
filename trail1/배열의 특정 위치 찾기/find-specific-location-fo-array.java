import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[10];
        int sum1 = 0;
        int sum2 = 0;
        double avg = 0;
        
        for( int i=0; i<arr.length; i=i+1){
            arr[i] = sc.nextInt();
            if((i+1) % 2 == 0){
                sum1 = sum1 + arr[i];
            }
        }

        for( int i=0; i<arr.length; i=i+1){
            if((i+1) % 3 == 0){
                sum2 = sum2 + arr[i];
            }
            avg = (double)sum2 / 3;
        }
        
        System.out.printf("%d %.1f\n", sum1, avg);

        // System.out.println(sum1);
        // System.out.println(sum2);
        // System.out.println(avg);

        sc.close();
    }
}