import java.util.Scanner;
public class Cardapio {
    public static void main (String[] args){
        Scanner sc= new Scanner (System.in);
        int Cod, Quantidade;
        double valor = 1;
        System.out.print("Escolha entre 1 a 5 1:cachorro quente, 2:hamburguer, 3:x-tudo, 4:suco, 5:fritas ");
        Quantidade= sc.nextInt();
        System.out.print(" quantidade do produto. ");
        Cod= sc.nextInt();
        switch (Cod) {
            case 1:
            valor= Quantidade*1.00;
            break;
            case 2:
            valor= Quantidade*2.00;
            break;
            case 3:
            valor= Quantidade*3.00;
            break;
            case 4:
            valor= Quantidade*4.00;
            break;
            case 5:
            valor= Quantidade*5.00;
            break;
            default:
            System.out.println("codigo invalido!");

        }
        System.out.println("Valor total:" +valor);
    }
}