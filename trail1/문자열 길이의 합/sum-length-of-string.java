import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] strArr = new String[N];

        int sum = 0;
        int cnt = 0;
        
        for( int i=0; i<strArr.length; i=i+1 ){
            strArr[i] = sc.next();        
        }

        for( int i=0; i<strArr.length; i=i+1){
            sum = sum + strArr[i].length();

            if(strArr[i].charAt(0) == 'a'){
                cnt = cnt + 1;
            }
        }

        System.out.print(sum+" "+cnt);

        sc.close();
    }
}