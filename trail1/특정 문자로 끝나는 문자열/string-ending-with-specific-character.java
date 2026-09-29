import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] strArr = new String[10];

        for( int i=0; i<strArr.length; i=i+1 ){
            strArr[i] = sc.next();
        }
        char target = sc.next().charAt(0);

        int cnt = 0;

        for( int i=0; i<strArr.length; i=i+1 ){
            if(target == strArr[i].charAt(strArr[i].length() - 1)){
                cnt = cnt + 1;
                System.out.println(strArr[i]);
            }
        }

        if(cnt == 0){
            System.out.println("None");
        }

        sc.close();
    }
}