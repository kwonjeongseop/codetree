import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[N][N];

        int num = 1;

        for( int i=0; i<N; i=i+1 ){
            for( int j=0; j<N; j=j+1 ){
                // arr[j][i] = arr[j][i] + num;        // 기존값이 있을때
                arr[j][i] = num;                // 기존값이 없을때
                num = num + 1;
            }
        }

        for( int i=0; i<N; i=i+1 ){
            for( int j=0; j<N; j=j+1 ){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();        
    }
}