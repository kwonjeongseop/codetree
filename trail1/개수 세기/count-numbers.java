import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();        // 숫자 개수
        int M = sc.nextInt();        // 찾으려는 수

        int cnt = 0;                // M에 등장할 숫자 저장 변수
        int num = 0;                // M과 비교하는 변수

        for( int i=0; i<N; i=i+1){
            num = sc.nextInt();

            if(num == M){
                cnt = cnt +1;
            }
        }

        System.out.print(cnt);

        sc.close();
    }
}