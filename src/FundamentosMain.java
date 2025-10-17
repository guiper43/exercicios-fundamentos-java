import exercicio1.Pares;
import exercicio2.Nomes;
import exercicio3.Acumulo;
import exercicio4.Fatorial;
import exercicio5.Vogais;
import exercicio6.Media;

import java.util.Scanner;

public class FundamentosMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite a opção para executar o método correspondente a o exercicio solicitado.");
        int option = teclado.nextInt();
        switch (option) {
            case 1:
                Pares number = new Pares();
                number.verificaPar();
                break;
            case 2:
                Nomes nomes = new Nomes();
                nomes.verificaNomes();
                break;
            case 3:
                Acumulo acumulo = new Acumulo();
                acumulo.acumulador();
                break;
            case 4:
                Fatorial fator = new Fatorial();
                fator.verificaFatorial();
                break;
            case 5:
                Vogais letras = new Vogais();
                letras.acharVogais();
                break;
            case 6:
                Media notas = new Media();
notas.calcularMedia();
        }

    }
}