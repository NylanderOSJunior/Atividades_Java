import java.util.Scanner;
public class Lista62 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vet[][] = new int [10][20];
        int veta[] = new int [10];
        int i, j, soma;
        i=0;
        j=0;
        soma=0;
        for(i=0;i<10;i++){
            for(j=0;j<4;j++){
                vet[i][j]=sc.nextInt();
                soma=soma+vet[i][j];
            }
            veta[i]=soma;
            soma=0;
        }
        for(i=0;i<10;i++){
            for(j=0;j<4;j++){
                vet[i][j]=  vet[i][j]*veta[i];
            }
        }
        for(i=0;i<10;i++){
            for(j=0;j<20;j++){
                System.out.print(vet[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}