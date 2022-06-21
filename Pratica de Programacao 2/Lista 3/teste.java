import java.util.Scanner;
public class Teste{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetor[] = new int[10];
        int a,b;
        a=0;

        for(a=0;a<10;a++){
        System.out.println("digite o valor dentro do vetor: ");
        vetor[a]=sc.nextInt();
        System.out.println("valor do vetor: " +vetor[a]+ " entrada: "+ a);
        }
    }
}