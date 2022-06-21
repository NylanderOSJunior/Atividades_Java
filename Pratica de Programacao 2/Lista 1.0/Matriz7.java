import java.util.Scanner;
public class Matriz7 {

public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double veta[][] = new  double [4][7];
    
        int i, j,linha, colunam, colunan;
        double menor,maior;
        i=0;
        j=0;
        maior=0;
        linha=0;
        colunan=0;
        colunam=0;
        
        for(i=0;i<4;i++){
            for(j=0;j<7;j++){
                veta[i][j]=sc.nextDouble();
            }
        }
        menor=veta[1][1];
        for(i=0;i<4;i++){
            for(j=0;j<7;j++){
                if(veta[i][j]<menor){
                    menor=veta[i][j];
                    linha=i;
                    colunam=j;
                }
            }
        }

        for(j=0;j<7;j++){
            if(veta[linha][j]>maior){
                maior=veta[linha][j];
                colunan=j;
            }
        }
        System.out.println("menor "+menor+ "linha " +linha+ " Coluna "+ colunam);
        System.out.println("menor "+maior+ "linha " +linha+ " Coluna "+ colunan);

    }
}