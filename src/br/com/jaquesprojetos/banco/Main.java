package br.com.jaquesprojetos.banco;

import br.com.jaquesprojetos.contas.Conta;
import br.com.jaquesprojetos.contas.ContaCorrente;
import br.com.jaquesprojetos.contas.ContaPoupanca;

/**
 * Classe principal que demonstra o funcionamento do sistema bancário.
 * 
 * @author Leonardo Jaques
 */
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Central");

        Cliente cliente1 = new Cliente("João da Silva", "123.456.789-01");
        banco.adicionarCliente(cliente1);

        Conta contaCorrente1 = new ContaCorrente(cliente1);
        cliente1.adicionarConta(contaCorrente1);
        contaCorrente1.depositar(500);

        Cliente cliente2 = new Cliente("Maria da Silva", "987.654.321-09");
        banco.adicionarCliente(cliente2);

        Conta contaPoupanca1 = new ContaPoupanca(cliente2);
        cliente2.adicionarConta(contaPoupanca1);
        contaPoupanca1.depositar(1000);

        System.out.println("=== Clientes do " + banco.getNome() + " ===");
        for (Cliente cliente : banco.getClientes()) {
            System.out.println("Nome: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
            System.out.println("Contas:");
            for (Conta conta : cliente.getContas()) {
                conta.imprimirExtrato();
            }
            System.out.println();
        }

        System.out.println("=== Realizando operações ===");
        contaCorrente1.sacar(100);
        contaCorrente1.transferir(contaPoupanca1, 200);

        System.out.println("\n=== Saldos atualizados ===");
        for (Cliente cliente : banco.getClientes()) {
            System.out.println("Nome: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
            System.out.println("Contas:");
            for (Conta conta : cliente.getContas()) {
                conta.imprimirExtrato();
            }
            System.out.println();
        }
    }
}