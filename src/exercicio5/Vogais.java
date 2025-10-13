package exercicio5;

public class Vogais {
    public void acharVogais() {
        String texto = "abensoado seja meu dia e minha tragetoria";
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
