import java.util.Scanner;
public class Area_circunferencia {
    Scanner sc = new Scanner (System.in);
    int raio;

    public void setRaio(int raio) {
        this.raio = raio;
        }
    public int getRaio() {
        return raio;
        }
     
     public boolean Area(){
        return (3.14159 * Math.pow(request.getRaio(raio),2));
     }
     void Resultado(){
        System.out.println("R=" + getRaio());
        System.out.println("Area=" + Area()); 
     }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int raio;
        Area_circunferencia areacircunferencia;
        areacircunferencia = new Area_circunferencia();
        System.out.print("Digite o valor de R");
        raio = sc.nextInt();
        areacircunferencia.setRaio(raio);
        areacircunferencia.Resultado();
    }
}