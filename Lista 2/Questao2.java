import java.util.Scanner;
public class Questao2 {
public static void main(String[] args){
    //entrada de variaveis
int Ano, Idade, At, F;
// entrada de dados
Scanner sc= new Scanner (System.in);
System.out.print("Ano em que nasceu");
Ano = sc.nextInt();
System.out.print(" O ano atual");
At = sc.nextInt();
Idade= (Ano-At);
F= 2050-Ano;
//saida de dados

System.out.println("Ano que nasceu" + Ano);
System.out.println(" Ano atual" + At);
System.out.println(" Idade" + Idade);
System.out.println(" futura idade" + F);
}
}
