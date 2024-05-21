/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.NguoiDungDAO;
import DAO.NguoiDung_NhomDAO;
import DAO.NhomDAO;
import DTO.NguoiDungDTO;
import DTO.NguoiDung_NhomDTO;
import DTO.NhomDTO;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ASUS
 */
public class TaoNhom extends javax.swing.JFrame {

    /**
     * Creates new form TaoNhom
     */
    public TaoNhom() {
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

        panel_TaoNhom = new javax.swing.JPanel();
        label_TaoNhom_TaoNhom = new javax.swing.JLabel();
        label_TenNhom_TaoNhom = new javax.swing.JLabel();
        label_ThanhVien_taoNhom = new javax.swing.JLabel();
        tf_TenNhom_TaoNhom = new javax.swing.JTextField();
        tf_ThanhVien_TaoNhom = new javax.swing.JTextField();
        btn_ThanhVien_TaoNhom = new javax.swing.JButton();
        scrpane_ThanhVien_TaoNhom = new javax.swing.JScrollPane();
        table_dsTV = new javax.swing.JTable();
        btn_Xong_TaoNhom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_TaoNhom.setBackground(new java.awt.Color(0, 102, 102));

        label_TaoNhom_TaoNhom.setBackground(new java.awt.Color(255, 255, 255));
        label_TaoNhom_TaoNhom.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_TaoNhom_TaoNhom.setForeground(new java.awt.Color(255, 255, 255));
        label_TaoNhom_TaoNhom.setText("Tạo nhóm mới");

        label_TenNhom_TaoNhom.setBackground(new java.awt.Color(255, 255, 255));
        label_TenNhom_TaoNhom.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_TenNhom_TaoNhom.setForeground(new java.awt.Color(255, 255, 255));
        label_TenNhom_TaoNhom.setText("Tên nhóm");

        label_ThanhVien_taoNhom.setBackground(new java.awt.Color(255, 255, 255));
        label_ThanhVien_taoNhom.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_ThanhVien_taoNhom.setForeground(new java.awt.Color(255, 255, 255));
        label_ThanhVien_taoNhom.setText("Thành viên");

        tf_TenNhom_TaoNhom.setBackground(new java.awt.Color(0, 153, 153));
        tf_TenNhom_TaoNhom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_TenNhom_TaoNhomActionPerformed(evt);
            }
        });

        tf_ThanhVien_TaoNhom.setBackground(new java.awt.Color(0, 153, 153));

        btn_ThanhVien_TaoNhom.setBackground(new java.awt.Color(0, 102, 102));
        btn_ThanhVien_TaoNhom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus_4315609 (1).png"))); // NOI18N
        btn_ThanhVien_TaoNhom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThanhVien_TaoNhomActionPerformed(evt);
            }
        });

        table_dsTV.setBackground(new java.awt.Color(0, 153, 153));
        table_dsTV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Email", "Tên người dùng"
            }
        ));
        scrpane_ThanhVien_TaoNhom.setViewportView(table_dsTV);

        btn_Xong_TaoNhom.setBackground(new java.awt.Color(0, 153, 153));
        btn_Xong_TaoNhom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Xong_TaoNhom.setText("Xong");
        btn_Xong_TaoNhom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Xong_TaoNhomMouseClicked(evt);
            }
        });
        btn_Xong_TaoNhom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Xong_TaoNhomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_TaoNhomLayout = new javax.swing.GroupLayout(panel_TaoNhom);
        panel_TaoNhom.setLayout(panel_TaoNhomLayout);
        panel_TaoNhomLayout.setHorizontalGroup(
            panel_TaoNhomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TaoNhomLayout.createSequentialGroup()
                .addGroup(panel_TaoNhomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_TaoNhomLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(label_TaoNhom_TaoNhom))
                    .addGroup(panel_TaoNhomLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(panel_TaoNhomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_TaoNhomLayout.createSequentialGroup()
                                .addComponent(label_TenNhom_TaoNhom)
                                .addGap(18, 18, 18)
                                .addComponent(tf_TenNhom_TaoNhom, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_TaoNhomLayout.createSequentialGroup()
                                .addComponent(label_ThanhVien_taoNhom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_TaoNhomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(scrpane_ThanhVien_TaoNhom, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                    .addComponent(tf_ThanhVien_TaoNhom))
                                .addGap(18, 18, 18)
                                .addComponent(btn_ThanhVien_TaoNhom)))))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TaoNhomLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Xong_TaoNhom)
                .addGap(320, 320, 320))
        );
        panel_TaoNhomLayout.setVerticalGroup(
            panel_TaoNhomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TaoNhomLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(label_TaoNhom_TaoNhom)
                .addGap(50, 50, 50)
                .addGroup(panel_TaoNhomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_TenNhom_TaoNhom)
                    .addComponent(tf_TenNhom_TaoNhom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_TaoNhomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ThanhVien_TaoNhom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_ThanhVien_taoNhom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_ThanhVien_TaoNhom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrpane_ThanhVien_TaoNhom, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Xong_TaoNhom)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_TaoNhom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_TaoNhom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_TenNhom_TaoNhomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_TenNhom_TaoNhomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_TenNhom_TaoNhomActionPerformed

    private void btn_Xong_TaoNhomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Xong_TaoNhomActionPerformed
        // TODO add your handling code here:
      
        if (tf_TenNhom_TaoNhom.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Chưa nhập tên nhóm");
    } else {
        // Create an instance of NhomDAO and attempt to add the group
        NhomDAO nhomthem = new NhomDAO();
        NhomDTO nhom = null;
        try {
            nhom = nhomthem.themnhom(tf_TenNhom_TaoNhom.getText(), DangNhap.pEmail);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tạo nhóm: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return;
        }

        // Check the result and update the UI accordingly
        if (nhom != null) {
            JOptionPane.showMessageDialog(this, "Nhóm đã được tạo thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            // Lấy mã nhóm của nhóm vừa được tạo
            String maNhom = nhomthem.laymanhom(tf_TenNhom_TaoNhom.getText());

            // Thêm thành viên vào nhóm mới tạo
            NguoiDung_NhomDAO themtv = new NguoiDung_NhomDAO();
            NguoiDung_NhomDTO ndNhom = null;

            // Thêm chủ nhóm vào trước
            try {
                ndNhom = themtv.themthanhvien(DangNhap.pEmail, maNhom);
                if (ndNhom == null) {
                    JOptionPane.showMessageDialog(this, "Lỗi khi thêm chủ nhóm vào nhóm.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi thêm chủ nhóm vào nhóm: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                return;
            }

            DefaultTableModel model = (DefaultTableModel) table_dsTV.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                String email = model.getValueAt(i, 0).toString();
                try {
                    ndNhom = themtv.themthanhvien(email, maNhom);
                    if (ndNhom == null) {
                        JOptionPane.showMessageDialog(this, "Lỗi khi thêm thành viên " + email + " vào nhóm.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Lỗi khi thêm thành viên " + email + " vào nhóm: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                    return;
                }
            }

            // Mở cửa sổ TaoCongViec và đóng cửa sổ hiện tại
            TaoCongViec tcv = new TaoCongViec();
            tcv.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Tạo nhóm thất bại. Tên nhóm đã tồn tại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
       
    }//GEN-LAST:event_btn_Xong_TaoNhomActionPerformed

    
    private void btn_Xong_TaoNhomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Xong_TaoNhomMouseClicked

    }//GEN-LAST:event_btn_Xong_TaoNhomMouseClicked

    private void btn_ThanhVien_TaoNhomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThanhVien_TaoNhomActionPerformed
        // TODO add your handling code here:        
        // Lấy email được nhập
        DefaultTableModel model = (DefaultTableModel) table_dsTV.getModel();
        String email = tf_ThanhVien_TaoNhom.getText();

        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Chưa nhập tên thành viên nhóm");
        } 
        else {
            NguoiDungDAO nd = new NguoiDungDAO();
            NguoiDungDTO themnd = nd.them(email);

    
            if (themnd != null) {
            // Kiểm tra xem thành viên đã tồn tại trong bảng chưa
                boolean isExist = false;
                for (int i = 0; i < model.getRowCount(); i++) {
                    Object value = model.getValueAt(i, 0); // Lấy giá trị của cột đầu tiên
                    if (value != null && value.toString().equals(themnd.getEMAILND())) {
                    isExist = true;
                    break;
                    }
                }
                if (!isExist) {
                    model.insertRow(0, new Object[]{themnd.getEMAILND(), themnd.getTENND()});
                    
                }
                else {
                    JOptionPane.showMessageDialog(this, "Thành viên đã tồn tại trong nhóm", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Người dùng không tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btn_ThanhVien_TaoNhomActionPerformed

    public void ViewTable(){
        DefaultTableModel model = (DefaultTableModel) table_dsTV.getModel();
        
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
            java.util.logging.Logger.getLogger(TaoNhom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaoNhom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaoNhom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaoNhom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaoNhom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ThanhVien_TaoNhom;
    private javax.swing.JButton btn_Xong_TaoNhom;
    private javax.swing.JLabel label_TaoNhom_TaoNhom;
    private javax.swing.JLabel label_TenNhom_TaoNhom;
    private javax.swing.JLabel label_ThanhVien_taoNhom;
    private javax.swing.JPanel panel_TaoNhom;
    private javax.swing.JScrollPane scrpane_ThanhVien_TaoNhom;
    private javax.swing.JTable table_dsTV;
    private javax.swing.JTextField tf_TenNhom_TaoNhom;
    private javax.swing.JTextField tf_ThanhVien_TaoNhom;
    // End of variables declaration//GEN-END:variables
}
