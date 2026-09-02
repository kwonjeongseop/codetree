import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int var = 0;

        for(int i=1; i<=10; i=i+1){
            var = N*i;
            System.out.print(var+" ");    
            
            if(var % 5 ==0){ cnt = cnt + 1; } 

            if( cnt == 2 ){ break; }
        }


        sc.close();
    }
}
