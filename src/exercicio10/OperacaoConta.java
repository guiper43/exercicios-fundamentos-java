package exercicio10;

import java.math.BigDecimal;

public class OperacaoConta {

    public boolean depositar(ContaBanco conta, BigDecimal valor) {
        conta.setSaldo(conta.getSaldo().add(valor));
        System.out.println("seu depósito foi realizado com sucesso.  você depositou R$: " + valor + "seu novo saldo é: R$ " + conta.getSaldo());
        return true;
    }

    public boolean sacar(ContaBanco conta, BigDecimal valor) {
        if (conta.getSaldo().compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("O seu saldo está negativo, você não pode realizar saques.");
            return false;
        } else if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Você digitou um valor não permitido, negativo ou igual a 0.");
            return false;
        } else if (valor.compareTo(conta.getSaldo()) > 0) {
            System.out.println("Não foi possível realizar o saque, o valor é maior do que o saldo disponível.");
            return false;
        } else {
            conta.setSaldo(conta.getSaldo().subtract(valor));
            System.out.println("Seu saque foi realizado com sucesso, você sacou: R$ " + valor);
            return true;
        }
    }

    public void exibeSaldo(ContaBanco contaBanco) {
        System.out.println("olá,  " + contaBanco.getTitular() + " seu saldo é: R$ " + contaBanco.getSaldo());
    }

    public boolean transferir(ContaBanco origem, ContaBanco destino, BigDecimal valor) {
        if (!sacar(origem, valor)) {
            System.out.println("Transferência não efetuada, ouve uma falha na hora de debitar o valor.");
            return false;
        } else {
            sacar(origem, valor);
            depositar(destino, valor);
            return true;
        }

    }
}
