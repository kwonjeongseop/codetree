import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next(); 
        char target = sc.next().charAt(0);
        int index = -1;

        for( int i=0; i<str.length(); i=i+1 ){

            if(str.charAt(i) == target){ 
                index = i;
                break; 
            }

        }
        if(index != -1 ){
            System.out.print(index);
        }else{
            System.out.print("No");
        }    

    sc.close();

    }
}