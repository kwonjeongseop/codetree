import    java.util.Scanner;
import    java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();

        int[] arr = new int[N];

        for( int i=0; i<N; i=i+1){
            arr[i] = sc.nextInt();
        //    System.out.print(arr[i]+" ");
        }

        // System.out.println();
        
        Arrays.sort(arr);

        // for( int j=0; j<N; j=j+1){
        //    System.out.print(arr[j]+" ");        
        // }

        System.out.print(arr[N-1]+" "+arr[N-2]);    

        sc.close();
    }
}
