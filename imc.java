import java.util.Scanner;

public class imc {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        
System.out.print(" Digite seu peso: ");
double peso = input.nextDouble();

System.out.print(" Digite sua altura: ");
double altura = input.nextDouble();

double imc = peso / (altura * altura);


if (imc < 18.5) {
    System.out.printf(" abaixo do peso ");
} 
 if (imc < 25) {
    System.out.printf("Normal peso");
  }
  if (imc < 30) {
    System.out.printf("sobrepeso");
} 

}
}