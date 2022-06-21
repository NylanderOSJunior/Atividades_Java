import java.util.Scanner;
public class Lista61 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vet[][] = new int [8][4];
        String veta[] = new String [8];
        String vetb[] = new String [4];
        int i, j, t;
        float preco;
        i=0;
        j=0;
        t=0;
        preco=0;
        for(t=0;t<8;t++){
            System.out.println("digite o nome da loja ");
            veta[t]=sc.next();
        }
        for(t=0;t<4;t++){
            System.out.println("digite o nome do produto ");
            vetb[t]=sc.next();
        }
        for(i=0;i<8;i++){
            System.out.print("loja"+ veta[i]+ " ");
            for(j=0;j<4;j++){
                preco=sc.nextFloat();
                System.out.print("produto"+ vetb[j]+ " valor: "+preco);
            }
        }
    }
}