/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GraphicsConfiguration;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Claudio
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    private boolean estadoBtnHome = true;
    private boolean estadoBtnFC;
    private boolean estadoBtnMeta;
    private boolean estadoBtnRelatorio;
    private boolean estadoBtnUsuario;

    public Principal(GraphicsConfiguration gc) {
        super(gc);
    }
    
    public Principal() {
        initComponents();
        alteraEstadoTela(new TelaHome());
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
        pn_lateral = new javax.swing.JPanel();
        btnHome = new javax.swing.JPanel();
        lblImgHome = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        btnFluxoCaixa = new javax.swing.JPanel();
        lblImgFCaixa = new javax.swing.JLabel();
        lblFCaica = new javax.swing.JLabel();
        btnMeta = new javax.swing.JPanel();
        lblImgMeta = new javax.swing.JLabel();
        lblMeta = new javax.swing.JLabel();
        btnRelatorios = new javax.swing.JPanel();
        lblImgRelatorios = new javax.swing.JLabel();
        lblRelatorios = new javax.swing.JLabel();
        btnAjuda = new javax.swing.JPanel();
        lblImgUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblLogoEconomize = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        lblTituloEconomize = new javax.swing.JLabel();
        pnContainerTela = new javax.swing.JPanel();
        btnFechar = new javax.swing.JLabel();
        pnTelaOpen = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        pn_Background.setBackground(new java.awt.Color(255, 255, 255));
        pn_Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_lateral.setBackground(new java.awt.Color(12, 33, 150));
        pn_lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setBackground(new java.awt.Color(11, 30, 125));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHomeMousePressed(evt);
            }
        });

        lblImgHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imgs/home-icon.png"))); // NOI18N

        lblHome.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setText("Home");

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgHome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHome)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblHome)
                    .addComponent(lblImgHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pn_lateral.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 230, 40));

        btnFluxoCaixa.setBackground(new java.awt.Color(16, 44, 181));
        btnFluxoCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFluxoCaixaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFluxoCaixaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFluxoCaixaMousePressed(evt);
            }
        });

        lblImgFCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgFCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imgs/money-icon.png"))); // NOI18N

        lblFCaica.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblFCaica.setForeground(new java.awt.Color(255, 255, 255));
        lblFCaica.setText("Lancamentos");

        javax.swing.GroupLayout btnFluxoCaixaLayout = new javax.swing.GroupLayout(btnFluxoCaixa);
        btnFluxoCaixa.setLayout(btnFluxoCaixaLayout);
        btnFluxoCaixaLayout.setHorizontalGroup(
            btnFluxoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFluxoCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgFCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFCaica)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        btnFluxoCaixaLayout.setVerticalGroup(
            btnFluxoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFluxoCaixaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnFluxoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblFCaica)
                    .addComponent(lblImgFCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pn_lateral.add(btnFluxoCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 230, 40));

        btnMeta.setBackground(new java.awt.Color(16, 44, 181));
        btnMeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMetaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMetaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMetaMousePressed(evt);
            }
        });

        lblImgMeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgMeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imgs/meta-icon.png"))); // NOI18N

        lblMeta.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblMeta.setForeground(new java.awt.Color(255, 255, 255));
        lblMeta.setText("Metas");

        javax.swing.GroupLayout btnMetaLayout = new javax.swing.GroupLayout(btnMeta);
        btnMeta.setLayout(btnMetaLayout);
        btnMetaLayout.setHorizontalGroup(
            btnMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMeta)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        btnMetaLayout.setVerticalGroup(
            btnMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMetaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblMeta)
                    .addComponent(lblImgMeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pn_lateral.add(btnMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 230, 40));

        btnRelatorios.setBackground(new java.awt.Color(16, 44, 181));
        btnRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRelatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRelatoriosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRelatoriosMousePressed(evt);
            }
        });

        lblImgRelatorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imgs/relatorio-icon.png"))); // NOI18N

        lblRelatorios.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        lblRelatorios.setText("Relatórios");

        javax.swing.GroupLayout btnRelatoriosLayout = new javax.swing.GroupLayout(btnRelatorios);
        btnRelatorios.setLayout(btnRelatoriosLayout);
        btnRelatoriosLayout.setHorizontalGroup(
            btnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRelatorios)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        btnRelatoriosLayout.setVerticalGroup(
            btnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRelatoriosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblRelatorios)
                    .addComponent(lblImgRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pn_lateral.add(btnRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, 40));

        btnAjuda.setBackground(new java.awt.Color(16, 44, 181));
        btnAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAjudaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAjudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAjudaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAjudaMousePressed(evt);
            }
        });

        lblImgUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imgs/user-icon.png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Ajuda");

        javax.swing.GroupLayout btnAjudaLayout = new javax.swing.GroupLayout(btnAjuda);
        btnAjuda.setLayout(btnAjudaLayout);
        btnAjudaLayout.setHorizontalGroup(
            btnAjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAjudaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUsuario)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        btnAjudaLayout.setVerticalGroup(
            btnAjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAjudaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnAjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblUsuario)
                    .addComponent(lblImgUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pn_lateral.add(btnAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 40));

        lblLogoEconomize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoEconomize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imgs/economize-icon.png"))); // NOI18N
        pn_lateral.add(lblLogoEconomize, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 50, 40));

        separator.setPreferredSize(new java.awt.Dimension(50, 5));
        pn_lateral.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 210, 20));

        lblTituloEconomize.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblTituloEconomize.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloEconomize.setText("Economize!");
        pn_lateral.add(lblTituloEconomize, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        pn_Background.add(pn_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 480));

        pnContainerTela.setBackground(new java.awt.Color(255, 255, 255));
        pnContainerTela.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFechar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFechar.setText("X");
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFecharMousePressed(evt);
            }
        });
        pnContainerTela.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 30, 30));

        pnTelaOpen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnTelaOpenLayout = new javax.swing.GroupLayout(pnTelaOpen);
        pnTelaOpen.setLayout(pnTelaOpenLayout);
        pnTelaOpenLayout.setHorizontalGroup(
            pnTelaOpenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        pnTelaOpenLayout.setVerticalGroup(
            pnTelaOpenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        pnContainerTela.add(pnTelaOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 670, 450));

        pn_Background.add(pnContainerTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 670, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_Background, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnFecharMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnFecharMousePressed

    private void btnHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMousePressed
        // TODO add your handling code here:
        alteraEstadoTela(new TelaHome());
        
        estadoBtnHome = true;
        estadoBtnFC = false;
        estadoBtnMeta = false;
        estadoBtnRelatorio = false;
        estadoBtnUsuario = false;
        
        setColor(btnHome);
        resetColor(btnFluxoCaixa);
        resetColor(btnMeta);
        resetColor(btnRelatorios);
        resetColor(btnAjuda);
    }//GEN-LAST:event_btnHomeMousePressed

    private void btnFluxoCaixaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFluxoCaixaMousePressed
        // TODO add your handling code here:
        //alteraEstadoTela(telaFluxoCaixa);
        alteraEstadoTela(new TelaCadastroLancamento());
        estadoBtnFC = true;
        estadoBtnHome = false;
        estadoBtnMeta = false;
        estadoBtnRelatorio = false;
        estadoBtnUsuario = false;
        
        setColor(btnFluxoCaixa);
        resetColor(btnHome);
        resetColor(btnMeta);
        resetColor(btnRelatorios);
        resetColor(btnAjuda);
    }//GEN-LAST:event_btnFluxoCaixaMousePressed

    private void btnMetaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMetaMousePressed
        
        alteraEstadoTela(new TelaCadastroMetas());
        // TODO add your handling code here:
        estadoBtnMeta = true;
        estadoBtnHome = false;
        estadoBtnFC = false;
        estadoBtnRelatorio = false;
        estadoBtnUsuario = false;
        
        setColor(btnMeta);
        resetColor(btnHome);
        resetColor(btnFluxoCaixa);
        resetColor(btnRelatorios);
        resetColor(btnAjuda);
    }//GEN-LAST:event_btnMetaMousePressed

    private void btnRelatoriosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatoriosMousePressed
        // TODO add your handling code here:
        alteraEstadoTela(new TelaRelatorio());
        estadoBtnRelatorio = true;
        estadoBtnHome = false;
        estadoBtnFC = false;
        estadoBtnMeta = false;
        estadoBtnUsuario = false;
        
        setColor(btnRelatorios);
        resetColor(btnHome);
        resetColor(btnFluxoCaixa);
        resetColor(btnMeta);
        resetColor(btnAjuda);
    }//GEN-LAST:event_btnRelatoriosMousePressed

    private void btnAjudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjudaMousePressed
        // TODO add your handling code here:
        estadoBtnUsuario = true;
        estadoBtnHome = false;
        estadoBtnFC = false;
        estadoBtnMeta = false;
        estadoBtnRelatorio = false;
        
        setColor(btnAjuda);
        resetColor(btnHome);
        resetColor(btnFluxoCaixa);
        resetColor(btnMeta);
        resetColor(btnRelatorios);
    }//GEN-LAST:event_btnAjudaMousePressed

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        // TODO add your handling code here:
        if(!estadoBtnHome) setColorHover(btnHome);
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        // TODO add your handling code here:
        if(!estadoBtnHome) resetColor(btnHome);
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnFluxoCaixaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFluxoCaixaMouseEntered
        // TODO add your handling code here:
        if(!estadoBtnFC) setColorHover(btnFluxoCaixa);
    }//GEN-LAST:event_btnFluxoCaixaMouseEntered

    private void btnFluxoCaixaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFluxoCaixaMouseExited
        // TODO add your handling code here:
        if(!estadoBtnFC) resetColor(btnFluxoCaixa);
    }//GEN-LAST:event_btnFluxoCaixaMouseExited

    private void btnMetaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMetaMouseEntered
        // TODO add your handling code here:
        if(!estadoBtnMeta) setColorHover(btnMeta);
    }//GEN-LAST:event_btnMetaMouseEntered

    private void btnMetaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMetaMouseExited
        // TODO add your handling code here:
        if(!estadoBtnMeta) resetColor(btnMeta);
    }//GEN-LAST:event_btnMetaMouseExited

    private void btnRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatoriosMouseEntered
        // TODO add your handling code here:
        if(!estadoBtnRelatorio) setColorHover(btnRelatorios);
    }//GEN-LAST:event_btnRelatoriosMouseEntered

    private void btnRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatoriosMouseExited
        // TODO add your handling code here:
        if(!estadoBtnRelatorio) resetColor(btnRelatorios);
    }//GEN-LAST:event_btnRelatoriosMouseExited

    private void btnAjudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjudaMouseEntered
        // TODO add your handling code here:
        if(!estadoBtnUsuario) setColorHover(btnAjuda);
    }//GEN-LAST:event_btnAjudaMouseEntered

    private void btnAjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjudaMouseExited
        // TODO add your handling code here:
        if(!estadoBtnUsuario) resetColor(btnAjuda);
    }//GEN-LAST:event_btnAjudaMouseExited

    private void btnAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjudaMouseClicked
        alteraEstadoTela(new TelaAjuda());
    }//GEN-LAST:event_btnAjudaMouseClicked

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(11,30,125));
    }
    
    private void resetColor(JPanel panel) {
        panel.setBackground(new Color(16,44,181));
    }
    
    private void setColorHover(JPanel panel) {
        panel.setBackground(new Color(27,57,207));
    }
    
    private void alteraEstadoTela(JPanel telaClicada){
        pnTelaOpen.setLayout(new BorderLayout());    
        pnTelaOpen.removeAll();
        pnTelaOpen.add(telaClicada, BorderLayout.CENTER);
        pnTelaOpen.validate();
    }
    private void abreTela(Object o){
        JFrame tela = (JFrame) o;
        tela.setVisible(true);
        dispose();
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAjuda;
    private javax.swing.JLabel btnFechar;
    private javax.swing.JPanel btnFluxoCaixa;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnMeta;
    private javax.swing.JPanel btnRelatorios;
    private javax.swing.JLabel lblFCaica;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblImgFCaixa;
    private javax.swing.JLabel lblImgHome;
    private javax.swing.JLabel lblImgMeta;
    private javax.swing.JLabel lblImgRelatorios;
    private javax.swing.JLabel lblImgUsuario;
    private javax.swing.JLabel lblLogoEconomize;
    private javax.swing.JLabel lblMeta;
    private javax.swing.JLabel lblRelatorios;
    private javax.swing.JLabel lblTituloEconomize;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnContainerTela;
    private javax.swing.JPanel pnTelaOpen;
    private javax.swing.JPanel pn_Background;
    private javax.swing.JPanel pn_lateral;
    private javax.swing.JSeparator separator;
    // End of variables declaration//GEN-END:variables
}
