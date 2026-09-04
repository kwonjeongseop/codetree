import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int[] count = new int[7]; // 1~6 번 방을 사용하기 위해 크기 7 생성
        int sum = 0;

        for (int i = 0; i < 10; i = i + 1) {
            sum = sc.nextInt(); // 입력받은 주사위 눈
            
            if (sum >= 1 && sum <= 6) {
                // i가 아니라 입력받은 주사위 눈(sum) 방의 카운트를 증가!
                count[sum] = count[sum] + 1; 
            }
        }

        // 1부터 6까지 출력 ("숫자 - 개수" 공백 양식 확인)
        for (int j = 1; j <= 6; j = j + 1) {
            System.out.println(j + " - " + count[j]);
        }

        sc.close();
    }

}