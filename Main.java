import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------- Calculadora de Conversão de Moedas -----------");

        System.out.println("Selecione a moeda de origem: ");
        for(Moeda moeda : Moeda.values()){
            System.out.println(moeda);
        }
        Moeda fromCurrency = Moeda.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Selecionado -> "+ fromCurrency);
        System.out.println("Selecione a moeda de destino: ");
        for(Moeda moeda : Moeda.values()){
            System.out.println(moeda);
        }
        Moeda toCurrency = Moeda.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Selecionado -> "+ toCurrency);
        System.out.print("Digite o valor a ser convertido: ");
        double amount = scanner.nextDouble();

        System.out.println("---------------------------------------------------------");

        Calculadora calculadora = new Calculadora(amount, fromCurrency, toCurrency);
        double result = calculadora.calculadora();
        System.out.printf("%.2f %s é igual a %.2f %s%n", amount, fromCurrency, result, toCurrency);

        scanner.close();
    }
}