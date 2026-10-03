import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String strBig1 = str1 + str2;
        String strBig2 = str2 + str1;

        boolean strTrue = true;
        boolean strFalse = false;

        if(strBig1.equals(strBig2)){
            System.out.print(strTrue);
        }else{
            System.out.print(strFalse);
        }

        sc.close();
    }
}