import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] strArr = new String[N];

        for( int i=0; i<strArr.length; i=i+1 ){
            strArr[i] = sc.next();
        }

        char target = sc.next().charAt(0);

        int num = 0;
        int sum = 0;
        double avg = 0.0;

        for( int i=0; i<strArr.length; i=i+1 ){
            if(target == strArr[i].charAt(0)){
                num = num + 1;
                sum = sum + strArr[i].length();
            }
        }
        
        avg = (double)sum / (double)num;

        System.out.printf("%d %.2f", num, avg);    
        
        sc.close();
    }
}
