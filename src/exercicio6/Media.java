package exercicio6;

import java.util.Scanner;

public class Media {
    public void calcularMedia() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota a ser calculada.");
        Double n1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota a ser calculada.");
        Double n2 = teclado.nextDouble();
        System.out.println("Digite a terceira nota a ser calculada.");
        Double n3 = teclado.nextDouble();
        System.out.println("Digite a quarta nota a ser calculada.");
        Double n4 = teclado.nextDouble();
        Double media = (n1 + n2 + n3 + n4) / 4;
if (media >= 7.0){
    System.out.println("Você foi aprovado, parabêns sua média foi:"+ media);
} else if ((media >= 5.0) && (media< 7.0)) {
    System.out.println("Você ficou em recuperação. Sua média atingida foi: "+ media + "você precisa atingir no mínimo 7,0 para ser aprovado.");
} else {
    System.out.println("Infelismente fvocê foi reprovado. Sua média atingida foi: " + media);
}
teclado.close();
    }

}
