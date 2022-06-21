import java.util.Scanner;
public class Matriz8 {

public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int veta[][] = new int [15][5];
        int vet[] = new int [75];
    
        int i, j,a, t, p, veri;
        i=0;
        j=0;
        t=0;
        p=0;
        veri=0;
        for(i=0;i<15;i++){
            for(j=0;j<5;j++){
                veta[i][j]=sc.nextInt();
            }
        }
        for(t=0;t<15;t++){
            for(p=0;p<5;p++){
        for(i=0;i<15;i++){
            for(j=0;j<5;j++){
                if(veta[t][p]==veta[i][j]){
                    veri=veri+1;
                }
                
            }
        }
        for(a=0;a<75;a++){
            vet[a]=veri;
            }
        }
    }
    a=0;
    for(t=0;t<15;t++){
        for(p=0;p<5;p++){
            System.out.println("numero: " +veta[i][j]+ " repete: "+vet[a]);
            a=a+1;
        }
    }
}
}