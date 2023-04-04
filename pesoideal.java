import java.util.Scanner;
public class pesoideal  {

    double pesoH;
    double pesoM;
    char genero;
    public static void main(String[]args) throws  Exception{
Scanner input = new Scanner(System.in);

System.out.println(" Digite sua altura ");
float altura = input.nextFloat();

System.out.println(" Digite seu gêne1ro  F ou M");
char genero = input.next().charAt(0); // Ler caracteres letras 


double pesoM = ( 72.7 * altura ) - 58;
double pesoF = ( 62.1 * altura ) - 44.7;


input.close();
if ( genero == 'M') {
System.out.print(" Seu peso ideal de acordo com sua altura é = " + pesoM);
}

else if ( genero == 'F') {
System.out.print("  Seu peso ideal de acordo com sua altura é = " + pesoF);
} else  {
    System.out.println(" gênero invalido ");
}

    }
}
