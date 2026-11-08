import java.util.Scanner;

public class Main{

    public static int sumPrint(int a,int b){ 

        int sum = 0;

        sum = a;
    
        for( int i=0; i<b-1; i=i+1){
            sum = sum * a;
        }                

        return sum; 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = sumPrint(a,b);

        System.out.println(sum);

        sc.close();
    }
}