import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);        
        int sum = 0;
        int diff = 0;

        // System.out.println((int)a);            // 76
        // System.out.println((int)b);            // 101    

        sum = (int)a + (int)b;
        
        if((int)a > (int)b){
            diff = (int)a - (int)b;
        }else if((int)b > (int)a){
            diff = (int)b - (int)a;
        }

        System.out.print(sum+" "+diff);

        sc.close();
    }
}