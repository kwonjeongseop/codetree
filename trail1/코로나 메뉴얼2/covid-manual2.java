import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] count = new int[4];            
        String cold = "";
        int bt = 0;

        for( int i=0; i<3; i=i+1){
            cold = sc.next();
            bt = sc.nextInt();

            if(cold.equals("Y")){
                if(bt >= 37){ 
                    count[0]=count[0]+1; 
                }else{  
                    count[2]=count[2]+1; 
                }
            }else{
                if(bt >= 37){ 
                    count[1]=count[1]+1; 
                }else{ 
                    count[3]=count[3]+1; 
                }
            }
        }

        for( int i=0; i<4; i=i+1){
            System.out.print(count[i]+" ");
        }

        if(count[0] >= 2){
            System.out.print("E");
        }
    }
}