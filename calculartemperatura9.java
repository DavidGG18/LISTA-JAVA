import java.util.Scanner;
public class calculartemperatura9 {

    public static void main (String[]args) throws Exception{
         Scanner input = new Scanner(System.in);
 
System.out.print(" Digite a temperatura em Fahrenheit ");
double Fahrenheit = input.nextInt();


double celsius = 5 * ((Fahrenheit-32) / 9);

System.out.print(" A temperatura digitada convertida para Celsius é " + celsius );
    }

}