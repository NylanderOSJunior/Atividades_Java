import java.util.Scanner;
public class Questao1{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetora[] = new int[6];
        int vetorb[] = new int[6];
        int i;
        i=0;
        for (i=0;i<6;i++){
            vetora[i]=sc.nextInt();
            System.out.println("posicao " + i + " = " + vetora[i]);
        }
        for (i=0;i<6;i++){
            vetorb[i]=vetora[5-i];
            System.out.println("posicao " + i + " = " + vetorb[i]);
        }
    }
}
        