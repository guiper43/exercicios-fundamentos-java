package exercicio10;

import java.math.BigDecimal;

public class ContaBanco {
    private String titular;
    private BigDecimal saldo;

    public String getTitular() {
        return titular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public ContaBanco(String titular, BigDecimal saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

}
