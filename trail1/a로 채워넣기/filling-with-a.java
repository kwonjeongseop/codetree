import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();

        // 앞에서 2번째(인덱스 1)와 뒤에서 2번째(인덱스 length - 2) 원소를 'a'로 변경
        arr[1] = 'a';
        arr[arr.length - 2] = 'a';

        // char 배열을 문자열로 변환하여 출력
        System.out.print(String.valueOf(arr));

        sc.close();
    }
}