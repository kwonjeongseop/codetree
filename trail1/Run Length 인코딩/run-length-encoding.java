import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        char target = A.charAt(0);

        int cnt = 1;

        String result = "";

        for( int i=1; i<A.length(); i=i+1 ){
            if( target ==  A.charAt(i)){
                cnt = cnt + 1;
            }else{
                result = result + target + cnt;

                target = A.charAt(i);

                cnt = 1;
            }
        }
    
        result = result + target + cnt;

        System.out.println(result.length());
        System.out.println(result);

        sc.close();
    }
}