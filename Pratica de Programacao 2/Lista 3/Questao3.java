import java.util.Scanner;
public class Questao3{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetor[] = new int[10];
       
        int i,soma;
        i=0;
        soma=0;
        for (i=0;i<10;i++){
            vetor[i]=sc.nextInt();
            System.out.println("posicao " + i + " = " + vetor[i]);
            if(vetor[i] % 5 ==0){
                soma=soma+vetor[i];
            }
        }
        System.out.println("a soma e: "+soma);
    }
}
