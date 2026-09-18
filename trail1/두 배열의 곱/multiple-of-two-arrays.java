import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] sum = new int[3][3];

        for( int i=0; i<3; i=i+1 ){
            for( int j=0; j<3; j=j+1 ){
                arr1[i][j] = sc.nextInt();
            }
        }
        
        // System.out.println();        
            
        for( int i=0; i<3; i=i+1 ){
            for( int j=0; j<3; j=j+1 ){
                arr2[i][j] = sc.nextInt();
            }
        }    

        for( int i=0; i<3; i=i+1 ){
            for( int j=0; j<3; j=j+1 ){
                sum[i][j] = arr1[i][j] * arr2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}