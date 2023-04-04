import java.util.Scanner;

public class pescador {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in); // tem que importar a Scanner pro programa funcionar
        
System.out.print(" Digite o peso do peixe : "); // texto
double peso = input.nextDouble();                // Usuario digitar 

if (peso <= 50) {
    
 System.out.printf("você não precisa pagar multa ");
}

if (peso >= 51){ 
  double excesso = peso - 50;
  double multa = excesso * 4;

   System.out.printf( "o peso do peixe é  " + peso);
   System.out.printf( " \n Você utrapassou KG "  + excesso);
   System.out.printf ( " \n E o valor da Multa vai ser de : " + multa + "\n");
}
    }}