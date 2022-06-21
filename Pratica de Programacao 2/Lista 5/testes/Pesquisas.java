import java.util.Scanner;
public class Pesquisas {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,elementoa,elementob,elementoc,elementod,elementoe;
        int vetora[] = new int[5];
        int vetorb[] = new int[5];
        int vetorc[] = new int[5];
        int vetord[] = new int[5];
        int vetore[] = new int[5];
        i=0;
        
        for(i=0;i<5;i++){
            System.out.println("valor a:");
            vetora[i]=sc.nextInt();
            System.out.println("valor b:");
            vetorb[i]=sc.nextInt();
            System.out.println("valor c:");
            vetorc[i]=sc.nextInt();
            System.out.println("valor d:");
            vetord[i]=sc.nextInt();
            System.out.println("valor e:");
            vetore[i]=sc.nextInt();
        }
        System.out.println("elemento Chave a: ");
        elementoa=sc.nextInt();
        System.out.println("elemento Chave b: ");
        elementob=sc.nextInt();
        System.out.println("elemento Chave c: ");
        elementoc=sc.nextInt();
        System.out.println("elemento Chave d: ");
        elementod=sc.nextInt();
        System.out.println("elemento Chave e: ");
        elementoe=sc.nextInt();

        for(i=0;i<5;i++){
            if(vetora[i]==elementoa){
                System.out.print("chave encontrada: " +vetora[i]+", posicao: "+i);
                
                }
                else if(elementoa!=vetora[i]){
                    System.out.print("chave nao encontrada na posicao: " +i+", ");
                }
                    if(vetorb[i]==elementob){
                    System.out.print("chave encontrada: " +vetorb[i]+", posicao: "+i);
                    
                    }
                    else if(elementob!=vetorb[i]){
                        System.out.print("chave nao encontrada na posicao: " +i+", ");
                    }
                    if(vetorc[i]==elementoc){
                        System.out.print("chave encontrada: " +vetorc[i]+", posicao: "+i);
                        
                        }
                        else if(elementoc!=vetorc[i]){
                            System.out.print("chave nao encontrada na posicao: " +i+", ");
                        }
                        if(vetord[i]==elementod){
                            System.out.print("chave encontrada: " +vetord[i]+", posicao: "+i);
                            
                            }
                            else if(elementod!=vetord[i]){
                                System.out.print("chave nao encontrada na posicao: " +i+", ");
                            }
                            if(vetore[i]==elementoe){
                                System.out.print("chave encontrada: " +vetore[i]+", posicao: "+i);
                                
                                }
                                else if(elementoe!=vetore[i]){
                                    System.out.print("chave nao encontrada na posicao: " +i+", ");
                         }                 
          }
          int vetorf[] = new int[5];
          int vetorg[] = new int[5];
          int elementof[] = new int[3];
          int elementog[] = new int[3];
          j=0;
        for(i=0;i<5;i++){
            System.out.println("valor f:");
            vetorf[i]=sc.nextInt();
            System.out.println("valor g:");
            vetorg[i]=sc.nextInt();
        }
        for(i=0;j<3;j++){
        System.out.println("elemento Chave f: ");
        elementof[j]=sc.nextInt();
        System.out.println("elemento Chave g: ");
        elementog[j]=sc.nextInt();
        }
        for(i=0;i<5;i++){
            for(i=0;j<3;j++){
            if(vetorf[i]==elementof[j]){
                System.out.print("chave encontrada: " +vetorf[i]+", posicao: "+i);
                
                }
                else if(elementof[j]!=vetorf[i]){
                    System.out.print("chave nao encontrada na posicao: " +i+", ");
                }
                    if(vetorg[i]==elementog[j]){
                    System.out.print("chave encontrada: " +vetorg[i]+", posicao: "+i);
                    
                    }
                    else if(elementog[j]!=vetorg[i]){
                        System.out.print("chave nao encontrada na posicao: " +i+", ");
                    }
                }


       }
  }
}
