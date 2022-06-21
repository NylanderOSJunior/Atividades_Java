import java.util.Scanner;
public class Selecao {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,min,aux,pos;
        int vetor[] = {54, 2, 11, 4, 17, 7, 21, 1};
        i=0;
        j=0;
        pos=0;
        min=0;
        for(i=0;i<vetor.length-1;i++){
        min=vetor[i];
        for (j=(i+1);j<vetor.length;j++){

            if(vetor[i]<vetor[min]){
                min= vetor[i];
               
            } 
        }
        aux=vetor[min];
        vetor[min]=vetor[j];
        vetor[j]=aux;
    }
        for(i=0;i<vetor.length;i++){
        System.out.print(+vetor[i]+", ");
        } 
    }
}
