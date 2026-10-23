import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for( int i=0; i<s.length(); i=i+1 ){
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                         c = (char) (c + 32);
                System.out.print(c);
                    }else if(c >= 'a' && c <= 'z'){
                         c = (char) (c - 32);
                System.out.print(c);
            } 
        } 
        sc.close();
    }
}  