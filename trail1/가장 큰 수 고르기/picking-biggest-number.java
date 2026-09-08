import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for( int i=0; i<10; i=i+1){
            arr[i] = sc.nextInt();
        }

        int  max = arr[0];

        for( int j=1; j<10; j=j+1){
            if(arr[j] > max){
                max = arr[j];
            }
        }

        System.out.print(max);

        sc.close();
    }
}