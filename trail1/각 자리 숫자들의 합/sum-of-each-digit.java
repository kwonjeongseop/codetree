import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = String.valueOf(n);

        int sum = 0;

        for( int i=0; i<str.length(); i=i+1 ){
            char c = str.charAt(i);

            // int num = Character.getNumericValue(문자);

            int cInt = Character.getNumericValue(c);

            sum = sum + cInt;    
        }

        System.out.print(sum);

        sc.close();
    }
}