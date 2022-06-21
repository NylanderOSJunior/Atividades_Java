import java.util.Scanner;
public class Questao7{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetora[] = new int[6];
        int vetorb[] = new int[6];
        int vetorc[] = new int[12];
        int i;
        i=0;
        for (i=0;i<6;i++){
            vetora[i]=sc.nextInt();
            System.out.println("posicao a " + i + " = " + vetorb[i]);
            vetorb[i]=sc.nextInt();
            System.out.println("posicao b " + i + " = " + vetora[i]);

        }
        for (i=0;i<12;i++){
            if(i<6){
                vetorc[i]=vetora[i];
                System.out.println("numero " +vetorc[i]);
            }
            if(i>=6){
                vetorc[i]=vetorb[i-6];
                System.out.println("numero " + vetorc[i]);
            }
       }
    }
}
        