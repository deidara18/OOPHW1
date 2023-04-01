import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Coffee> coffees = new ArrayList<>();
    private double money = 0;

    public CoffeeMachine addCoffee(Coffee coffee) {
        coffees.add(coffee);
        return this;
    }

    public Coffee searchProduct(String name) {
        for (Coffee item : coffees) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public Coffee sell(String name) throws Exception {
        Coffee target = searchProduct(name);
        try {
            if (!target.sellCounter()) {
                coffees.remove(target);
            }
            this.money += target.getPrice();
        } catch (NullPointerException e) {
            throw new Exception("Товар не найден", e);
        }
        return target;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Coffee item : coffees) {
            res.append(item);
            res.append("\n");
        }
        res.append(String.format("В автомате сейчас %.2f рублей", money));
        return res.toString();
    }
}