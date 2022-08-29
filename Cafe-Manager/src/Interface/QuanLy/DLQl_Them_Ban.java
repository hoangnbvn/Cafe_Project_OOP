/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.QuanLy;

import Interface.BanHang.jpBanHang;
import Models.Ban;
import Mysql.ConnectSQL;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JRootPane;

public class DLQl_Them_Ban extends javax.swing.JDialog {

    ConnectSQL cn = new ConnectSQL();

    /**
     * Creates new form DLQl_Ban
     */
    public DLQl_Them_Ban(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        JRootPane rp = this.getRootPane();
        rp.setDefaultButton(btnXacNhan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        txtTenBan = new javax.swing.JTextField();
        btnXacNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 40, 50)));
        jPanel1.setForeground(new java.awt.Color(56, 25, 15));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 160));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(114, 79, 43));
        jLabel1.setText("Tên bàn: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 25, 15));
        jLabel2.setText("Thêm bàn mới");

        btnHuy.setBackground(new java.awt.Color(100, 50, 0));
        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy bỏ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        txtTenBan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenBanKeyReleased(evt);
            }
        });

        btnXacNhan.setBackground(new java.awt.Color(100, 50, 0));
        btnXacNhan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnXacNhan)
                        .addGap(18, 18, 18)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenBan)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXacNhan)
                    .addComponent(btnHuy))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        if (txtTenBan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên bàn không được để trống !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Ban b = new Ban();
        b.SetTenBan("Bàn " + txtTenBan.getText());
        b.SetTrangThai("Trống");

        // Setting tên trùng nhau
        ArrayList<Ban> arrBan;
        arrBan = cn.GetBan(0);
        int trungLap = 0;
        if (arrBan != null) {
            for (int i = 0; i < arrBan.size(); i++) {
                if (arrBan.get(i).GetTenBan().equals(b.GetTenBan())) {
                    JOptionPane.showMessageDialog(null, "Tên bàn không được trùng lặp !", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                    trungLap = 1;
                    break;
                }
            }
        }

        if (trungLap == 0) {
            cn.InsertBan(b);

            Jp_QLBan.B.FillTable();
            Jp_QLBan.B.updateUI();
            try {
                jpBanHang.bh.FillBan();
                jpBanHang.bh.updateUI();
            } catch (Exception e) {

            }
            JOptionPane.showMessageDialog(null, "Thêm bàn thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void txtTenBanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenBanKeyReleased
        try {
            Integer.parseInt(txtTenBan.getText());
        } catch (Exception e) {
            txtTenBan.setText(null);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenBanKeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtTenBan;
    // End of variables declaration//GEN-END:variables
}