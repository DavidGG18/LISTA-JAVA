import java.util.Scanner;

public class calcularhorastrabalhadas {

    public static void main (String[]args) throws Exception{
         Scanner input = new Scanner(System.in);
 
System.out.print(" Digite o quanto você ganha por hora ");
double valor = input.nextInt();

System.out.print( " Digite quantos horas você trabalhou " );
double hora = input.nextInt();

double salario = valor * hora ;

System.out.print(" O seu salario é " + salario );
    }

}