import java.util.Scanner;

public class Main{
    public static void output(int n, int m){
        String output = "1";

        for( int i=0; i<n; i=i+1 ){
            for( int j=0; j<m; j=j+1 ){
                System.out.print(output);
            }
            System.out.println();
        }
    }    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        output(n,m);
        
        sc.close();
    }
}

