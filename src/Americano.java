public class Americano extends Coffee{
    public Americano(String name, double temperature, double size, double price, int value) {
        super(name, temperature, size, price, value);
    }
    @Override
    public String toString() {
        return String.format("Кофе :  %s", super.toString());
    }
}
