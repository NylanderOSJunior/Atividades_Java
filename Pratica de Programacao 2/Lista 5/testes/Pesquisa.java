import java.util.Scanner;
public class Pesquisa {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,elementop;
        int vetor[] = new int[10];
        i=0;
        for(i=0; i<10; i++){
            System.out.println("valor: ");
            vetor[i]=sc.nextInt();
        }
        System.out.println("elemento Chave");
        elementop=sc.nextInt();
        for(i=0;i<10;i++){
            if(vetor[i]==elementop){
            System.out.println("chave encontrada: " +vetor[i]+", posicao: "+i);
            i=10;
            }
            else if(elementop!=vetor[i]){
                System.out.println("chave nao encontrada na posicao: " +i);
            }
        }
    }
}