package br.com.jaquesprojetos.banco;

import br.com.jaquesprojetos.contas.Conta;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um cliente do banco.
 * 
 * @author Leonardo Jaques
 */
public class Cliente {
    private String nome;
    private String cpf;
    private List<Conta> contas;

    /**
     * Construtor da classe Cliente.
     * 
     * @param nome O nome do cliente.
     * @param cpf  O CPF do cliente.
     */
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }

    /**
     * Retorna o nome do cliente.
     * 
     * @return O nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do cliente.
     * 
     * @param nome O nome do cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o CPF do cliente.
     * 
     * @return O CPF do cliente.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do cliente.
     * 
     * @param cpf O CPF do cliente.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Adiciona uma conta à lista de contas do cliente.
     * 
     * @param conta A conta a ser adicionada.
     */
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    /**
     * Retorna a lista de contas do cliente.
     * 
     * @return A lista de contas.
     */
    public List<Conta> getContas() {
        return contas;
    }

}