import java.util.Scanner;
public class Bolha {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int aux,i,j,interacao,troca;
        int vetor[] = new int [50];
        i=0;
        interacao=0;
        troca=0;
        j=0;
        for(i=0;i<50;i++){
            System.out.println("numero do vetor");
            vetor[i]=sc.nextInt();
        }
        for (j=0;j<50;j++){
            
            for(i=0;i<(49-j);i++){
                if(vetor[i]>vetor[i+1]){
                    aux=vetor[i];
                    vetor[i]=vetor[i+1];
                    vetor[i+1]=aux;
                    troca=troca+1;
                }   
                    
            }
            System.out.println("varredura: ");
            
            for(i=0;i<50;i++){ 
                System.out.print( +vetor[i]+" ");
            }
        }
        System.out.println("valor final");
        for(i=0;i<50;i++){ 
            System.out.print( +vetor[i]+" ");
        }

        System.out.println("trocas"+troca);
        System.out.println("interacoes"+interacao);

    }
}