/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeopardygame.controller;

import jeopardygame.visualeffect.JeopardyColors;
/**
 *
 * @author student
 */
public class EndGameDialog extends javax.swing.JFrame {

    /**
     * Creates new form EndGameDialog
     * @param answeredAllQuestions
     */
    
    MainWin mainWindow;
    
    public EndGameDialog(MainWin mainWindow) {
        initComponents();
        this.mainWindow = mainWindow;
        this.setLocationRelativeTo(null);
        JeopardyColors.setComponentColor(rootPane);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yesButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        promptLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        yesButton.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        yesButton.setText("Yes");
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });

        noButton.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        noButton.setText("No");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        promptLabel.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        promptLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        promptLabel.setText("End Game?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(promptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(yesButton)
                        .addGap(105, 105, 105)
                        .addComponent(noButton)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(promptLabel)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesButton)
                    .addComponent(noButton))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        // TODO add your handling code here:
        mainWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_noButtonActionPerformed

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        // TODO add your handling code here:
        mainWindow.endGame();
        mainWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_yesButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton noButton;
    private javax.swing.JLabel promptLabel;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
