import java.util.Scanner;

public class Main{
    
    public static boolean yundaYear(int y){ 

        boolean year = false;
        
        if(y % 4 == 0){
            year = true;
        }
        if(y % 100 == 0){
            year = false;
        }
        if(y % 400 == 0){
            year = true;
        }

        return year; 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
            
        boolean year = yundaYear(y);

        // System.out.println(y);

        System.out.println(year);        

        sc.close();
    }
}