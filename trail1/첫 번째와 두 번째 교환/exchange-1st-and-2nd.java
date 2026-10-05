import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char a = str.charAt(0);

        char b = str.charAt(1);

        char[] arr = str.toCharArray();

        for( int i=0; i<str.length(); i=i+1 ){
            if(arr[i] == str.charAt(0)){
                arr[i] = b;
            }else if(arr[i] == str.charAt(1)){
                arr[i] = a;
            }
        }

        for( int i=0; i<str.length(); i=i+1 ){
            System.out.print(arr[i]);
        }

        sc.close();
    }
}