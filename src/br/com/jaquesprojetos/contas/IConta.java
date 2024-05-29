package br.com.jaquesprojetos.contas;

/**
 * Interface que define os métodos básicos para manipulação de contas bancárias.
 * 
 * @author Leonardo Jaques
 */
public interface IConta {

    /**
     * Realiza um saque na conta.
     * 
     * @param valor O valor a ser sacado.
     * @return true se o saque for realizado com sucesso, false caso contrário.
     */
    boolean sacar(double valor);

    /**
     * Realiza um depósito na conta.
     * 
     * @param valor O valor a ser depositado.
     */
    void depositar(double valor);

    /**
     * Realiza uma transferência entre contas.
     * 
     * @param contaDestino A conta de destino da transferência.
     * @param valor         O valor a ser transferido.
     * @return true se a transferência for realizada com sucesso, false caso
     *         contrário.
     */
    boolean transferir(IConta contaDestino, double valor);

    /**
     * Imprime o extrato da conta.
     */
    void imprimirExtrato();
}