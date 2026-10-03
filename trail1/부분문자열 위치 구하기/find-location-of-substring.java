import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String target = sc.next();

        int index = -1;

        index = str.indexOf(target);
            
        System.out.print(index);

        sc.close();
    }
}
  