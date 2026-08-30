import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        
        // System.out.println(arr.length);  // 10

        for( int i=0; i<=arr.length-1; i=i+1){
            arr[i] = sc.next();
        }

        System.out.print(arr[1] + " " + arr[4] + " " + arr[7]);        

        sc.close();
    }
} 