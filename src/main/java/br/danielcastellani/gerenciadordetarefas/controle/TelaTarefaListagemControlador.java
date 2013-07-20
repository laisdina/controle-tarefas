/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.controle;

import br.danielcastellani.gerenciadordetarefas.bd.BancoDeDados;
import br.danielcastellani.gerenciadordetarefas.gui.ButtonProjetoEditar;
import br.danielcastellani.gerenciadordetarefas.gui.ButtonProjetoRemover;
import br.danielcastellani.gerenciadordetarefas.gui.ButtonProjetoVer;
import br.danielcastellani.gerenciadordetarefas.gui.ButtonTarefaEditar;
import br.danielcastellani.gerenciadordetarefas.gui.ButtonTarefaRemover;
import br.danielcastellani.gerenciadordetarefas.gui.ButtonTarefaVer;
import br.danielcastellani.gerenciadordetarefas.gui.TelaTarefaListagem;
import br.danielcastellani.gerenciadordetarefas.modelo.Projeto;
import br.danielcastellani.gerenciadordetarefas.modelo.Tarefa;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Alonso Leonardo
 */
public class TelaTarefaListagemControlador {
        private TelaTarefaListagem telaTarefaListagem;
        private String[] cabecalho = {"Nome", "Descrição", "Vencimento", "Criação", "Fechamento", "Situação" ,"Ações"};

        public void listarTarefas() {
        }
        
        void esconde() {
            telaTarefaListagem.setVisible(false);
        }

        void atualizaListagem() {
        }
}