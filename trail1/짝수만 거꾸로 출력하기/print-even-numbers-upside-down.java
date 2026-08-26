import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        int[] arr=new int[N];
        
        for(int i=0; i<=N-1; i++){
            arr[i]=sc.nextInt();
        }
        for(int j=N-1; j>=0; j--){
            if( arr[j] % 2 ==0 ){
                System.out.print(arr[j]+" ");
            }                
        }        
        sc.close();        
    }
}