import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] strArr = new String[10];

        for( int i=0; i<strArr.length; i=i+1 ){
            strArr[i] = sc.next();
            System.out.println(strArr[i]);            
        }

        sc.close();
    }
}
