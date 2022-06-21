import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args){
        //declarar variaveis
        float Pf, Pl, Pi, Valorlucro ,Valorimposto ,Valorvendido;
        //entrada de dados
        Scanner sc= new Scanner (System.in);
        System.out.print("Valor preco de fabrica");
        Pf= sc.nextFloat();
        System.out.println(" Percentual de lucro");
        Pl= sc.nextFloat();
        System.out.print(" percentual de impostos");
        Pi= sc.nextFloat();
        //Calculos matematicos
        Valorlucro= (Pf/100)*Pl;
        Valorimposto= (Pf/100)*Pi;
        Valorvendido= Pf+Valorlucro+Valorimposto;

        //Dreclarar saida

        System.out.println("Preco de fabrica" +Pf);
        System.out.println("Percentual desconto" + Pl);
        System.out.println("Percentual de impostos" + Pi);
        System.out.println("Valor lucro" + Valorlucro);
        System.out.println("Valor imposto" + Valorimposto);
        System.out.println("Valor do automovel" + Valorvendido);

    }
}