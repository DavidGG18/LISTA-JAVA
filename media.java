import java.util.Scanner;

public class media {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in); // tem que importar a Scanner pro programa funcionar
        
System.out.print(" Digite a 1º nota: "); // texto
int n1 = input.nextInt();                // Usuario digitar 

System.out.print(" Digite a 2º nota: ");
int n2 = input.nextInt();

System.out.print(" Digite a 3º nota: ");
int n3 = input.nextInt();

System.out.print("Digite a 4º nota: ");
float n4 = input.nextFloat();


float media = (n1 + n2 + n3 + n4) / 4;

System.out.printf(" A media das 4 notas é " + media); // + variavel pra mostrar ela ao lado do texto concatenação


}
}