public class Coffee {
    private String name;
    private double size;
    private double temperature;

    private double price;

    private int counter;

    public Coffee(String name, double temperature, double size, double price, int value) {
        this.name = name;
        this.temperature = temperature;
        this.size = size;
        this.price = price;
        counter = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price * 2;
    }

    public boolean sellCounter() {
        this.counter--;
        return counter > 0;
    }

    @Override
    public String toString() {
        return String.format("Кофе :  %s : , Температура кофе = %s, Объём порции = %s мл, Стоимость = %.2f p.", name, temperature, size, price);
    }
}

