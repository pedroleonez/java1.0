package POO.BASICO;

public class CurrencyConverter {
    public static final double IOF = 1.06;

    public static double price;
    public static double amount;

    public static double conversor() {
        return price * amount * IOF;
    }
}
