import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.next();
        String str2 = sc.next();

        int num1 = 0;
        for( int i=0; i<str1.length(); i=i+1 ){
            char c = str1.charAt(i);

            if(c >= '0' && c <= '9'){
                num1 = num1 * 10 + (c - '0');
            }else{
                break;
            }
        }
            
        int num2 = 0;
        for( int i=0; i<str2.length(); i=i+1 ){
            char c = str2.charAt(i);

            if(c >= '0' && c <= '9'){
                num2 = num2 * 10 + (c - '0');
            }else{
                break;
            }
        }

        System.out.print(num1+num2);
    
        sc.close();
    }
}