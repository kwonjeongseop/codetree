import java.util.Scanner;

public class Main{
    public static int addInt(int a, int b){ 
        int sum = a + b;
         return sum; 
    }
    public static int subInt(int a, int b){ 
        int sum = a - b;
         return sum;
    }
    public static int multiInt(int a, int b){ 
        int sum = a * b;
         return sum;
    }
    public static int divInt(int a, int b){ 
        int sum = a / b;
         return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int b = sc.nextInt();

        int sum = 0;
        
        if(o == '+'){
            sum = addInt(a, b);
            System.out.print(a + " + " + b + " = " + sum);
        }else if(o == '-'){
            sum = subInt(a, b);
            System.out.print(a + " - " + b + " = " + sum);
        }else if(o == '*'){
            sum = multiInt(a, b);
            System.out.print(a + " * " + b + " = " + sum);
        }else if(o == '/'){
            sum = divInt(a, b);
            System.out.print(a + " / " + b + " = " + sum);
        }else{
            System.out.print("False");
        }        
        sc.close();
    }
}

