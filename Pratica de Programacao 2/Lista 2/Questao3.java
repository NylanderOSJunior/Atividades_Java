import java.util.Scanner;
public class Questao3{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetor[] = new int[6];
        int i,maior,menor,posi1,posi2;
        i=0;
        maior=0;
        menor=0;
        posi=0;
        posi=0;
        for (i=0;i<6;i++){
            vetor[i]=sc.nextInt();
            System.out.println("valor " + i + " = " + vetor[i]);
            if(vetor[i]>maior){
                maior=vetor[i];
                posi1=i;
            }
            if(vetor[i]<menor){
                menor=vetor[i];
                posi2=i;
            }

        }
        System.out.println("maior: "+maior+ "posição "+posi1);
        System.out.println("menor: "+menor+"posição "+posi2);
    }
}