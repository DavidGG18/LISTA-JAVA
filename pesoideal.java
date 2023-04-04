import java.util.Scanner;
public class pesoideal  {


    public static void main(String[]args) throws  Exception{
Scanner input = new Scanner(System.in);

System.out.println(" Digite sua altura ");
double altura = input.nextInt();

System.out.print(" Digite seu genro  F ou M");
//char genero = input.nextChar();
char genero;
 genero = input.next().charAt(0);
double pesoM = ( 72.7 * altura ) - 58;
double pesoF = ( 62.1 * altura ) - 44.7;
input.close();
if (genero=='M') {
System.out.print(" Seu peso ideal de acordo com sua altura é = " + pesoM);
}

if (genero=='F') {
System.out.print("  Seu peso ideal de acordo com sua altura é = " + pesoF);
}

    }
}