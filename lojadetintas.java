import java.util.Scanner;

public class lojadetintas {

    public static void main (String[]args) throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.print(" Digite o tamanho em metros quadrados da área a ser pintada: ");
        double tamanho = input.nextDouble();

         // Calcular a quantidade de litros de tinta necessários
         double litros = tamanho / 3.0;
        
         // Calcular a quantidade de latas de tinta necessárias
         int latas = (int) Math.ceil(litros / 18.0);
         
         // Calcular o preço das latas de tinta
         double precoLatas = latas * 80.0;
        
         
         
         // Exibir o resultado para o usuário
         System.out.print("Para pintar %.2f m² de área, você precisa de:"+ tamanho + "\n");
         
         System.out.print("- %d lata(s) de tinta, ao custo total de R$%.2f\n"+ latas+ precoLatas);
 
 
 
 }}
 
 

