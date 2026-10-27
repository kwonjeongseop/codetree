import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] arrStr = {"*","*","*","*","*","*","*","*","*","*"};

        int num = arrStr.length;

        for( int i=0; i<5; i=i+1 ){
            for( int j=0; j<num; j=j+1 ){
                System.out.print(arrStr[i]);
            }
            System.out.println();
        }
        sc.close();
    }
}