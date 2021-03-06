/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.gui;

import br.danielcastellani.gerenciadordetarefas.contexto.Contexto;
import br.danielcastellani.gerenciadordetarefas.controle.TelaTarefaListagemControlador;
import br.danielcastellani.gerenciadordetarefas.modelo.Projeto;

/**
 *
 * @author Daniel
 */
public class TelaTarefaListagem extends javax.swing.JInternalFrame {

    private TelaTarefaListagemControlador controlador;
    private Projeto projeto;

    /**
     * Creates new form TelaProjetoListagem
     */
    public TelaTarefaListagem(Projeto projeto) {
        this.projeto = projeto;
        initComponents();
        this.setTitle("Ver Projeto: " + projeto.getNome());
        controlador = new TelaTarefaListagemControlador(this);
        Contexto.getInstance().put(controlador.getClass().getCanonicalName(), controlador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        panelListagem = new javax.swing.JPanel();
        panelTituloProjeto = new java.awt.Panel();
        TextoTituloProjeto = new javax.swing.JLabel();
        panelDescricaoProjeto = new java.awt.Panel();
        TextoDescricaoProjeto = new javax.swing.JLabel();
        panelBotaoCriarTarefa = new java.awt.Panel();
        BotaoCriarTarefa = new javax.swing.JButton();
        ComboBoxFiltro = new javax.swing.JComboBox();

        setClosable(true);
        setTitle(projeto.getNome());

        panelListagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelListagem.setAutoscrolls(true);
        panelListagem.setMinimumSize(new java.awt.Dimension(200, 0));

        javax.swing.GroupLayout panelListagemLayout = new javax.swing.GroupLayout(panelListagem);
        panelListagem.setLayout(panelListagemLayout);
        panelListagemLayout.setHorizontalGroup(
            panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelListagemLayout.setVerticalGroup(
            panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );

        TextoTituloProjeto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TextoTituloProjeto.setText(projeto.getNome());

        javax.swing.GroupLayout panelTituloProjetoLayout = new javax.swing.GroupLayout(panelTituloProjeto);
        panelTituloProjeto.setLayout(panelTituloProjetoLayout);
        panelTituloProjetoLayout.setHorizontalGroup(
            panelTituloProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloProjetoLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(TextoTituloProjeto)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        panelTituloProjetoLayout.setVerticalGroup(
            panelTituloProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextoTituloProjeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        TextoDescricaoProjeto.setText(projeto.getDescricao());

        javax.swing.GroupLayout panelDescricaoProjetoLayout = new javax.swing.GroupLayout(panelDescricaoProjeto);
        panelDescricaoProjeto.setLayout(panelDescricaoProjetoLayout);
        panelDescricaoProjetoLayout.setHorizontalGroup(
            panelDescricaoProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescricaoProjetoLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(TextoDescricaoProjeto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDescricaoProjetoLayout.setVerticalGroup(
            panelDescricaoProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDescricaoProjetoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextoDescricaoProjeto)
                .addGap(32, 32, 32))
        );

        BotaoCriarTarefa.setText("Criar Tarefa");

        javax.swing.GroupLayout panelBotaoCriarTarefaLayout = new javax.swing.GroupLayout(panelBotaoCriarTarefa);
        panelBotaoCriarTarefa.setLayout(panelBotaoCriarTarefaLayout);
        panelBotaoCriarTarefaLayout.setHorizontalGroup(
            panelBotaoCriarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotaoCriarTarefaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoCriarTarefa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotaoCriarTarefaLayout.setVerticalGroup(
            panelBotaoCriarTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotaoCriarTarefaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoCriarTarefa))
        );

        ComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todas", "A Fazer", "Fazendo", "Pronto" }));
        ComboBoxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelDescricaoProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTituloProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelListagem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(panelBotaoCriarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(ComboBoxFiltro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTituloProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDescricaoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBotaoCriarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFiltroActionPerformed
              
    }//GEN-LAST:event_ComboBoxFiltroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCriarTarefa;
    private javax.swing.JComboBox ComboBoxFiltro;
    private javax.swing.JLabel TextoDescricaoProjeto;
    private javax.swing.JLabel TextoTituloProjeto;
    private java.awt.Panel panelBotaoCriarTarefa;
    private java.awt.Panel panelDescricaoProjeto;
    private javax.swing.JPanel panelListagem;
    private java.awt.Panel panelTituloProjeto;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the panelListagem
     */
    public javax.swing.JPanel getPanelListagem() {
        return panelListagem;
    }

    /**
     * @param panelListagem the panelListagem to set
     */
    public void setPanelListagem(javax.swing.JPanel panelListagem) {
        this.panelListagem = panelListagem;
    }
    
    /**
     * @return the txtDescricao
     */
    public javax.swing.JLabel getTxtDescricao() {
        return TextoDescricaoProjeto;
    }

    /**
     * @return the txtNome
     */
    public javax.swing.JLabel getTxtNome() {
        return TextoTituloProjeto;
    }
    
    void atualizaTelaVer(TelaTarefaListagem telaProjeto, Projeto projetoParaVer) {
        controlador.atualizaTelaVer(projetoParaVer);
    }
    
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    
}
