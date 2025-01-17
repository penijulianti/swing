/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import crud.crudpetugas;
import database.koneksi;
import entitas.enpetugas;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static view.beranda.show;

/**
 *
 * @author ASUS
 */
public class akun extends javax.swing.JFrame {
    koneksi conn;
    Connection kon;
    crudpetugas p = new crudpetugas();
    enpetugas ep = new enpetugas();
    String nm,user,passw,sts;
    private String status;
    /**
     * Creates new form akun
     */
    public akun() {
        initComponents();
        conn = new koneksi();
        kon =  conn.buatKoneksi();
    }

    public void set(String n,String usr,String ps,String st){
        show.setText(usr);
        nama.setText(n);
        us.setText(usr);
        pas.setText(ps);
        sts = st;
        if(sts.equals("Direksi")){
            kar.setSelected(true);
        }else{
            kar.setSelected(true);
        }
        nm = n;
        user=usr;
        passw = ps;
        sts=st; 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        us = new javax.swing.JTextField();
        pas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dir = new javax.swing.JRadioButton();
        kar = new javax.swing.JRadioButton();
        edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buat Akun");

        nama.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        nama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaFocusGained(evt);
            }
        });
        nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                namaKeyTyped(evt);
            }
        });

        us.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        us.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usKeyTyped(evt);
            }
        });

        pas.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        pas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pasKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel9.setText("Password");

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel10.setText("Username");

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel11.setText("Nama");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jLabel12.setText("jLabel6");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        buttonGroup1.add(dir);
        dir.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        dir.setText("Direktur");

        buttonGroup1.add(kar);
        kar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        kar.setText("Karyawan");

        edit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        edit.setText("Update");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(us)
                            .addComponent(pas)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(kar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(edit)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dir)
                    .addComponent(kar))
                .addGap(61, 61, 61)
                .addComponent(edit)
                .addGap(140, 140, 140))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void namaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaFocusGained
        // TODO add your handling code here:
        //        if(nama.getText().equals(ABORT))
    }//GEN-LAST:event_namaFocusGained

    private void namaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            us.requestFocus();
        }
    }//GEN-LAST:event_namaKeyPressed

    private void namaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyReleased
        // TODO add your handling code here:
        int pos = nama.getCaretPosition();
        nama.setText(nama.getText().toUpperCase());
        nama.setCaretPosition(pos);
    }//GEN-LAST:event_namaKeyReleased

    private void namaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyTyped
        // TODO add your handling code here:
        if( ! (Character.isLetter(evt.getKeyChar()) || Character.isSpaceChar(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_DELETE || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) ){
            evt.consume();//menghilangkan inputan
            JOptionPane.showMessageDialog(this,"Inputan Tidak Boleh Angka","Informasi",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_namaKeyTyped

    private void usKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            pas.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            nama.requestFocus();
        }

    }//GEN-LAST:event_usKeyPressed

    private void usKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usKeyReleased
        // TODO add your handling code here:
        int pos = us.getCaretPosition();
        us.setText(us.getText().toLowerCase());
        us.setCaretPosition(pos);
    }//GEN-LAST:event_usKeyReleased

    private void usKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usKeyTyped
        // TODO add your handling code here:
        if(Character.isDigit(evt.getKeyChar()) || Character.isSpaceChar(evt.getKeyChar()) ){
            evt.consume();//menghilangkan inputan
            JOptionPane.showMessageDialog(this,"Inputan Tidak Boleh Angka","Informasi",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_usKeyTyped

    private void pasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pasKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            nama.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            us.requestFocus();
        }
    }//GEN-LAST:event_pasKeyPressed

    private void pasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pasKeyTyped
        // TODO add your handling code here:
        if(! ((Character.isDigit(evt.getKeyChar())) || evt.getKeyChar() == KeyEvent.VK_DELETE || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Hanya Menggunakan Angka", "Informasi", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_pasKeyTyped

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        ep.setNama(nama.getText());
            if(nama.getText().isEmpty() ){
                JOptionPane.showMessageDialog(null,"Data Harus Lengkap");
            }else{
                ep.setUsername(us.getText());
                ep.setPassword(pas.getText());
                ep.setStatus(status);
                if(p.edit(ep)==1){
                    JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
                }else{
                    JOptionPane.showMessageDialog(null,"Data Gagal Disimpan");
                }
            }
        
    }//GEN-LAST:event_editActionPerformed

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
            java.util.logging.Logger.getLogger(akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new akun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton dir;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton kar;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField pas;
    private javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables
}
