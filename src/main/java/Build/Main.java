package Build;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.Builder()
        .borda("Catupiry")
        .sabor("Mussarela")
        .temQueijo(true)
        .Build();

    }
}
