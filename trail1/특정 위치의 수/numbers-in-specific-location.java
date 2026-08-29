import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        int sum=0;
        for( int i=0; i<arr.length; i=i+1){
            arr[i] = sc.nextInt();    
        }

        sum = arr[2]+arr[4]+arr[9];

        System.out.println(sum);
        
        sc.close();
    }
}
