import java.util.Scanner;
public class Questao8{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetor[] = new int[16];
        int i,aux;
        i=0;
        for (i=0;i<16;i++){
            vetor[i]=sc.nextInt();
            aux=vetor[i];
            vetor[i]=vetor[15-i];
            vetor[15-i]=aux;
            System.out.println("Nota " + i + " = " + vetor[i]);
        }
        for (i=0;i<16;i++){
        aux=vetor[i];
            vetor[i]=vetor[15-i];
            vetor[15-i]=aux;
        }
    }
}