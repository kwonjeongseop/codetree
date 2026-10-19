import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        int num1 = (int)c;
        int num2 = num1 - 1;    

        char a = 'a';
        char b = 'z';

        // System.out.println((int)a);            // 97
        // System.out.println((int)b);            // 122

        if(c == a){
            num2 = (int)b;
        }

        char fastC = (char)num2;    

        System.out.print(fastC);    

        sc.close();
    }
}