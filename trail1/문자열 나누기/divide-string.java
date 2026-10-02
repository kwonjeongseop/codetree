import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] strArr = new String[n];

        String strAdd = "";

        for( int i=0; i<n; i=i+1 ){
            strArr[i] = sc.next();
            strAdd = strAdd + strArr[i];
        }

        for (int i = 0; i < strAdd.length(); i = i + 1) {
            System.out.print(strAdd.charAt(i));
    
            if ((i + 1) % 5 == 0) {
                    System.out.println();
                }
        }
        sc.close();
    }
}