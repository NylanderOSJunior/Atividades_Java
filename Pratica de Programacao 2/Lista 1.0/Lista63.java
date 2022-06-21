import java.util.Scanner;
public class Lista63 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vet[][] = new int [6][4];
        int i, j, soma;
        i=0;
        j=0;
        soma=1;
        for(i=0;i<6;i++){
            for(j=0;j<4;j++){
                soma=soma*7;
                vet[i][j]=soma; 
            }
        }
        for(i=0;i<6;i++){
            for(j=0;j<4;j++){
                System.out.print(vet[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}