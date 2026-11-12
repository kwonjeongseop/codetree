import java.util.Scanner;

public class Main{
    public static boolean inPerfect(int n){

        if(n % 2 == 0){ 
            return false;
        }else if(n % 5 == 0 && n % 10 == 5){
            return false;
        }else if(n % 3 == 0 && n % 9 != 0){
            return false;
        }

        return true;        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int cnt = 0;

        for( int i=A; i <= B; i=i+1 ){
            if(inPerfect(i)){
                cnt = cnt + 1;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
} 