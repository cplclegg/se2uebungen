package u2;

public class Main {
    public static void main(String[] args) {
        PDecorator order1 = new Tomate(new Parmesan(new Margherita()));
        PDecorator order2 = new Parmesan(new Salami());
        System.out.println("Order 1: " + order1.price());
        System.out.println("Order 2: " + order2.price());
    }
}
