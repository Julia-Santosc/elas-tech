package HashSet;
//4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
//imprima de novo, junto com o tamanho.

import java.util.HashSet;

public class AtividadeQuatro {
    public static void main(String[] args) {
        HashSet<String> cpfs = new HashSet<>();
        cpfs.add("121.353.728-11");
        cpfs.add("325.659.254-22");
        cpfs.add("821.313.554-23");

        System.out.println("CPFs iniciais: " + cpfs);

        // Remove algo específico pelo valor
        cpfs.remove("121.353.728-11");

        System.out.println("Após a remoção: " + cpfs);
        System.out.println("Tamanho atual: " + cpfs.size());
    }
}

