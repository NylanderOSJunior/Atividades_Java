import java.util.Scanner;
public class Lista4{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetora[] = new int[10];
        int vetorb[] = new int[10];
        int vetorc[] = new int[20];
        int i,t;
        i=0;
        t=0;
        for (i=0;i<10;i++){
            vetora[i]=sc.nextInt();
            vetorb[i]=sc.nextInt();
            System.out.println("posicao " + i + " = " + vetora[i]);
            
        }
        for (i=0;i<20;i++){
            if(i % 2 == 0){
                vetorc[i]=vetora[10-i];
            }
            else{
                vetorc[i]=vetorb[10-i];
            }
            System.out.println("posicao " + i + " = " + vetorc[i]);
        }
    }
}