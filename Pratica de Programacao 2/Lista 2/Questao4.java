import java.util.Scanner;
public class Questao4{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetor[] = new int[3];
        int i;
        i=0;
        for (i=0;i<1;i++){
            vetor[i]=sc.nextInt();
            System.out.println("valor " + i + " = " + vetor[i]);
            vetor[2]=(vetor[0]+vetor[1]);
        }
        System.out.println("soma dos dois numeros:"+vetor[2]);
    }
}
