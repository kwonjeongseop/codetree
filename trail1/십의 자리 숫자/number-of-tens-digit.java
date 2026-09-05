import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] count = new int[100];

        while(true){
            int num = sc.nextInt();

            if(num == 0){ break; }

            int ten = num / 10;

            if(ten >= 1){ count[ten] = count[ten] +1; }
        }

        for( int i=1; i<=9; i=i+1 ){ System.out.println( i+" - "+count[i]); }

        sc.close();
    }
}