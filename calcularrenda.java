import java.util.Scanner;

public class calcularrenda {

 
    public static void main (String[]args) throws Exception{
        Scanner input = new Scanner(System.in);

System.out.print(" Digite o quanto você ganha por hora ");
double hora = input.nextDouble();

System.out.print("Digite quantas horas você trabalhou nesse mês ");
double mes = input.nextDouble();

double salario = hora * mes;      // Salário inteiro
double imposto = salario - (salario * 8/100) ; // imposto de renda
double salarioII = imposto - imposto * (11/100) ; // salário -  INSS e imposto de renda 
double salarioB = salarioII - (salarioII * 0.05)  ; // salário - INSS, imposto e sindicato  
double INSS = salario - imposto;
double sindicato = salarioII - salarioB ;


System.out.print( "O seu salário bruto do mês R$ " +salario);
System.out.print("\n");
System.out.print(" O seu salário -8% do imposto de renda é R$ " + imposto);
System.out.print("\n");
System.out.print ("O seu salário liquido com 8% de desconto do imposto de renda e 11% de desconto do INSS é  5% do sindicato R$"+salarioB);
System.out.print("\n");
System.out.print("Você pagou R$ " + INSS );
System.out.print("\n");
System.out.print ( "você pagou ao sindicato R$ " +sindicato );








}}
