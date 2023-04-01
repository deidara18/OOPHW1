public class Espresso extends Coffee {


    public Espresso(String name, double temperature, double price, double size, int value) {
        super(name, temperature, size, price, value);
    }

    @Override
    public String toString() {
        return String.format("Кофе :  %s", super.toString());
    }
}
