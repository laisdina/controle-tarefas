/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.controle;

import br.danielcastellani.gerenciadordetarefas.bd.BancoDeDados;
import br.danielcastellani.gerenciadordetarefas.gui.TelaProjeto;
import br.danielcastellani.gerenciadordetarefas.modelo.Projeto;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class TelaTarefaControlador {

    TelaProjeto telaProjeto;

    public TelaTarefaControlador(TelaProjeto telaProjeto) {
        this.telaProjeto = telaProjeto;
    }

    public void salvar(Projeto projeto) {

    }

    public void fechar() {
        limparCampos();
        telaProjeto.setVisible(false);
    }

    private void limparCampos() {
        telaProjeto.getTxtNome().setText("");
        telaProjeto.getTxtDescricao().setText("");
    }
    
    public  void atualizaTelaEditar(Projeto projetoParaEditar) {
        telaProjeto.setProjeto(projetoParaEditar);
        telaProjeto.getTxtNome().setText(projetoParaEditar.getNome());
        telaProjeto.getTxtDescricao().setText(projetoParaEditar.getDescricao());
    }

}
