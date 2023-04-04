import java.util.Scanner;

public class calcularnumero {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); // tem que importar a Scanner pro programa funcionar

System.out.print(" Digite o 1º número: "); // texto
int n1 = input.nextInt();                // Usuario digitar 

System.out.print(" Digite o 2º númeross: ");
int n2 = input.nextInt();

System.out.print("Digite o 3º número real");
double n3 = input.nextInt();

// A) o produto do dobro do primeiro com metade do segundo .
double dobro = (n1*n1) + (n2/2);
System.out.print(" A) o produto do dobro do primeiro com metade do segundo e igual á " + dobro);

// B) a soma do triplo do primeiro com o terceiro.
double somat = (n1 * 3) + n3;
System.out.print(" B) a soma do triplo do primeiro com o terceiro e igual á "+ somat);

// C) O terceiro elevado ao cubo.
double cubo = (n3 * n3 * n3);
System.out.print( " C) O terceiro elevado ao cubo. é igual á " + cubo);

}}