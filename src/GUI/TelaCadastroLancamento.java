/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.PrincipalController;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Saimeen
 */
public class TelaCadastroLancamento extends javax.swing.JPanel {
    
    private PrincipalController principal;
    private ArrayList<String> meses;
    /**
     * Creates new form TelaMovimentacao
     */
    public TelaCadastroLancamento() {
        initComponents();
        startComponentes();        
    }
    Color c;
    
    public void startComponentes(){
        radio_Ganho.setSelected(true);
        c = txtValor.getForeground();   
        chkAvista.setSelected(true);
        pnParcela.setVisible(false);    
        this.principal = new PrincipalController();
        txtValor.setDocument(new TeclasPermitidasDouble());
        txtData.setDocument(new TeclasPermitidasData(10));
    }
  


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_Background = new javax.swing.JPanel();
        pnTitulo = new javax.swing.JPanel();
        lblTituloPage = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblIconPage = new javax.swing.JLabel();
        separatorContent = new javax.swing.JSeparator();
        chkAVista = new javax.swing.JPanel();
        lblValor = new javax.swing.JLabel();
        radio_Ganho = new javax.swing.JRadioButton();
        radio_Gasto = new javax.swing.JRadioButton();
        lblFormaDePagamento = new javax.swing.JLabel();
        cmbFormaDePagamento = new javax.swing.JComboBox();
        lblData = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox();
        lblCategoria = new javax.swing.JLabel();
        chkAvista = new javax.swing.JCheckBox();
        chkParcelado = new javax.swing.JCheckBox();
        lblDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescricao = new javax.swing.JTextArea();
        btnLancar = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        pnParcela = new javax.swing.JPanel();
        lblParcela = new javax.swing.JLabel();
        sdParcela = new javax.swing.JSlider();
        lblMeses = new javax.swing.JLabel();
        lblNumParcela = new javax.swing.JLabel();

        pn_Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnTitulo.setBackground(new java.awt.Color(49, 76, 212));

        lblTituloPage.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblTituloPage.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloPage.setText("Cadastro de Lançamentos");

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 26)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setText("Lançamento");

        lblIconPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imgs/money-icon.png"))); // NOI18N

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubtitulo)
                    .addGroup(pnTituloLayout.createSequentialGroup()
                        .addComponent(lblIconPage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTituloPage)))
                .addContainerGap(394, Short.MAX_VALUE))
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblIconPage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloPage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubtitulo)
                .addContainerGap())
        );

        pn_Background.add(pnTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 100));

        separatorContent.setForeground(new java.awt.Color(207, 207, 207));
        pn_Background.add(separatorContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 670, 10));

        chkAVista.setBackground(new java.awt.Color(255, 255, 255));
        chkAVista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblValor.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblValor.setText("R$");
        chkAVista.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        radio_Ganho.setBackground(new java.awt.Color(255, 255, 255));
        radio_Ganho.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        radio_Ganho.setForeground(new java.awt.Color(0, 153, 0));
        radio_Ganho.setText("Ganho");
        radio_Ganho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_GanhoMouseClicked(evt);
            }
        });
        chkAVista.add(radio_Ganho, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        radio_Gasto.setBackground(new java.awt.Color(255, 255, 255));
        radio_Gasto.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        radio_Gasto.setForeground(new java.awt.Color(255, 0, 0));
        radio_Gasto.setText("Gasto");
        radio_Gasto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_GastoMouseClicked(evt);
            }
        });
        chkAVista.add(radio_Gasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        lblFormaDePagamento.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        lblFormaDePagamento.setText("Forma de pagamento: ");
        chkAVista.add(lblFormaDePagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, 30));

        cmbFormaDePagamento.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cmbFormaDePagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro", "Cartão de Crédito", "Poupança", "Conta Corrente", " " }));
        cmbFormaDePagamento.setToolTipText("");
        cmbFormaDePagamento.setBorder(null);
        cmbFormaDePagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbFormaDePagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFormaDePagamentoActionPerformed(evt);
            }
        });
        chkAVista.add(cmbFormaDePagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 170, 30));

        lblData.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        lblData.setText("Data:");
        chkAVista.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 30));

        cmbCategoria.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Comida", "Lazer", "Roupa", "Saúde", "Veículo", "Esporte", "Familiar" }));
        cmbCategoria.setToolTipText("");
        cmbCategoria.setBorder(null);
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });
        chkAVista.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 140, 30));

        lblCategoria.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        lblCategoria.setText("Categoria: ");
        chkAVista.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        chkAvista.setBackground(new java.awt.Color(255, 255, 255));
        chkAvista.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        chkAvista.setText("À Vista");
        chkAvista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkAvistaMouseClicked(evt);
            }
        });
        chkAvista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAvistaActionPerformed(evt);
            }
        });
        chkAVista.add(chkAvista, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        chkParcelado.setBackground(new java.awt.Color(255, 255, 255));
        chkParcelado.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        chkParcelado.setText("Parcelado");
        chkParcelado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkParceladoMouseClicked(evt);
            }
        });
        chkAVista.add(chkParcelado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        lblDescricao.setBackground(new java.awt.Color(255, 255, 255));
        lblDescricao.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        lblDescricao.setText("Descrição: ");
        chkAVista.add(lblDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txtaDescricao.setColumns(20);
        txtaDescricao.setRows(5);
        jScrollPane1.setViewportView(txtaDescricao);

        chkAVista.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 530, 70));

        btnLancar.setBackground(new java.awt.Color(255, 255, 255));
        btnLancar.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnLancar.setText("Lançar");
        btnLancar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLancarMouseClicked(evt);
            }
        });
        chkAVista.add(btnLancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, -1));

        txtValor.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        txtValor.setForeground(new java.awt.Color(0, 153, 0));
        chkAVista.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 150, 40));

        txtData.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        chkAVista.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 140, 30));

        pnParcela.setBackground(new java.awt.Color(255, 255, 255));

        lblParcela.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        lblParcela.setText("Quantas Parcelas?");

        sdParcela.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        sdParcela.setMaximum(12);
        sdParcela.setMinimum(2);
        sdParcela.setToolTipText("");
        sdParcela.setValue(2);
        sdParcela.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sdParcelaStateChanged(evt);
            }
        });

        lblMeses.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        lblMeses.setText("Parcelas");

        lblNumParcela.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        lblNumParcela.setText("2");

        javax.swing.GroupLayout pnParcelaLayout = new javax.swing.GroupLayout(pnParcela);
        pnParcela.setLayout(pnParcelaLayout);
        pnParcelaLayout.setHorizontalGroup(
            pnParcelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnParcelaLayout.createSequentialGroup()
                .addGroup(pnParcelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnParcelaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sdParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnParcelaLayout.createSequentialGroup()
                        .addGroup(pnParcelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnParcelaLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lblParcela))
                            .addGroup(pnParcelaLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(lblNumParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnParcelaLayout.setVerticalGroup(
            pnParcelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnParcelaLayout.createSequentialGroup()
                .addComponent(lblParcela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sdParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnParcelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumParcela)
                    .addComponent(lblMeses))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chkAVista.add(pnParcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 190, 90));

        pn_Background.add(chkAVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 670, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFormaDePagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFormaDePagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFormaDePagamentoActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void chkAvistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAvistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAvistaActionPerformed

    private void btnLancarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLancarMouseClicked
        String data = txtData.getText();
        String dia = data.substring(0,2); 
        String mes = data.substring(3, 5); 
        String ano = data.substring(6);
        data = dia+"/"+mes+"/"+ano;
                
        double valor = Double.parseDouble(txtValor.getText().replace(',', '.'));  
        int tipoLancamento = -1;
        // GASTO 0, GANHO 1
        if(radio_Ganho.isSelected()){
            radio_Gasto.setSelected(false);
            tipoLancamento = 1;        
        }
        else{
            radio_Gasto.setSelected(true);
            radio_Ganho.setSelected(false);
            tipoLancamento = 0;
        }
        String descricao = txtaDescricao.getText(); 
        int parcela = 1;
        if(chkParcelado.isSelected())
            parcela = sdParcela.getValue();
       
        String categoria = cmbCategoria.getSelectedItem().toString();
        String f_pagamento = cmbFormaDePagamento.getSelectedItem().toString();
           
        if(this.principal.encaminhaMovimentacao(descricao, tipoLancamento, valor, categoria, data, parcela, f_pagamento)) 
            JOptionPane.showMessageDialog(null, "Lancamento cadastrado");
       
    }//GEN-LAST:event_btnLancarMouseClicked

    private void sdParcelaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sdParcelaStateChanged
        lblNumParcela.setText(String.valueOf(sdParcela.getValue()));
    }//GEN-LAST:event_sdParcelaStateChanged

    private void chkParceladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkParceladoMouseClicked
        pnParcela.setVisible(chkParcelado.isSelected());
        chkAvista.setSelected(false);
    }//GEN-LAST:event_chkParceladoMouseClicked

    private void radio_GastoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_GastoMouseClicked
        txtValor.setForeground(Color.red);
        radio_Ganho.setSelected(false);
    }//GEN-LAST:event_radio_GastoMouseClicked

    private void radio_GanhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_GanhoMouseClicked
        txtValor.setForeground(c);
        radio_Gasto.setSelected(false); 
        
    }//GEN-LAST:event_radio_GanhoMouseClicked

    private void chkAvistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAvistaMouseClicked
        chkParcelado.setSelected(false);
        chkParceladoMouseClicked(evt);
        chkAvista.setSelected(true);
    }//GEN-LAST:event_chkAvistaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLancar;
    private javax.swing.JPanel chkAVista;
    private javax.swing.JCheckBox chkAvista;
    private javax.swing.JCheckBox chkParcelado;
    private javax.swing.JComboBox cmbCategoria;
    private javax.swing.JComboBox cmbFormaDePagamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblFormaDePagamento;
    private javax.swing.JLabel lblIconPage;
    private javax.swing.JLabel lblMeses;
    private javax.swing.JLabel lblNumParcela;
    private javax.swing.JLabel lblParcela;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTituloPage;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnParcela;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JPanel pn_Background;
    private javax.swing.JRadioButton radio_Ganho;
    private javax.swing.JRadioButton radio_Gasto;
    private javax.swing.JSlider sdParcela;
    private javax.swing.JSeparator separatorContent;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextArea txtaDescricao;
    // End of variables declaration//GEN-END:variables
}
