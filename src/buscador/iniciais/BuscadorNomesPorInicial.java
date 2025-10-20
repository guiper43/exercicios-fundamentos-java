package buscador.iniciais;

import java.util.ArrayList;
import java.util.List;

public class BuscadorNomesPorInicial {
    public void verificarNomes() {
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("guilherme");
        listaNomes.add("gabriel");
        listaNomes.add("fabricio");

        for (String nome : listaNomes) {
if (nome.startsWith("g")){
    System.out.println("esses são os nomes que começam com a letra selecionada:"+ nome);
}
        }
    }
}
