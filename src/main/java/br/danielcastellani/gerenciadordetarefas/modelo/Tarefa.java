/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.modelo;

import java.util.GregorianCalendar;

/**
 *
 * @author Daniel
 */
public class Tarefa {
    
    private Projeto projeto;
    private String nome;
    private String descricao;
    private GregorianCalendar dataCriacao;
    private GregorianCalendar dataTermino;
    private GregorianCalendar dataVencimento;
    private String situacao;
    
    public Tarefa(Projeto projeto, String nome, String descricao, GregorianCalendar dataVencimento) {
        this.nome = nome;
        this.projeto = projeto;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.dataCriacao = new GregorianCalendar();
        this.situacao = "A Fazer";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public GregorianCalendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(GregorianCalendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public GregorianCalendar getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(GregorianCalendar dataTermino) {
        this.dataTermino = dataTermino;
    }

    public GregorianCalendar getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(GregorianCalendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
