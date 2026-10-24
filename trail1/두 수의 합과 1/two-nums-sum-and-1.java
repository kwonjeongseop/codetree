import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        int result = 0;

        String sumStr = String.valueOf(sum);

        for( int i=0; i<sumStr.length(); i=i+1 ){
            char c = sumStr.charAt(i);

            if(c == '1'){
                result = result + 1;
            }
        }    

        System.out.println(result);        

        sc.close();
    }
}
