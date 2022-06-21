import java.util.Scanner;
public class Binario {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,inicio,t,fim,meio,elemento,chave;
        int vetora[] = new int[30];
        i=0;
        t=0;
        inicio=0;
            for(i=0;i<30;i++){
                vetora[i]=sc.nextInt();
            }
            //Ordenação de Inserção
            for (i=1;i<vetora.length;i++){
                chave=vetora[i];
                t=i-1;
                
                while(t>-1 && chave<vetora[t]){
                    vetora[t+1]=vetora[t];
                    t--;               
                }
            vetora[t+1]=chave; 
            }
            for(t=0;t<vetora.length;t++){
                System.out.print(+vetora[t+1]+" ");
            }
            //Fim da inserção
            
            fim=i;
            System.out.println("chave que quero: ");
            elemento=sc.nextInt();
            meio=(inicio+fim)/2;
            
            while(elemento!=vetora[meio]){
                if(elemento<vetora[meio]){
                    fim=meio;
                }
                if(elemento>vetora[meio]){
                    inicio=meio;
                }
                meio=(inicio+fim)/2;
            }
            System.out.println("elemento encontrado: "+vetora[meio]+" posicao: "+meio);
        }
    }