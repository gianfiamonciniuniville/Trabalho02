public class Calculadora {
    private double amount;
    private Moeda fromCurrency;
    private Moeda toCurrency;

    public Calculadora(double amount, Moeda fromCurrency, Moeda toCurrency) {
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    public double calculadora() {
        double amountInUSD = amount / fromCurrency.getRate();
        return amountInUSD * toCurrency.getRate();
    }
}
