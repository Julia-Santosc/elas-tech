package ForEach;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    static void main() {
        ArrayList<String> animais = new ArrayList<>(List.of("Macaco", "Leão", "Passarinho"));
        for (String animal : animais) {
            System.out.println(animal);
        }
    }
}

//só vai afzer de um em um começando do inicio ate o final, nao consegue acessar o indice (i)..melhor usar o for normal mesmo
