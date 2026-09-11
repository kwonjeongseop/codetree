import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        int max = -1;

        for( int i=0; i<N; i=i+1 ){
             arr[i] = sc.nextInt();
        }
        for( int j=0; j<N; j=j+1){
            int count = 0;

            for( int k=0; k<N; k=k+1){
                if(arr[j] == arr[k]){
                    count = count +1;
                }
            }
            
            if(count == 1 && arr[j] > max){
                max = arr[j];
            }            
        }
        System.out.print(max);

        sc.close();
    }
}