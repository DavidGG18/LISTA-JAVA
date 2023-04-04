import java.util.Scanner;
public class areadoquadrado {

 
    public static void main (String[]args) throws Exception{
        Scanner input = new Scanner(System.in);

System.out.print(" Digite o valor do lado a do quadrado");
double ladoa = input.nextDouble();

System.out.print( " Digite o valor do lado b do quadrado " );
double ladob = input.nextDouble();

double area = (ladoa * ladob) * 2;

System.out.print(" O dobro da aréa do quadrado é " + area );



    }

}