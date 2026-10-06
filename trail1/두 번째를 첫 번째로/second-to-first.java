import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char a = str.charAt(0);
        char target = str.charAt(1);

        char[] arr = str.toCharArray();

        for( int i=0; i<str.length(); i=i+1 ){
            if(arr[i] == target){
                arr[i] = a;
            }
        }

        System.out.println(String.valueOf(arr));
        
        sc.close();
    }
}