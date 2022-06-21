import java.util.Scanner;
public class Questao5{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetor[] = new int[10];
        int i,porcentagem2,porcentagem1;
        i=0;
        porcentagem1=0;
        porcentagem2=0;
        for (i=0;i<10;i++){

            vetor[i]=(int)Math.round(Math.random() * 1);

            if(vetor[i]==0){
                porcentagem1++;
            }
            else{
                porcentagem2++;
            }  
        }
        porcentagem1=porcentagem1*10;
        porcentagem2=porcentagem2*10;
        System.out.println(porcentagem1 + "%" +  " sao iguais a 0 " );
        System.out.println(porcentagem2 + "%" +  " sao iguais a 1 " );
    }
}