import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int[] arr = new int[100];

        int cnt = 0;

        int input = 0;

        while(true){                // 무조건 처음 입장, 나가건 break; 가능

            input = sc.nextInt();
        
            if(input == 999 || input == -999){
                break;
            }

            arr[cnt] = input;            // arr[0] arr[1] arr[2] arr[3] 
            cnt = cnt+1;                // 1 2 3 4
        }

        int max = arr[0];
        int min = arr[0];

        for( int j=0; j<cnt; j=j+1){

            if(arr[j]>max){         // a[숫자] 값이 max 보다 크면 
                max = arr[j];     // max 에 a[숫자] 를 저장
            }
            
            if(arr[j]<min){
                min = arr[j];
            }
        }

        System.out.print(max+" "+min);

        sc.close();
    }
}
