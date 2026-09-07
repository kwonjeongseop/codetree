import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. N과 Q 입력받기
        int N = sc.nextInt(); // N = 3
        int Q = sc.nextInt(); // Q = 3

        // 2. N개의 배열 원소 입력받기
        int[] arr = new int[N]; // 크기 3인 배열 생성
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); 
            // i = 0일 때: arr[0] = 1
            // i = 1일 때: arr[1] = 8
            // i = 2일 때: arr[2] = 5
        }
        // 현재 arr 상태: [1, 8, 5]

        // 3. Q(3)번의 질의 수행
        for (int q = 0; q < Q; q++) {
            int type = sc.nextInt(); // 질의 종류 읽기

            // --------------------------------------------------
            // [q = 0 번째 반복] type = 1 (첫 번째 질의: "1 1")
            // --------------------------------------------------
            if (type == 1) {
                int a = sc.nextInt(); // a = 1
                
                // arr[1 - 1] -> arr[0]의 값인 1이 출력됨
                System.out.println(arr[a - 1]); // [출력 결과: 1]

            // --------------------------------------------------
            // [q = 1 번째 반복] type = 2 (두 번째 질의: "2 5")
            // --------------------------------------------------
            } else if (type == 2) {
                int b = sc.nextInt(); // b = 5
                int idx = 0;

                for (int i = 0; i < N; i++) {
                    // i = 0: arr[0](1) == 5 -> false
                    // i = 1: arr[1](8) == 5 -> false
                    // i = 2: arr[2](5) == 5 -> true!
                    if (arr[i] == b) {
                        idx = i + 1; // idx = 2 + 1 = 3 (3번째 위치)
                        break;       // 반복 종료
                    }
                }
                
                // 5가 위치한 순서인 3이 출력됨
                System.out.println(idx); // [출력 결과: 3]

            // --------------------------------------------------
            // [q = 2 번째 반복] type = 3 (세 번째 질의: "3 1 2")
            // --------------------------------------------------
            } else if (type == 3) {
                int s = sc.nextInt(); // s = 1 (1번째부터)
                int e = sc.nextInt(); // e = 2 (2번째까지)

                // i = 1 - 1 (0) 부터 i <= 2 - 1 (1) 까지 반복
                for (int i = s - 1; i <= e - 1; i++) {
                    // i = 0일 때: arr[0]인 1 출력
                    // i = 1일 때: arr[1]인 8 출력
                    System.out.print(arr[i] + " "); 
                }
                System.out.println(); // 줄바꿈 [출력 결과: 1 8]
            }
        }

        sc.close();
    }
}