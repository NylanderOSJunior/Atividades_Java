import java.util.Scanner;
public class Questao2{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetora[] = new int[10];
        int vetorb[] = new int[10];
        for (int i=0;i<10;i++){
            vetora[i]=sc.nextInt();
            System.out.println("posicao " + (i+1) + " = " + vetora[i]);
        }
        for (int j=0;j<10;j++){
            vetorb[j]=vetora[j]*j;
            System.out.println("posicao " + (j+1) + " = " + vetorb[j]);
        }
    }
}


























































