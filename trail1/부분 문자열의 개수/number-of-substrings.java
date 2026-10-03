import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int count = 0;

        for( int i=0; i<A.length()-1; i=i+1 ){
            if(A.charAt(i) == B.charAt(0) && A.charAt(i + 1) == B.charAt(1)){
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}