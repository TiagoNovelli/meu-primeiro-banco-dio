package com.company;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato(){
        System.out.println(" **** EXTRATO POUPANÇA ****");
        super.imprimirInfosComuns();

    }
}
