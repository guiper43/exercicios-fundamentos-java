package exercicio5;

import java.util.Scanner;

public class BuscadorVogais {
    public void acharVogais() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("dgite uma fraze para ser contada.");
        String texto = teclado.nextLine();
        int contador = 0;
        String vogais = "aeiou";
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (vogais.indexOf(letra) != -1) {
                contador++;
            }
        }
        System.out.println("o total de vogais é:" + contador);
    }
}
