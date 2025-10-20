import calculadora.pares.VerificadorParidade;
import conta.ContaBanco;
import conta.OperacaoConta;
import buscador.iniciais.BuscadorNomesPorInicial;
import calculadora.acumulos.CalculadoraAcumulos;
import calculadora.fatoriais.CalculadoraFatorial;
import buscador.vogais.BuscadorVogais;
import calculadora.media.CalculadoraMedia;
import calculadora.conversor.ConversorTemperatura;
import pessoa.Pessoa;
import carrinho.produtos.CalculadoraProdutos;

import java.math.BigDecimal;
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
            case 8:
                Pessoa p1 = new Pessoa();
                p1.setNome("Guilherme");
                p1.setIdade(22);
                p1.setCidade("Porto Alegre");
                p1.exibirDados();
                Pessoa p2 = new Pessoa();
                p2.setNome("João");
                p2.setIdade(35);
                p2.setCidade("Curitiba");
                p2.exibirDados();
                break;
            case 9:
                new CalculadoraProdutos().executarOperacao();
                break;
            case 10:
                ContaBanco conta1 = new ContaBanco("Guilherme", new BigDecimal("100.00"));
                ContaBanco conta2 = new ContaBanco("Helen", new BigDecimal("5890.00"));
                OperacaoConta operacao = new OperacaoConta();
                operacao.transferir(conta1, conta2, new BigDecimal("300.0"));
                operacao.exibeSaldo(conta2);
                break;
            default:
                System.out.println("valor inválido digitado.");
        }
        teclado.close();
    }


}