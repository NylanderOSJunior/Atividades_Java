import java.util.Scanner;
public class Questao2{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int n,t,i,somamedia,somaelementos,somapar,posicaopar;
        float media1;
        System.out.println("quantidade no vetor");
        n=sc.nextInt();
        int vetor[] = new int[n];
        i=0;
        somapar=0;
        somamedia=0;
        posicaopar=0;
        somaelementos=0;
        t=0;
        for (i=0;i<n;i++){
            vetor[i]=sc.nextInt();
            System.out.println("Nota " + i + " = " + vetor[i]);
            somaelementos=somaelementos+vetor[i];
            t=t+1;
            if((vetor[i]%2)==0){
                somapar=somapar+vetor[i];
    
            }
            if((i%2)==0){
                posicaopar=posicaopar+vetor[i];

            }
        }
        System.out.println("soma dos elementos: "+somaelementos);
        System.out.println("soma dos elementos pares: "+somapar);
        System.out.println("soma das pasicoes pares: "+posicaopar);
        media1=somaelementos/t;
        System.out.println("media dos elementos: "+media1);
        for (i=0;i<n;i++){
            if(vetor[i]>media1){
                somamedia=somamedia+vetor[i];
            }
        }
        System.out.println("soma dos numeros acima da media: "+somamedia);
    }
}

