import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    

        int[][] arr = new int[4][4];

        for( int i=0; i<4; i=i+1){
            for( int j=0; j<4; j=j+1){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int sum = 0;        

        for( int i=0; i<4; i=i+1){
            for( int j=0; j<4; j=j+1){
                if(i >= j){
                    sum = sum + arr[i][j];
                    // arr[3][0], arr[2][0], arr[1][0], arr[0][0]
                    // arr[3][1], arr[2][1], arr[1][1],
                    // arr[3][2], arr[2][2]
                    // arr[3][3] 
                }
            }
        }
        System.out.println(sum);

        sc.close();
    }
}  