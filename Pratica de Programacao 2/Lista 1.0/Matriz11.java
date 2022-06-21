import java.util.Scanner;
public class Matriz11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int veta[][] = new int [2][2];
        int i, j, maior;
        i=0;
        j=0;
        maior=0;
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                veta[i][j]=sc.nextInt();
                if(veta[i][j]>maior){
                    maior=veta[i][j];
                }

            }
        }
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                veta[i][j]=veta[i][j]*maior;
            }
        }
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(veta[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}