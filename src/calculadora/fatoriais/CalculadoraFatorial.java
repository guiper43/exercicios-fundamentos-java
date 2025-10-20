package calculadora.fatoriais;

import java.util.Scanner;

public class CalculadoraFatorial {
    public void verificarFatorial() {
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
