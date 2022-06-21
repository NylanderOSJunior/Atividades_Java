import java.util.Scanner;
public class Insercao{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetor[] = new vet [10];
        
        int i,chave,t;
        i=1;
        t=0;
        for(i=0;i<10;i++){
            System.out.print("Digite o Numero");
            vetor[i]=sc.nextInt();
        }
        for (i=1;i<vetor.length;i++){
            chave=vetor[i];
            t=i-1;
            
            while(t>-1 && chave<vetor[t]){
                vetor[t+1]=vetor[t];
                t--;
            }
        vetor[t+1]=chave;
        }
        for(t=0;t<vetor.length;t++){
            System.out.print(+vetor[t+1]+" ");
        }
    }
}