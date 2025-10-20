package calculadora.conversor;

import java.util.Scanner;

public class ConversorTemperatura {
    private Double temperaturaC;
    private Double temperaturaF;
    private Double temperaturaK;

    private void capiturarTemperatura() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite a temperatura que está apontando no seu local:");
        temperaturaC = teclado.nextDouble();
    }

    private void converteTemperatura() {
        temperaturaF = temperaturaC * 1.8 + 32;
        temperaturaK = temperaturaC + 273.15;
        System.out.println("convertendo de Graus C para Graus F o resultado é : " + temperaturaF);
        System.out.println("Convertendo de Graus C para Graus K o resultado é: " + temperaturaK);
    }

    private void classificaTemperatura() {
        if (temperaturaC < 15) {
            System.out.println("está frio.");
        } else if ((temperaturaC >= 15) && (temperaturaC <= 28)) {
            System.out.println("A temperatura está agradável.");
        } else {
            System.out.println("está calor.");
        }
    }

    public void exibeConvercao() {
        System.out.println("Segue a baixo o resultado da sua conversão é :");
        capiturarTemperatura();
        converteTemperatura();
        classificaTemperatura();
    }
}
