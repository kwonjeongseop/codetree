import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for( int i=0; i<arr.length; i=i+1 ){
            arr[i] = sc.nextInt();
        }        

        int sum = 0;

        for( int i=0; i<arr.length; i=i+1 ){
            sum = sum + arr[i];
        }

        String str = String.valueOf(sum);

        str = str.substring(1) + str.substring(0, 1);    

        System.out.println(str);        

        sc.close();
    }
}