import java.util.Scanner;
public class Questao1 {
    public static void main (String[] args){     
Scanner sc= new Scanner (System.in);
float Pes, Polegadas, Jardas, Milhas;
System.out.print("Digite o valor de Pes: ");
Pes = sc.nextFloat();
Polegadas =(float) Pes*12;
Jardas=(float) (Pes/3);
Milhas =(float) (Jardas/1760);
System.out.println("Pes: " + Pes);
System.out.println("Polegadas: " + Polegadas);
System.out.println("Jardas: " + Jardas);
System.out.println("Milhas: " + Milhas);
    }
}