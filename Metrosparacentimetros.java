import java.util.Scanner;

public class Metrosparacentimetros {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); // tem que importar a Scanner pro programa funcionar
        
System.out.print(" Digite um valor em metros : "); // texto
double metros = input.nextDouble();                // Usuario digitar 




double centimetro = metros * 100;

System.out.println(" O valor em centimetros " + centimetro); // + variavel pra mostrar ela ao lado do texto



}
}