import java.util.Scanner;
public class Funcionarios {
private String nome;
private String endereço;
 private float salario;
 private Strinf função;
public String getNome() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;
 }
 public String getEndereço() {
return endereço;
}
public void setEndereço(String endereço) {
this.endereço = endereço;
 }
 public float getSalario() {
return salario;
}
public void setSlario(float salario) {
this.salario = salario;
 }
 public String getFunção() {
return função;
}
public void setFunção(String função) {
this.função = função;
 }
 public static void main(String[] args) {
 Scanner sc=new Scanner (System.in);
 int i,n;
 String nomef,endereçof,funçãof;
 float salariof;
 Funcionarios funcionarios[];
 funcionarios = new Funcionarios[50];
 i=0;
 do{
 System.out.println("Digite o nome do Funcionario: ");
 nomef=sc.nextLine();
 funcionarios[i].setNome(nomef);
 System.out.println("Digite o endereço do Funcionario: ");
 endereçof=sc.nextLine();
 funcionarios[i].setEndereço(endereçof);
 System.out.println("Digite salario do Funcionario: ");
 salariof=sc.nextFloat();
 funcionarios[i].setSalario(salariof);
 System.out.println("Digite a função do Funcionario: ");
 funçãof=sc.nextLine();
 funcionarios[i].setFunção(funçãof);
 i=i+1;
 n=i;
 }while (nomef!='0');
 for(i=0;i<n;i++){
 if(funcionarios[i].getSalario()>500){
 funcionarios[i].getNome();
 funcionarios[i].getEndereço();
 funcionarios[i].getSalario();
 funcionarios[i].getFunção();
 }
 }
 }
}