package exercicio9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraProdutos {
    private List<Produto> produtos;

    // Se usar BigDecimal usar padrão americano, se valor recebido for de input externo formatar antes de usar.
    public CalculadoraProdutos() {
        produtos = new ArrayList<>();
        produtos.add(new Produto("Teclado Gamer", new BigDecimal("289.90")));
        produtos.add(new Produto("Iphone 17", new BigDecimal("7589.90")));
        produtos.add(new Produto("Fone de ouvido", new BigDecimal("300.00")));
    }

    public void exibirProdutos() {
        System.out.println("Produtos:");
        for (Produto p : produtos) {
            System.out.println("- " + p.getNomeProduto() + ": R$ " + p.getPrecoProduto());
        }
    }

    public BigDecimal calcularTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (Produto p : produtos) {
            total = total.add(p.getPrecoProduto());
        }
        return total;
    }

    public void executarOperacao() {
        exibirProdutos();
        System.out.println("| O total dos preços é R$:" + calcularTotal());
    }

}
