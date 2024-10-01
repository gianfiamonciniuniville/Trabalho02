public enum Moeda {
    USD(1.0),
    EUR(0.85),
    BRL(5.35),
    GBP(0.75);

    private final double rate;

    Moeda(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}