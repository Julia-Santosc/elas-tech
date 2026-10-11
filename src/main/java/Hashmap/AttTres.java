package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class AttTres {
    static void main() {
        Map<String, String> agenda = new HashMap<>();

        agenda.put("Joao", "121565456");
        agenda.put("Julia", "164984653");

        if (agenda.containsKey("Joao")) {
            System.out.println(agenda.get("Joao"));
        }

        if (agenda.containsKey("Jose")) {
            System.out.println(agenda.get("Jose"));
        }

    }
}

//3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
//dentro de um if para mostrar o telefone de alguém que está na agenda
//e de alguém que não está.
