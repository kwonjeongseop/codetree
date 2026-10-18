
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char c = sc.next().charAt(0);

        // char d = 'z';

        // char e = 'a';

        int num1 = (int)c;

        int num2 = num1+1;

        if( c == 'z' ){
            num2 = 97;
        }

        char nextC = (char)num2;

        // System.out.println((int)e);        //  97 -> a

        // System.out.println((int)d);        // 122 -> z

        System.out.print(nextC);

        sc.close();
    }
}