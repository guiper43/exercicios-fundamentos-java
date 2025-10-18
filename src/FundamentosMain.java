import exercicio1.VerificadorParidade;
import exercicio2.BuscadorNomesPorInicial;
import exercicio3.CalculadoraAcumulos;
import exercicio4.CalculadoraFatorial;
import exercicio5.BuscadorVogais;
import exercicio6.CalculadoraMedia;
import exercicio7.ConversorTemperatura;

import java.util.Scanner;

public class FundamentosMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite a opção para executar o método correspondente a o exercicio solicitado.");
        int option = teclado.nextInt();
        switch (option) {
            case 1:
                VerificadorParidade numero = new VerificadorParidade();
                numero.verificarNumeros();
                break;
            case 2:
                BuscadorNomesPorInicial nome = new BuscadorNomesPorInicial();
                nome.verificarNomes();
                break;
            case 3:
                CalculadoraAcumulos totalAcumulado = new CalculadoraAcumulos();
                totalAcumulado.calcularAcumulo();
                break;
            case 4:
                CalculadoraFatorial fator = new CalculadoraFatorial();
                fator.verificarFatorial();
                break;
            case 5:
                BuscadorVogais letras = new BuscadorVogais();
                letras.acharVogais();
                break;
            case 6:
                CalculadoraMedia notas = new CalculadoraMedia();
                notas.calcularMedia();
                break;
            case 7:
                ConversorTemperatura temperatura = new ConversorTemperatura();
                temperatura.exibeConvercao();
                break;
        }
        teclado.close();
    }


}