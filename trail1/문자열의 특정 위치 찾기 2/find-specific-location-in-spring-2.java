import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char target = sc.next().charAt(0);

        String[] strArr = {"apple", "banana", "grape", "blueberry", "orange"};

        int num = 0;

        // System.out.println(strArr[4].length());            // 6

        for( int i=0; i<strArr[4].length()-1; i=i+1 ){
            if(strArr[i].charAt(2) == target || strArr[i].charAt(3) == target){
                System.out.println(strArr[i]);
                num = num+1;
            }
        }
        System.out.print(num);

        sc.close();
    }
}