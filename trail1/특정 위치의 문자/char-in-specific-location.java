import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] arr ={"L","E","B","R","O","S"};

        String str = sc.next();

        int index = -1;

        for( int i=0; i<arr.length; i=i+1){
            if(arr[i].equals(str)){
                index = i;
                break;                    
            }
        }

        if(index != -1){
            System.out.println(index);
        }else{
            System.out.println("None");
        }
        sc.close();
    }
}
