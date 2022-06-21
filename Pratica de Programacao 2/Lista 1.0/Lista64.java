import java.util.Scanner;
public class Lista64 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vet[][] = new int [4][4];
        int i, j, maior;
        i=0;
        j=0;
        maior=1;
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                vet[i][j]=sc.nextInt(); 
                if(vet[i][j]>maior){
                    maior=vet[i][j];
                }
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                vet[i][j]=vet[i][j]*maior; 
                
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.print(vet[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}