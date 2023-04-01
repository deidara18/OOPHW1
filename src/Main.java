public class Main {
    //    Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные: наименование, объем, температура, цена.
//    Проинициализировать несколько напитков в классе main и торговый автомат, воспроизвести логику продажи напитков. Сделать на основе ООП
    public static void main(String[] args) {
        CoffeeMachine cof = new CoffeeMachine();
        cof.addCoffee(new Coffee("Капучино", 54, 250, 160, 10))
                .addCoffee(new Espresso("Эспрессо", 58, 50, 100, 15))
                .addCoffee(new Coffee("Латте кедровый орех", 60, 350, 230, 30))
                .addCoffee(new Americano("Американо", 60, 180, 120, 25));

        System.out.println(cof);
//        PrintSell("Эспрессо", cof);
//
//        PrintSell("Латте кедровый орех", cof);
//
//        PrintSell("Капучино", cof);
//        System.out.println(cof);

    }

    public static void PrintSell(String nameCoffee, CoffeeMachine machine) {
        try {
            System.out.println(machine.sell(nameCoffee));
        } catch (Exception e) {
            System.out.println("Товар не найден");
        }
    }
}