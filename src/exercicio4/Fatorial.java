package exercicio4;

import java.util.Scanner;

public class Fatorial {
    public void verificaFatorial() {
        System.out.println("digite o número que quer que seja fatorado ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int fatorial = 1;
        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
            System.out.println("o fatorial de " + numero + "é:" + fatorial);
        }
    }


}
