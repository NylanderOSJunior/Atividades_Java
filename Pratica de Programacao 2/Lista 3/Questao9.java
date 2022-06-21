import java.util.Scanner;
public class Questao9{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetora[] = new int[12];
        int i,p,soma,t;
        i=0;
        t=1;
        soma=0;
        for (i=0;i<12;i++){
            vetora[i]=sc.nextInt();
            System.out.println("posicao " + i + " = " + vetora[i]);
        }
        for(t=1;t<2;i++){
            System.out.println("posicao ");
            p=sc.nextInt();
            soma=soma+vetora[i+p];
        }
        System.out.println("soma de x e y e "+soma);
    }
}