import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for( int i=0; i<=arr.length-1; i=i+1){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}