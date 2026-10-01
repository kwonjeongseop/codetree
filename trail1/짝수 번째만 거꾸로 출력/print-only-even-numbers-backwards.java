import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String result = "";

        for( int i=str.length()-1; i>=0; i=i-1 ){
            if(i % 2 != 0){
                result = result+str.charAt(i);
            }
        }
    
        System.out.print(result);

        sc.close();
    }
}