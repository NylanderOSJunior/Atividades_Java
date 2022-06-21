import java.util.Scanner;
public class Questao4{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetor[] = new int[10];
        
        int i,soma,soma2,n,n1,media;
        i=0;
        soma=0;
        soma2=0;
        n1=0;
        n=0;
        media=0;
        for (i=0;i<10;i++){
            vetor[i]=sc.nextInt();
            System.out.println("posicao " + i + " = " + vetor[i]);
            if(vetor[i]<15){
                soma=soma+vetor[i];
            }
            if(vetor[i]==15){
                n=n+1;
            }
            if(vetor[i]>15){
            soma2=soma2+vetor[i];
            n1=n1+1;
            }
        }
        media=soma2/n1;
        System.out.println("soma dos menores que 15: "+soma);
        System.out.println("quantidade iguais a 15: "+n);
        System.out.println("media dos maiores que 15: "+media);
    }
}