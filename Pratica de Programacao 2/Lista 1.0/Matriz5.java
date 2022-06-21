import java.util.Scanner;
public class Matriz5 {

public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int veta[][] = new int [8][8];
    
        int i, j, veri;
        i=0;
        j=0;
        
        for(i=0;i<8;i++){
            for(j=0;j<8;j++){
                veta[i][j]=sc.nextInt();
            }
        }
        if((veta[i][j])==(veta[j][i])){
            veri= 1;
        }
        else{
            veri= 2;
        }
        
        for(i=0;i<10;i++){
            for(j=0;j<20;j++){
                System.out.print(veta[i][j]+" ");
            }
            System.out.println(" ");
        }
        if(veri==1){
            System.out.print(" Ha simetria");
        }
        else{
            System.out.print(" Nao ha simetria");
        }
    }
}
