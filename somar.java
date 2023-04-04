import java.util.Scanner;

public class somar {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
System.out.print(" Digite um número: ");
int numero = input.nextInt();
System.out.print(" Digite outro número: ");
int numero2 = input.nextInt();

//System.out.printf(" O 1º numéro é  ", numero);
System.out.printf(" A soma dos números é  ");

int soma = numero + numero2;

System.out.println(soma);

}
}