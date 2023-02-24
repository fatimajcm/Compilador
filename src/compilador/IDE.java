/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package compilador;

/**
 *
 * @author Fatima Caldera
 */
public class IDE extends javax.swing.JFrame {

    /**
     * Creates new form IDE
     */
    public IDE() {
        initComponents();
        inicializar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRun = new javax.swing.JButton();
        btnDebug = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCode = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        btnLexicon = new javax.swing.JButton();
        btnSyntactic = new javax.swing.JButton();
        btnSemantic = new javax.swing.JButton();
        btnIntermediate = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCompile = new javax.swing.JTextPane();
        btnError = new javax.swing.JButton();
        btnResult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/Icon/icons8_save_48px.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setToolTipText("Save document");
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/pressed/icons8_save_48px_p.png"))); // NOI18N
        btnSave.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/On Layer/icons8_save_48px_on.png"))); // NOI18N
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 60, 70));

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/Icon/icons8_code_file_48px.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/pressed/icons8_code_file_48px_p.png"))); // NOI18N
        btnNew.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/On Layer/icons8_code_file_48px_on.png"))); // NOI18N
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 70));

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/Icon/icons8_opened_folder_48px.png"))); // NOI18N
        btnOpen.setText("Open");
        btnOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpen.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/pressed/icons8_opened_folder_48px_P.png"))); // NOI18N
        btnOpen.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/On Layer/icons8_opened_folder_48px_ON.png"))); // NOI18N
        btnOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 60, 70));

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/Icon/icons8_question_mark_48px_1.png"))); // NOI18N
        btnHelp.setText("Help");
        btnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHelp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/pressed/icons8_question_mark_48px_p.png"))); // NOI18N
        btnHelp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/On Layer/icons8_question_mark_48px_on.png"))); // NOI18N
        btnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 60, 70));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/Icon/icons8-text-color-48.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/pressed/icons8-text-color-48.png"))); // NOI18N
        btnEdit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/On Layer/icons8-text-color-48.png"))); // NOI18N
        btnEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 60, 70));

        btnRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/Icon/icons8_code_48px.png"))); // NOI18N
        btnRun.setText("Run");
        btnRun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/pressed/icons8_code_48px_p.png"))); // NOI18N
        btnRun.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/On Layer/icons8_code_48px_on.png"))); // NOI18N
        btnRun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 70, 70));

        btnDebug.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/Icon/icons8_wrench_48px.png"))); // NOI18N
        btnDebug.setText("Debug");
        btnDebug.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDebug.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/pressed/icons8_wrench_48px_p.png"))); // NOI18N
        btnDebug.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/On Layer/icons8_wrench_48px_on.png"))); // NOI18N
        btnDebug.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnDebug, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 70, 70));

        jScrollPane1.setViewportView(txtCode);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 610, 320));

        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 330, 320));

        btnLexicon.setBackground(new java.awt.Color(153, 153, 255));
        btnLexicon.setText("Lexicon");
        getContentPane().add(btnLexicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        btnSyntactic.setBackground(new java.awt.Color(153, 153, 255));
        btnSyntactic.setText("Syntactic");
        getContentPane().add(btnSyntactic, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, -1, -1));

        btnSemantic.setBackground(new java.awt.Color(153, 153, 255));
        btnSemantic.setText("Semantic");
        getContentPane().add(btnSemantic, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, -1, -1));

        btnIntermediate.setBackground(new java.awt.Color(153, 153, 255));
        btnIntermediate.setText("Intermediate code");
        btnIntermediate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntermediateActionPerformed(evt);
            }
        });
        getContentPane().add(btnIntermediate, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 60, 70, -1));

        jScrollPane3.setViewportView(txtCompile);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 1010, 110));

        btnError.setText("Errors");
        getContentPane().add(btnError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        btnResult.setText("Results");
        getContentPane().add(btnResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicializar(){
        setTitle("Empty Stack!");
        String [] options = new String[]{"Guardar y continuar", "Descargar"};
        
    }
    private void btnIntermediateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntermediateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIntermediateActionPerformed

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
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDebug;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnError;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnIntermediate;
    private javax.swing.JButton btnLexicon;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSemantic;
    private javax.swing.JButton btnSyntactic;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane txtCode;
    private javax.swing.JTextPane txtCompile;
    // End of variables declaration//GEN-END:variables
}
