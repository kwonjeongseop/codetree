import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        int count = 0;
        int sum = 0;        
        
        for(int i=0; i<arr.length; i=i+1){
            arr[i] = sc.nextInt();
            
            if(arr[i] == 0){
                count = i;
                break;
            }
        }
        
        sum = arr[ count - 1] + arr[ count - 2] + arr[ count - 3];

        System.out.println(sum); 

        sc.close();
    }
}