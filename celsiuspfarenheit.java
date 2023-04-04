import java.util.Scanner;



public class celsiuspfarenheit {
    public static void main(String[] args) throws Exception {
   Scanner input = new Scanner(System.in); // tem que importar a Scanner pro programa funcionar
    
System.out.print(" Digite a temperatura em celsius : "); // texto
double celsius = input.nextInt();    

double Fa = ( celsius *1.8) + 32;

System.out.println(" A temperatura em Farenheit é " + Fa); 

}
}