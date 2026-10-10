import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int L = str.length();

        for( int i=0; i<L+1; i=i+1 ){
            System.out.println(str);
            str = str.substring(L - 1) + str.substring(0, L - 1);
        }
        sc.close();
    }
}