package com.basico.projeto;


import com.basico.bank.Conta;

import java.math.BigDecimal;

public class ContaCorrente {

     private String cliente;

     private BigDecimal saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String sacarSaldo(double valor) {
        BigDecimal v = BigDecimal.valueOf(valor).setScale(2);
        saldo = saldo.subtract(v);
        return saldo.setScale(2).toString().replace(".", ",");

    }

    public String logarSaldoAtual(double valor) {
        BigDecimal v = BigDecimal.valueOf(valor).setScale(2);
        saldo = saldo.add(v);
        return saldo.setScale(2).toString().replace(".", ",");

    }
}

