import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N1 = 0;
        int N2 = 0;

        N1 = sc.nextInt();                    // 4
        N2 = sc.nextInt();                    // 2

        int[] A = new int[N1];                
        int[] B = new int[N2];

        for( int i=0; i<N1; i=i+1){
            A[i] = sc.nextInt();                // 1 5 2 6
        }

        for( int i=0; i<N2; i=i+1){
            B[i] = sc.nextInt();                // 5 6
        }

        boolean isSubsequence = false;

        for( int i=0; i<=N1-N2; i++){

            Boolean isMatched = true;    
            for( int j=0; j<N2; j++){
                if(A[i+j] != B[j]){
                    isMatched = false;
                    break;
                }
            }
            if(isMatched){
                isSubsequence = true;
                break;
            }
        }
    
        if(isSubsequence){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        sc.close();
    }
}