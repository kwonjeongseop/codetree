import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        int[] sum = new int[4];

        // System.out.println(arr.length);        // 4

        for( int i=0; i<arr.length; i=i+1){
            for( int j=0; j<arr.length; j=j+1 ){
                arr[i][j] = sc.nextInt();
            }
        }

        for( int i=0; i<arr.length; i=i+1){
            for( int j=0; j<arr.length; j=j+1 ){
                sum[i] = sum[i] + arr[i][j];
            }
            System.out.println(sum[i]+" ");
        }
        
        sc.close();
    }
}
