package Build;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .borda("catupiry")
                .sabor("frango")
                .temQueijo(true)
                .build();

        System.out.println(pizza);
    }
}
