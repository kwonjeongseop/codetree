import java.util.Scanner;

 public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        
        // System.out.println(N);        

        for( int i=0; i<=arr.length-1; i=i+1){
            arr[i] = sc.nextInt();
        }

        for( int j=0; j<=N-1; j=j+1 ){
            System.out.print((arr[j]*arr[j]) + " ");
        }        
    }
}