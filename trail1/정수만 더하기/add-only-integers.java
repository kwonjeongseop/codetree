import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        int sum = 0;

        for( int i=0; i<A.length(); i=i+1 ){
            char c = A.charAt(i);

            if( c >= '0' && c <= '9' ){
                sum = sum + (c - '0');
            }
        }

        System.out.println(sum);
        
        sc.close();
    }
}