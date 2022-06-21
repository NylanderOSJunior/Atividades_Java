import java.util.Scanner;
public class Lista66 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vet[][] = new int [3][6];
        int veta[] = new int [18];
        int i, j,t;
        i=0;
        j=0;
        t=0;
        for(i=0;i<18;i++){
            veta[i]=sc.nextInt();    
            }
            t=0;
        for(i=0;i<3;i++){
            for(j=0;j<6;j++){
                vet[i][j]=veta[t]; 
                t=t+1;
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<6;j++){
                System.out.print(vet[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}