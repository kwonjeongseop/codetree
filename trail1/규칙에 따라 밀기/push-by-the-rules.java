import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String cmd = sc.next();

        int strLen = str.length();
        int cmdLen = cmd.length();

        for( int i=0; i<cmdLen; i=i+1 ){
            char c = cmd.charAt(i);        // 검증용 문자 선언

            if(c == 'L'){
                // 좌측으로 한 칸 밀기
                str = str.substring(1) + str.substring(0, 1);
            }else if(c == 'R'){
                // 우측으로 한 칸 밀기
                str =     str.substring(strLen-1) + str.substring(0, strLen -1);
            }    
        }        

        System.out.println(str);    
    
        sc.close();
    }
}