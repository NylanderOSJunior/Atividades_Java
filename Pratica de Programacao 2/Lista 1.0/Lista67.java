import java.util.Scanner;
public class Lista67 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vet[][] = new int [5][4];
        int i, j,l1,l2,l3,l4,l5, numero;
        i=0;
        j=0;
        l1=5;
        l2=5;
        l3=5;
        l4=5;
        l5=5;
        numero=0;
        for(i=0;i<5;i++){
            for(j=0;j<4;j++){
                numero=sc.nextInt(); 
                if(numero % 2==0){
                    if(l2>0){
                        vet[2][j]=numero;
                        l2=l2-1;
                        if(l2<=0){
                            System.out.print("limite atingido");
                        }
                    }
                    else if(l4>0){
                        vet[4][j]=numero;
                        l4=l4-1;
                        if(l4<=0){
                            System.out.print("limite atingido");
                        }
                    }
                    
                }
                else
                if(l1>0){
                    vet[1][j]=numero;
                    l1=l1-1;
                    if(l1<=0){
                        System.out.print("limite atingido");
                    }
                }
                else if(l3>0){
                    vet[3][j]=numero;
                    l3=l3-1;
                    if(l3<=0){
                        System.out.print("limite atingido");
                    }
                }
                else if(l5>0){
                    vet[5][j]=numero;
                    l5=l5-1;
                    if(l5<=0){
                        System.out.print("limite atingido");
                    }
                }
                               
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