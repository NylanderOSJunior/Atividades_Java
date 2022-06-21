import java.util.Scanner;
public class Matriz16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int veta[][] = new int [5][5];
        int vetb[] = new int [5];
        int vetc[] = new int [10];
        int i, j, t, l, multi, maior, menor,soma, consumo;
        i=0;
        j=0;
        t=0;
        multi=0;
        soma=0;
        maior=0;
        menor=1000;
        for(t=0;t<5;t++){
            System.out.println("digite o nome de uma cidade ");
            vetb[t]=sc.nextInt();

            if(vetb[t]>maior){
                maior=vetb[t];
            }
        }
        for(t=0;t<10;t++){
            System.out.println("digite o nome de uma cidade ");
            vetc[t]=sc.nextInt();
            if(vetc[t]<menor){
                menor=vetc[t];
            }
        }
        System.out.println("consumo de combustivel a 1 KM");
        consumo=sc.nextInt();
        for(i=0;i<4;i++){
            for(j=0;j<3;j++){
                veta[i][j]=sc.nextInt();
            }
        }
        l=0;
        multi=maior*menor;
        for(i=0;i<4;i++){
            for(j=0;j<3;j++){
                veta[i][j]=veta[i][j]*multi;
                if(veta[l][j] % 2 == 0){
                    soma=soma+veta[i][j];
                }
            }
            l=l+1;
        }
    }
}