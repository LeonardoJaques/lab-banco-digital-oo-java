package br.com.jaquesprojetos.contas;

import br.com.jaquesprojetos.banco.Cliente;

/**
 * Classe que representa uma conta poupança.
 * 
 * @author Leonardo Jaques
 */
public class ContaPoupanca extends Conta {

    /**
     * Construtor da classe ContaPoupanca.
     * 
     * @param cliente O cliente titular da conta.
     */
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

}