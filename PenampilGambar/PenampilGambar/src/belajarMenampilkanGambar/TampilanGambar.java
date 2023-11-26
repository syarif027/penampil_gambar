/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package belajarMenampilkanGambar;

import java.awt.CardLayout;
import javax.swing.JComboBox;
/**
 *
 * @author asus
 */
public class TampilanGambar extends javax.swing.JFrame {

    /**
     * Creates new form TampilanGambar
     */
    public TampilanGambar() {
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

        buttonPanel = new javax.swing.JPanel();
        bsyarif = new javax.swing.JButton();
        bkiki = new javax.swing.JButton();
        boji = new javax.swing.JButton();
        bdimas = new javax.swing.JButton();
        bKeluar = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        syarif = new javax.swing.JLabel();
        kiki = new javax.swing.JLabel();
        oji = new javax.swing.JLabel();
        dimas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonPanel.setBackground(new java.awt.Color(102, 102, 102));
        buttonPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Aplikasi Penampil Gambar atau GIF"));

        bsyarif.setText("Syarif");
        bsyarif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsyarifActionPerformed(evt);
            }
        });
        buttonPanel.add(bsyarif);

        bkiki.setText("kiki");
        bkiki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkikiActionPerformed(evt);
            }
        });
        buttonPanel.add(bkiki);

        boji.setText("oji");
        boji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bojiActionPerformed(evt);
            }
        });
        buttonPanel.add(boji);

        bdimas.setText("dimas");
        bdimas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdimasActionPerformed(evt);
            }
        });
        buttonPanel.add(bdimas);

        bKeluar.setText("Keluar");
        bKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKeluarActionPerformed(evt);
            }
        });
        buttonPanel.add(bKeluar);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setMaximumSize(new java.awt.Dimension(4180, 3140));
        imagePanel.setLayout(new java.awt.CardLayout(10, 10));

        syarif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        syarif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/belajarMenampilkanGambar/images (7).jpeg"))); // NOI18N
        syarif.setLabelFor(syarif);
        syarif.setMaximumSize(new java.awt.Dimension(248, 288));
        syarif.setMinimumSize(new java.awt.Dimension(248, 288));
        imagePanel.add(syarif, "syarif");
        syarif.getAccessibleContext().setAccessibleParent(syarif);

        kiki.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kiki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/belajarMenampilkanGambar/download (5).jpeg"))); // NOI18N
        kiki.setLabelFor(kiki);
        kiki.setToolTipText("");
        kiki.setMaximumSize(new java.awt.Dimension(682, 540));
        kiki.setMinimumSize(new java.awt.Dimension(682, 540));
        kiki.setPreferredSize(new java.awt.Dimension(682, 540));
        imagePanel.add(kiki, "kiki");

        oji.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/belajarMenampilkanGambar/download (3).jpeg"))); // NOI18N
        imagePanel.add(oji, "oji");

        dimas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dimas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/belajarMenampilkanGambar/download (4).jpeg"))); // NOI18N
        dimas.setPreferredSize(new java.awt.Dimension(316, 400));
        imagePanel.add(dimas, "dimas");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bKeluarActionPerformed

    private void bkikiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkikiActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)imagePanel.getLayout();
        card.show(imagePanel, "kiki");
    }//GEN-LAST:event_bkikiActionPerformed

    private void bojiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bojiActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)imagePanel.getLayout();
        card.show(imagePanel, "oji");
    }//GEN-LAST:event_bojiActionPerformed

    private void bdimasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdimasActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)imagePanel.getLayout();
        card.show(imagePanel, "dimas");
    }//GEN-LAST:event_bdimasActionPerformed

    private void bsyarifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsyarifActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)imagePanel.getLayout();
        card.show(imagePanel, "syarif");
    }//GEN-LAST:event_bsyarifActionPerformed

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
            java.util.logging.Logger.getLogger(TampilanGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanGambar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bKeluar;
    private javax.swing.JButton bdimas;
    private javax.swing.JButton bkiki;
    private javax.swing.JButton boji;
    private javax.swing.JButton bsyarif;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel dimas;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel kiki;
    private javax.swing.JLabel oji;
    private javax.swing.JLabel syarif;
    // End of variables declaration//GEN-END:variables
}
