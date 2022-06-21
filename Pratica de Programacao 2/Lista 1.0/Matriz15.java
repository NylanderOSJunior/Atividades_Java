import java.util.Scanner;
public class Matriz15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int veta[][] = new int [5][5];
        String vet[] = new int [5];
        int i, j, consumo, t, percurso;
        i=0;
        j=0;
        t=0;
        for(t=0;t<5;t++){
            System.out.println("digite o nome de uma cidade ");
            vet[t]=sc.nextString();
        }
        System.out.println("consumo de combustivel a 1 KM");
        consumo=sc.nextInt();
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(j==i){
                    veta[i][j]=0;
                }
                else{
                veta[i][j]=sc.nextInt();
                }
                percurso=veta[i][j]*consumo;
                
            }
            for(i=0;i<5;i++){
                
                    System.out.print("cidade"+vet[i]);
                
                for(j=0;j<5;j++){
                    System.out.print("cidade"+vet[j]);
            if(percurso<250){
                System.out.print(" percurso de menos de 250 é:"+percurso);
            }
        }
            }
        }
    }
}
    
