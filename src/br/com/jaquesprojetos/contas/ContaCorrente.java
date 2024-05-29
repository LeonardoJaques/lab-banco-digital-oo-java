package br.com.jaquesprojetos.contas;

import br.com.jaquesprojetos.banco.Cliente;

/**
 * Classe que representa uma conta corrente.
 * 
 * @author Leonardo Jaques
 */
public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    /**
     * Construtor da classe ContaCorrente.
     * 
     * @param cliente O cliente titular da conta.
     */
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.limiteChequeEspecial = 1000.0; // Define um limite padrão para o cheque especial
    }

    /**
     * Retorna o limite do cheque especial da conta.
     * 
     * @return O limite do cheque especial.
     */
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    /**
     * Define um novo limite para o cheque especial da conta.
     * 
     * @param novoLimite O novo limite a ser definido.
     */
    public void setLimiteChequeEspecial(double novoLimite) {
        this.limiteChequeEspecial = novoLimite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0) {
            // Verifica se há saldo suficiente na conta ou no cheque especial
            if (this.saldo + this.limiteChequeEspecial >= valor) {
                this.saldo -= valor;
                return true;
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Valor de saque inválido.");
        }
        return false;
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirExtrato();
        System.out.println(String.format("Limite Cheque Especial: %.2f", this.limiteChequeEspecial));
        System.out.println("=========================");
    }
}