import java.util.Scanner;
public class Matriz2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int veta[][] = new int [10][10];
        int i, j,aux,aux1,aux2;
        i=0;
        j=0;
        for(i=0;i<10;i++){
            for(j=0;j<10;j++){
                veta[i][j]=sc.nextInt();
            }
            for(i=0;i<10;i++){
                for(j=0;j<10;j++){
            aux=veta[2][j];
            veta[2][j]=veta[8][j];
            veta[8][j]=aux;

            aux1=veta[i][4];
            veta[i][4]=veta[i][10];
            veta[i][10]=aux1;

            aux2=veta[5][j];
            veta[5][j]=veta[i][10];
            veta[i][10]=aux2;

            if(i==j){
                aux=veta[i][j];
                veta[i][j]=veta[i][9-j];
                veta[i][9-j]=aux;
            }
                }
            }
            for(i=0;i<10;i++){
                for(j=0;j<10;j++){
                    System.out.print(veta[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
    }
}