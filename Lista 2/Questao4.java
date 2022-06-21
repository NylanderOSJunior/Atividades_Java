import java.util.Scanner;
public class Questao4 {
    public static void main (String[] args){
        //dreclarar variaveis
        float Valorhora, Salariominimo, Numerohoras, Salariobruto, Imposto, Salarioliquido;
        // entrada de dados
        Scanner sc= new Scanner(System.in);
        //declarar entrada
        System.out.print("Salariominimo");
        Salariominimo= sc.nextFloat();
        System.out.print("Numero de horas trabalhadas");
        Numerohoras= sc.nextFloat();
        //calculos
        Valorhora= (Salariominimo/2);
        Salariobruto= (Valorhora*Numerohoras);
        Imposto= (Salariobruto/100)*3;
        Salarioliquido= (Salariobruto-Imposto);
        //Declarar saida
        System.out.println("Salario minimo" + Salariominimo);
        System.out.println("Numero de horas trabalhadas" + Numerohoras);
        System.out.println("Valor hora" + Valorhora);
        System.out.println("Salario bruto" + Salariobruto);
        System.out.println("Imposto" + Imposto);
        System.out.println("Salario liquido" + Salarioliquido);
    }
}