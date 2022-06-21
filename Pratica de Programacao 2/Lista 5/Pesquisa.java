import java.util.Scanner;
public class Pesquisa {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i;
        String elementop;
        String vetor[] = new String[50];
        i=0;
        for(i=0; i<50; i++){
            System.out.println("valor: ");
            vetor[i]=sc.next();
        }
        System.out.println("elemento Chave");
        elementop=sc.next();
        for(i=0;i<50;i++){
            if(vetor[i]==elementop){
            System.out.println("chave encontrada: " +vetor[i]+", posicao: "+i);
            i=50;
            }
            else if(elementop!=vetor[i]){
                System.out.println("chave nao encontrada na posicao: " +i);
            }
        }
    }
}