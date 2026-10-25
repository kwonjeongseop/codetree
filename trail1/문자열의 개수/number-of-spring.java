import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] arrStr = new String[200];

        int count = 0;

        while(true){
            String str = sc.next();

            if(str.equals("0")){
                break;
            }

            arrStr[count]=str;

            count = count + 1;
        }

        System.out.println(count);

        for( int i=0; i<count; i=i+2){
            System.out.println(arrStr[i]);
        }

        sc.close();
    }
}