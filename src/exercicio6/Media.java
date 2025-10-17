package exercicio6;

import java.util.Scanner;

public class Media {
    public void calcularMedia(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite a primeira nota a ser calculada.");
        Double n1 = teclado.nextDouble();
        System.out.println("digite a segunda nota a ser calculada.");
        Double n2 = teclado.nextDouble();
        System.out.println("digite a tercera nota a ser calculada.");
        Double n3 = teclado.nextDouble();
        System.out.println("digite a quarta nota a ser calculada.");
        Double n4 = teclado.nextDouble();
        Double media = (n1 + n2 + n3 + n4) /4;
        System.out.println("o total da sua média calculada é :" + media);
    }
}
