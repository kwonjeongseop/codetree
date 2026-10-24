import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.next();
        String str2 = sc.next();

        String str1Ext = str1.replaceAll("[^0-9]","");
        String str2Ext = str2.replaceAll("[^0-9]","");

        int str1Int = Integer.parseInt(str1Ext); 
        int str2Int = Integer.parseInt(str2Ext); 

        int strSum = str1Int + str2Int;

        System.out.print(strSum);
    
        sc.close();
    }
}