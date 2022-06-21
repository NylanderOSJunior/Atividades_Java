import java.util.Scanner;
public class Matriz12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int veta[][] = new int [10][3];
        int i, j, menor, linha;
        i=0;
        j=0;
        linha=0;
        menor=100;
        for(j=0;j<3;j++){
            for(i=0;i<10;i++){
                veta[i][j]=sc.nextInt();
                if(veta[i][j]<menor){
                    menor=veta[i][j];
                    linha=i;
                }
                }
                System.out.print("a menor nota é: "+menor+"da prova: "+j+" na linha "+linha);
            }
        }
    }