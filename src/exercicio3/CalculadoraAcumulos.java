package exercicio3;

public class CalculadoraAcumulos {
    public void calcularAcumulo() {
        int soma = 0;
        for (int i = 0; i <= 100; i++) {
            soma += i;
            System.out.println("foi somado: " + soma);
        }

    }
}
