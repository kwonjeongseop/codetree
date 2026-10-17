import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        char a = (char)num1;
        char b = (char)num2;
        char c = (char)num3;
        char d = (char)num4;
        char e = (char)num5;

        System.out.print(a+" "+b+" "+c+" "+d+" "+e);

        sc.close();
    }
}
