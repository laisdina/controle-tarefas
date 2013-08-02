/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.controle;

import br.danielcastellani.gerenciadordetarefas.bd.BancoDeDados;
import br.danielcastellani.gerenciadordetarefas.contexto.Contexto;
import br.danielcastellani.gerenciadordetarefas.gui.ButtonProjetoEditar;
import br.danielcastellani.gerenciadordetarefas.gui.ButtonProjetoRemover;
import br.danielcastellani.gerenciadordetarefas.gui.ButtonProjetoVer;
import br.danielcastellani.gerenciadordetarefas.gui.ButtonTarefaEditar;
import br.danielcastellani.gerenciadordetarefas.gui.ButtonTarefaRemover;
import br.danielcastellani.gerenciadordetarefas.gui.TelaProjeto;
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

        public TelaTarefaListagemControlador() {     
        }
        
        public TelaTarefaListagemControlador(TelaTarefaListagem telaTarefaListagem) {
            this.telaTarefaListagem = telaTarefaListagem;
        }
        
        public void listarTarefas(Projeto projeto) {
            if (telaTarefaListagem == null) {
                telaTarefaListagem = new TelaTarefaListagem(projeto);
                TelaPrincipalControlador controlador = (TelaPrincipalControlador) Contexto.getInstance().get(TelaPrincipalControlador.class.getCanonicalName());
                controlador.adicionarComponente(telaTarefaListagem);
            }
            atualizaListagem(projeto);
        }
        
        void esconde() {
            telaTarefaListagem.setVisible(false);
        }

        void atualizaListagem(Projeto projeto) {
            //List<Tarefa> tarefas = BancoDeDados.getBancoDeDados().getListaTarefas(projeto);
            JPanel listagem = telaTarefaListagem.getPanelListagem();
            listagem.setLayout(new GridLayout());

            telaTarefaListagem.setProjeto(projeto);
            telaTarefaListagem.getTxtNome().setText(projeto.getNome());
            telaTarefaListagem.getTxtDescricao().setText(projeto.getDescricao());
            //listagem.removeAll();
            //System.gc();

            //if (tarefas.isEmpty()) {
            //    listagem.add(new JLabel("Não existem tarefas."));
            //}
            telaTarefaListagem.pack();
            telaTarefaListagem.setVisible(true);
            telaTarefaListagem.repaint();
        
        }
        public void atualizaTelaVer(Projeto projeto) {
                    telaTarefaListagem.setProjeto(projeto);
                    telaTarefaListagem.getTxtNome().setText(projeto.getNome());
                    telaTarefaListagem.getTxtDescricao().setText(projeto.getDescricao());
        }
}