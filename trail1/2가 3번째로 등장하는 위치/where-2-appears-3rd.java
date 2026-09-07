import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int count = 0;
        int result = 0;    

        for(int i=0; i<N; i=i+1){
            arr[i] = sc.nextInt();
        }
        
        for(int j=0; j<N; j=j+1){
            if(arr[j] == 2){
                count = count +1;            // 2 나옴으로 +1 증가

                if(count == 3){
                    result = j +1;        // 번째는 +1, 2가 저장된 위치 찾음
                    break;                // 블록 탈출
                }
            }
        }

        System.out.println(result);

        sc.close();
    }
}