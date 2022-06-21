import java.util.Scanner;
public class Pesquisa2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,elementoa,elementob,elementoc;
        int vetora[] = new int[5];
        int vetorb[] = new int[5];
        int vetorc[] = new int[5];
        int vetord[] = new int[5];
        int vetore[] = new int[5];
        int elementod[] = new int[3];
        int elementoe[] = new int[3];
        i=0;
        j=0;
        for(i=0; i<5; i++){
            System.out.println("valor va: ");
            vetora[i]=sc.nextInt();
        }
        for(i=0; i<5; i++){
            System.out.println("valor vb: ");
            vetorb[i]=sc.nextInt();
        }
        for(i=0; i<5; i++){
            System.out.println("valor vc: ");
            vetorc[i]=sc.nextInt();
        }
        for(i=0; i<5; i++){
            System.out.println("valor vd: ");
            vetord[i]=sc.nextInt();
        }
        for(i=0; i<5; i++){
            System.out.println("valor ve: ");
            vetore[i]=sc.nextInt();
        }

        System.out.println("elemento Chave a");
        elementoa=sc.nextInt();
        System.out.println("elemento Chave b");
        elementob=sc.nextInt();
        System.out.println("elemento Chave c");
        elementoc=sc.nextInt();
        for(j=0;j<3;j++){
        System.out.println("elemento Chave d");
        elementod[j]=sc.nextInt();
        }
        for(j=0;j<3;j++){
            System.out.println("elemento Chave e");
            elementoe[j]=sc.nextInt();
            }
        
        System.out.println("vetor A");
        for(i=0;i<5;i++){
            if(vetora[i]==elementoa){
            System.out.print("chave encontrada: " +vetora[i]+", posicao: "+i);
            
            }
            else if(elementoa!=vetora[i]){
                System.out.print("chave nao encontrada na posicao: " +i+", ");
            }
        }
        System.out.println("vetor B");
        for(i=0;i<5;i++){
            if(vetorb[i]==elementob){
            System.out.print("chave encontrada: " +vetorb[i]+", posicao: "+i);
            
            }
            else if(elementob!=vetorb[i]){
                System.out.print("chave nao encontrada na posicao: " +i+", ");
            }
        }
        System.out.println("vetor C");
        for(i=0;i<5;i++){
            if(vetorc[i]==elementoc){
            System.out.print("chave encontrada: " +vetorc[i]+", posicao: "+i);
            
            }
            else if(elementoc!=vetorc[i]){
                System.out.print("chave nao encontrada na posicao: " +i+", ");
            }
        }
        
        System.out.println("vetor D");
        for(j=0;j<3;i++){
            System.out.println("vetor D");
        for(i=0;i<5;i++){
            if(vetord[i]==elementod[j]){
            System.out.print("chave encontrada: " +vetord[i]+", posicao: "+i);
            j=j+1;
            }
            else if(elementod[j]!=vetord[i]){
                System.out.print("chave nao encontrada na posicao: " +i+", ");
            }
        }
        }
        System.out.println("vetor E");
        for(j=0;j<3;i++){
            System.out.println("valor "+(1+j));
        for(i=0;i<5;i++){
            
            if(vetore[i]==elementoe[j]){
            System.out.print("chave encontrada: " +vetore[i]+", posicao: "+i);
            
            j=j+1;
            }
            else if(elementoe[j]!=vetore[i]){
                System.out.print("chave nao encontrada na posicao: " +i+", ");
            }
        }
        }
    }
}