import java.util.Scanner;
public class Matriz3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int veta[][] = new int [5][5];
        int vetb[] = new int [5];
        int vetc[] = new int [5];
        int i, b, j, p, t;
        i=0;
        b=0;
        p=0;
        t=0;
        j=0;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.println("digite numero");
                veta[i][j]=sc.nextInt();
                }
            }
            for(b=0;b<5;b++){
                    if(veta[i][j]>veta[i][j+1]){
                        vetb[b]=veta[i][j];
                        System.out.print("mairo da linha "+p+" é "+vetb[b]);
                        j=j+1;
                        p=p+1;
                    }
                        else{
                        vetb[b]=veta[i][j+1];
                        System.out.print("mairo da linha "+p+" é "+vetb[b]);
                        j=j+1;
                        p=p+1;
                        }
                    }
                    j=0;
                 for(t=0;t<5;t++){
                    if(veta[i][j]>veta[i+1][j]){
                    vetc[t]=veta[i][j];
                    System.out.print("mairo da linha "+p+" é "+vetc[t]);
                        p=p+1;
                        i=i+1;
                }

                    else{
                        vetc[t]=veta[i+1][j];
                        System.out.print("mairo da linha "+p+" é "+vetc[t]);
                        p=p+1;
                        i=i+1;
                    }
        }
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.print(veta[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}              