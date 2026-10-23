import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        String AB = A + B;
        String BA = B + A;

        int numAB = Integer.parseInt(AB);
        int numBA = Integer.parseInt(BA);

        int numSum = numAB + numBA;

        String sum = String.valueOf(numSum);

        System.out.println(sum);

        sc.close();
    }
}