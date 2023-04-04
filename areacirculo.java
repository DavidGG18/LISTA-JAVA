import java.util.Scanner;

public class areacirculo {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); // tem que importar a Scanner para o programa funcionar

System.out.print(" Digite o valor do raio do circulo");

double raio = input.nextInt();


double area = (raio * raio) * 3.14  ; 

 //System.out.print("O valor da área do circulo e igual á  ") + area; 
System.out.print( "O valor da aréa e " + area);

    }}
