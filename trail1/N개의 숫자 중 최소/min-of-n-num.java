import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        int count = 0;

        for( int i=0; i<N; i=i+1){
            arr[i] = sc.nextInt();
        }

        int min = arr[0]; 

        for( int j=0; j<N; j=j+1){
     
            if(arr[j] < min){            
                min = arr[j];
                count=1;
            }else if(arr[j] == min){
                count=count+1;
            }
        }
        
        System.out.print(min+" "+count);

        sc.close();
    }
}