import java.util.Scanner;
public class Matriz4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int veta[][] = new int [10][20];
        int vetb[] = new int [10];
        int i, j, soma;
        i=0;
        j=0;
        soma=0;
        for(i=0;i<10;i++){
            for(j=0;j<20;j++){
                veta[i][j]=sc.nextInt();
                soma=soma+veta[i][j];
            }
            vetb[i]=soma;
        }
        for(i=0;i<10;i++){
            for(j=0;j<20;j++){
                veta[i][j]=veta[i][j]*vetb[i];
        
            }
        }
        for(i=0;i<10;i++){
            for(j=0;j<20;j++){
                System.out.print(veta[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}