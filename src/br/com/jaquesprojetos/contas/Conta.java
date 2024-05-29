package br.com.jaquesprojetos.contas;

import br.com.jaquesprojetos.banco.Cliente;

/**
 * Classe abstrata que representa uma conta bancária genérica.
 * 
 * @author Leonardo Jaques
 */
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    /**
     * Construtor da classe Conta.
     * 
     * @param cliente O cliente titular da conta.
     */
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    /**
     * Retorna o número da agência da conta.
     * 
     * @return O número da agência.
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * Retorna o número da conta.
     * 
     * @return O número da conta.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Retorna o saldo da conta.
     * 
     * @return O saldo da conta.
     */
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta ===");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("=========================");
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    @Override
    public boolean transferir(IConta contaDestino, double valor) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }

}