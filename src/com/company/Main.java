package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente tiago = new Cliente();
        tiago.setNome("Tiago Novelli");

        Conta cc = new ContaCorrente(tiago);
        Conta pp = new ContaPoupanca(tiago);

        cc.depositar(200.00);

        cc.imprimirExtrato();
        pp.imprimirExtrato();

        cc.transferir(50,pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();

    }
}
