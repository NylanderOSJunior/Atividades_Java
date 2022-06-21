import java.util.Scanner;
public class Questao1{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetor[] = new int[10];
        int i;
        i=0;
        for (i=0;i<10;i++){
            vetor[i]=sc.nextInt();
            System.out.println("Nota " + i + " = " + vetor[i]);
        }
        if(vetor[6]>60){
            System.out.println("Nota maior que 60");
        }
        else {
            System.out.println("Nota menor que 60");
        }
            System.out.println("selecione uma nota");
        i=sc.nextInt();
        if(vetor[i]>60){
            System.out.println("Nota maior que 60");
        }
        else {
            System.out.println("Nota menor que 60");
        }



    }
}