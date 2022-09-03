public class CurrencyConverter {

    public static double iof = 1.06;
    public static double conversion(double price, double reais) {
        return (price * reais) * iof;
    }
}