import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[100];

        arr[0]=1;
        arr[1]=N;

        int count = 2;

        for( int i=2; i<100; i=i+1){            
            arr[i] = arr[i - 1] + arr[i - 2];    // a[2] = a[1] + a[0];
            count=count+1;            // 값을 넣을때 마다 1씩 증가

            if(arr[i]>100){ break; }        // a[100] 도달하면 정지        
        }

        for( int i=0; i<count; i=i+1){
            System.out.print(arr[i]+" ");
        }        

        sc.close();
    }
}