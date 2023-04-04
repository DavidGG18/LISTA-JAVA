import java.util.Scanner;

public class lojadetintas2 {

    public static void main (String[]args) throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.print(" Digite o tamanho em metros quadrados da área a ser pintada: ");
        double tamanho = input.nextDouble();

        // Calcular a quantidade de litros de tinta necessários
        double litros = tamanho / 6.0;
        
        // Calcular a quantidade de latas de tinta necessárias
        int latas = (int) Math.ceil(litros / 18.0);
        
        // Calcular o preço das latas de tinta
        double precoLatas = latas * 80.0;
        
        // Calcular a quantidade de galões de tinta necessários
        int galoes = (int) Math.ceil(litros / 3.6);
        
        // Calcular o preço dos galões de tinta
        double precoGaloes = galoes * 25.0;
        
        // Exibir o resultado para o usuário
        System.out.printf("Para pintar %.2f m² de área, você precisa de:\n", tamanho);
        System.out.printf("- %d lata(s) de tinta, ao custo total de R$%.2f\n", latas, precoLatas);
        System.out.printf("- %d galão(ões) de tinta, ao custo total de R$%.2f\n", galoes, precoGaloes);



}}

