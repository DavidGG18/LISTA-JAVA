import java.util.Scanner;

public class download {

 
    public static void main (String[]args) throws Exception{
        Scanner input = new Scanner(System.in);

System.out.print(" Digite o tamanho do arquivo : ");
double tamanho = input.nextDouble();

System.out.print(" Digite a velocidade do link da internet : ");
double velocidade = input.nextDouble();

double tempo = (tamanho / velocidade) * 60; // 60 é igual a 60 segundos = a 1 minuto  

    System.out.print("Tempo aproximado de download:  " + tempo + " minutos ");



    }}