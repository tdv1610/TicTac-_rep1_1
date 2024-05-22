/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.NguoiDungDAO;
import DTO.NguoiDungDTO;
import javax.swing.JOptionPane;
import GUI.NhapEmail;
/**
 *
 * @author ASUS
 */
public class TaoMKMoi extends javax.swing.JFrame {

    /**
     * Creates new form TaoMKMoi
     */
    public TaoMKMoi() {
        initComponents();
    }

    TaoMKMoi(String email, String generatedOtp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_TaoMKMoi = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        label_PassMoi_TMKM = new javax.swing.JLabel();
        label_XacNhanPw_TMKM = new javax.swing.JLabel();
        pwf_PassMoi_TMKM = new javax.swing.JPasswordField();
        pwf_XacNhanPass_XNMK = new javax.swing.JPasswordField();
        btn_Xong_TaoMKM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_TaoMKMoi.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/teamwork (2).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to TicTac");

        label_PassMoi_TMKM.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        label_PassMoi_TMKM.setForeground(new java.awt.Color(255, 255, 255));
        label_PassMoi_TMKM.setText("Mật khẩu mới");

        label_XacNhanPw_TMKM.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        label_XacNhanPw_TMKM.setForeground(new java.awt.Color(255, 255, 255));
        label_XacNhanPw_TMKM.setText("Xác nhận mật khẩu");

        pwf_PassMoi_TMKM.setBackground(new java.awt.Color(0, 102, 102));

        pwf_XacNhanPass_XNMK.setBackground(new java.awt.Color(0, 102, 102));

        btn_Xong_TaoMKM.setBackground(new java.awt.Color(0, 102, 102));
        btn_Xong_TaoMKM.setForeground(new java.awt.Color(255, 255, 255));
        btn_Xong_TaoMKM.setText("Xong");
        btn_Xong_TaoMKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Xong_TaoMKMMouseClicked(evt);
            }
        });
        btn_Xong_TaoMKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Xong_TaoMKMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_TaoMKMoiLayout = new javax.swing.GroupLayout(panel_TaoMKMoi);
        panel_TaoMKMoi.setLayout(panel_TaoMKMoiLayout);
        panel_TaoMKMoiLayout.setHorizontalGroup(
            panel_TaoMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TaoMKMoiLayout.createSequentialGroup()
                .addGroup(panel_TaoMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_TaoMKMoiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_TaoMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                            .addGroup(panel_TaoMKMoiLayout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel2))))
                    .addGroup(panel_TaoMKMoiLayout.createSequentialGroup()
                        .addGroup(panel_TaoMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_TaoMKMoiLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(panel_TaoMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel_TaoMKMoiLayout.createSequentialGroup()
                                        .addComponent(label_XacNhanPw_TMKM)
                                        .addGap(18, 18, 18)
                                        .addComponent(pwf_XacNhanPass_XNMK))
                                    .addGroup(panel_TaoMKMoiLayout.createSequentialGroup()
                                        .addComponent(label_PassMoi_TMKM)
                                        .addGap(63, 63, 63)
                                        .addComponent(pwf_PassMoi_TMKM, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel_TaoMKMoiLayout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(btn_Xong_TaoMKM)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_TaoMKMoiLayout.setVerticalGroup(
            panel_TaoMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TaoMKMoiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(panel_TaoMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_PassMoi_TMKM)
                    .addComponent(pwf_PassMoi_TMKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_TaoMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_XacNhanPw_TMKM)
                    .addComponent(pwf_XacNhanPass_XNMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Xong_TaoMKM)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_TaoMKMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_TaoMKMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Xong_TaoMKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Xong_TaoMKMMouseClicked
        DangNhap dn = new DangNhap();
        dn.show();
        dispose();
    }//GEN-LAST:event_btn_Xong_TaoMKMMouseClicked

    private void btn_Xong_TaoMKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Xong_TaoMKMActionPerformed
       String newPassword = new String(pwf_PassMoi_TMKM.getPassword());
                String confirmPassword = new String(pwf_XacNhanPass_XNMK.getPassword());
                NguoiDungDAO nd = new NguoiDungDAO();
               NguoiDungDTO user=nd.updatePassword(NhapEmail.pEmail);
                if(newPassword.equals("")||confirmPassword.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Bạn chưa nhập mật khẩu hoặc xác nhận mật khẩu.");
                }
                else if (!newPassword.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(null, "Mật khẩu xác nhận không khớp.");
                } else {
                    nd.updatePassword(NhapEmail.pEmail );
                    JOptionPane.showMessageDialog(null, "Mật khẩu đã được thay đổi thành công.");
                    dispose();
    }//GEN-LAST:event_btn_Xong_TaoMKMActionPerformed
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
            java.util.logging.Logger.getLogger(TaoMKMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaoMKMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaoMKMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaoMKMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaoMKMoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Xong_TaoMKM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label_PassMoi_TMKM;
    private javax.swing.JLabel label_XacNhanPw_TMKM;
    private javax.swing.JPanel panel_TaoMKMoi;
    private javax.swing.JPasswordField pwf_PassMoi_TMKM;
    private javax.swing.JPasswordField pwf_XacNhanPass_XNMK;
    // End of variables declaration//GEN-END:variables
}
