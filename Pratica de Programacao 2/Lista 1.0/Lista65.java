import java.util.Scanner;
public class Lista65 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float vet[][] = new float [5][4];
        int veta[] = new int [5];
        int vetb[] = new int [5];
        int i, j;
        i=0;
        j=0;
        for(i=0;i<5;i++){
            System.out.println("digite o nome do produto ");
            veta[i]=sc.nextInt();
        }
        for(i=0;i<5;i++){
            System.out.println("digite o preco do transporte ");
            vetb[i]=sc.nextInt();
        }
        for(i=0;i<5;i++){
            for(j=0;j<4;j++){
                vet[i][j]=sc.nextInt(); 
            }
        }
        for(i=0;i<5;i++){
            for(j=0;j<4;j++){
                if(vet[i][j]<=50){

                    vet[i][j]=(float)(vet[i][j]*0.05);
                    vetb[i]=vetb[i];
                } 
                if ((vet[i][j]>50)&&(vet[i][j]<=100)){
                    vet[i][j]=(float)(vet[i][j]*0.1);
                    vetb[i]=vetb[i];
                }
                if (vet[i][j]>100){
                    vet[i][j]=(float)(vet[i][j]*0.2);
                    vetb[i]=vetb[i];
                }
            }
        }
        for(i=0;i<5;i++){
            System.out.print("produto: "+ veta[i]+ " ");
            for(j=0;j<4;j++){
                System.out.print("valor"+ vet[i][j]+ " valor trasporte : "+vetb[i]);
            }
        }
    }
}