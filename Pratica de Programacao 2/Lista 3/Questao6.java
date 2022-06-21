import java.util.Scanner;
public class Questao6{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetora[] = new int[10];
        int vetorb[] = new int[10];
        int i;
        i=0;
        for (i=0;i<10;i++){
            vetora[i]=sc.nextInt();
            System.out.println("posicao " + i + " = " + vetora[i]);
        }
        for (i=0;i<10;i++){
            vetorb[9-i]=vetora[i];
            System.out.println("posicao " + i + " = " + vetorb[i]);
        }
    }
}