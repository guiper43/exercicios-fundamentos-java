package exercicio1;

import java.util.Scanner;

public class Pares {
    public void verificaPar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número para ser verificado");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
System.out.println("o número digitado é par.");
        } else {
            System.out.println("o número digitado é impar.");
        }
    }
}
