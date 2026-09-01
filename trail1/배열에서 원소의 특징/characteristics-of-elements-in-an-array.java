import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for( int i=0; i<=arr.length-1; i=i+1 ){
            arr[i] = sc.nextInt();
        }
        for( int j=1; j<=arr.length-1; j=j+1){
            if(arr[j] % 3 == 0){
                System.out.println(arr[j - 1]);
                break;
            }
        }
    }
}