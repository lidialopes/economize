/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.LoginController;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Segismar Junior
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public TelaLogin() {
        initComponents();
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
        lblLogin = new javax.swing.JLabel();
        pn_login = new javax.swing.JPanel();
        lbl_usuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btn_Entrar = new javax.swing.JButton();
        lblMensagem_Cadastro = new javax.swing.JLabel();
        lbl_Cadastrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_Background.setBackground(new java.awt.Color(12, 33, 150));
        pn_Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setFont(new java.awt.Font("Segoe UI Light", 1, 26)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Login");
        pn_Background.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        pn_login.setBackground(new java.awt.Color(12, 33, 150));

        lbl_usuario.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setText("Usuário:");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Senha:");

        txtSenha.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtSenha.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtUsuario.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N

        javax.swing.GroupLayout pn_loginLayout = new javax.swing.GroupLayout(pn_login);
        pn_login.setLayout(pn_loginLayout);
        pn_loginLayout.setHorizontalGroup(
            pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_loginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_usuario)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSenha)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pn_loginLayout.setVerticalGroup(
            pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pn_Background.add(pn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 320, 90));

        btn_Entrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Entrar.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        btn_Entrar.setText("Entrar");
        btn_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntrarActionPerformed(evt);
            }
        });
        pn_Background.add(btn_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 70, 30));

        lblMensagem_Cadastro.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lblMensagem_Cadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblMensagem_Cadastro.setText("Não tem cadastro?");
        pn_Background.add(lblMensagem_Cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        lbl_Cadastrar.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        lbl_Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Cadastrar.setText("Crie uma conta ");
        lbl_Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CadastrarMouseClicked(evt);
            }
        });
        pn_Background.add(lbl_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pn_Background, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntrarActionPerformed
       
        String login = txtUsuario.getText();
        String senha = String.valueOf(txtSenha.getPassword());
        if(LoginController.autenticaCliente(login, senha)) {
            JOptionPane.showMessageDialog(null, "Bem-Vindo, " + LoginController.getCliente().getNome() + "!");
            abreTela(new Principal());
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta");
        }
    }//GEN-LAST:event_btn_EntrarActionPerformed

    private void lbl_CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CadastrarMouseClicked
        abreTela(new TelaCadastroUsuario());
    }//GEN-LAST:event_lbl_CadastrarMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMensagem_Cadastro;
    private javax.swing.JLabel lbl_Cadastrar;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel pn_Background;
    private javax.swing.JPanel pn_login;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
