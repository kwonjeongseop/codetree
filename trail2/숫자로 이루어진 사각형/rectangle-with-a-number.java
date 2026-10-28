import java.util.Scanner;

public class Main{

    public static void printer(int N){
        int num = 0;

        for( int i=0; i<N; i=i+1 ){
            for( int j=0; j<N; j=j+1 ){
                if(num < 9){
                    num = num + 1;                    
                }else if(num == 9 ){
                    num = 1;
                }else{
                    System.out.println("정수가 아닙니다.");
                }
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printer(N);

        sc.close();
    }
}
