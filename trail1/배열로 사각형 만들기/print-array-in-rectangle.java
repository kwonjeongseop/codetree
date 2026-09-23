import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[5][5];

        for( int i=0; i<5; i=i+1 ){
            arr[0][i] = 1;
            arr[i][0] = 1;
        }

        for( int i=1; i<5; i=i+1 ){
            for( int j=1; j<5; j=j+1 ){
                arr[i][j] = arr[i-1][j]+ arr[i][j-1];
            }
        }

        for( int i=0; i<5; i=i+1 ){
            for( int j=0; j<5; j=j+1 ){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
} 