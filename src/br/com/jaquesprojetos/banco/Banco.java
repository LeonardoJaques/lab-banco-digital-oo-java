package br.com.jaquesprojetos.banco;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um banco e suas operações.
 * 
 * @author Leonardo Jaques
 */
public class Banco {
    private String nome;
    private List<Cliente> clientes;

    /**
     * Construtor da classe Banco.
     * 
     * @param nome O nome do banco.
     */
    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    /**
     * Retorna o nome do banco.
     * 
     * @return O nome do banco.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Adiciona um cliente à lista de clientes do banco.
     * 
     * @param cliente O cliente a ser adicionado.
     */
    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    /**
     * Retorna a lista de clientes do banco.
     * 
     * @return A lista de clientes.
     */
    public List<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Busca um cliente na lista de clientes do banco por CPF.
     * 
     * @param cpf O CPF do cliente a ser buscado.
     * @return O cliente encontrado ou null se não encontrar nenhum cliente com o
     *         CPF informado.
     */
    public Cliente encontrarCliente(String cpf) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
}