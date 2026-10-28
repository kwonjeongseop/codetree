import java.util.Scanner;

public class Main{
    public static void output(int N){
            String str = "12345^&*()_";

            for( int i=0; i<N; i=i+1 ){
                System.out.println(str);
            }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        output(N);        

        sc.close();
    }
}