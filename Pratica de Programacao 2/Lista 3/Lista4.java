import java.util.Scanner;
public class Lista4{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetora[] = new int[10];
        int vetorb[] = new int[10];
        int vetorc[] = new int[10];
        int i,t;
        i=0;
        t=0;
        for (i=0;i<10;i++){
            System.out.println("Digite um numero para o Vetor A");
            vetora[i]=sc.nextInt();
            System.out.println("Digite um numero para o Vetor B");
            vetorb[i]=sc.nextInt();
            System.out.println("posicao Vetor A " + i+1 + " = " + vetora[i]);
            System.out.println("posicao Vetor B" + i+1 + " = " + vetorb[i]);
            
        }
        for (t=0;t<10;t++){
            if(t % 2 == 0){
                vetorc[t]=vetora[9-t];
            }
            else{
                vetorc[t]=vetorb[9-t];
            }
            System.out.println("posicao " + t + " = " + vetorc[t]);
        }
    }
}