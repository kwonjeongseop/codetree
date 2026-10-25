import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String A = sc.next();

        String[] arrStr = new String[n];

        int num = 0;

        for( int i=0; i<n; i=i+1 ){
            arrStr[i] = sc.next();
        
            if(arrStr[i].equals(A)){
                num = num + 1;                
            }
        }

        System.out.println(num);

        sc.close();
    }
}