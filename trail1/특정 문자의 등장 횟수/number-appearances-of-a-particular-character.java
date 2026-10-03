import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int num1 = 0;
        int num2 = 0;

        for( int i=0; i<str.length()-1; i=i+1 ){
            char c1 = str.charAt(i);
            char c2 = str.charAt(i+1);

            if(c1 == 'e' && c2 == 'e'){ 
                num1 = num1+1;
            }else if(c1 == 'e' && c2 == 'b'){
                num2 = num2+1;
            }
        }

        System.out.print(num1+" "+num2);

        sc.close();
    }
}
