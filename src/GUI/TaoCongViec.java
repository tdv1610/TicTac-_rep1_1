/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author ASUS
 */
public class TaoCongViec extends javax.swing.JFrame {

    /**
     * Creates new form TaoCongViec
     */
    public TaoCongViec() {
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

        panel_TaoCV = new javax.swing.JPanel();
        label_TaoCV = new javax.swing.JLabel();
        label_TenCV_TaoCV = new javax.swing.JLabel();
        label_LinhVuc_TaCV = new javax.swing.JLabel();
        label_MoTa_TaoCV = new javax.swing.JLabel();
        label_MDUT_TaoCV = new javax.swing.JLabel();
        label_NgayBD_TaoCV = new javax.swing.JLabel();
        label_NgayKT_TaoCV = new javax.swing.JLabel();
        tf_TenCV_TaoCV = new javax.swing.JTextField();
        tf_LinhVuc_TaoCV = new javax.swing.JTextField();
        scrpane_MoTa_TaoCV = new javax.swing.JScrollPane();
        textarea_MoTa_TaoCV = new javax.swing.JTextArea();
        combobox_MDUT_TaoCV = new javax.swing.JComboBox<>();
        label_NguoiPT_TaoCV = new javax.swing.JLabel();
        scrpane_NguoiPT_TaoCV = new javax.swing.JScrollPane();
        list_NguoiPT_TaoCV = new javax.swing.JList<>();
        btn_HoanThanh_TaoCV = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_TaoCV.setBackground(new java.awt.Color(0, 102, 102));

        label_TaoCV.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_TaoCV.setForeground(new java.awt.Color(255, 255, 255));
        label_TaoCV.setText("Tạo công việc mới");

        label_TenCV_TaoCV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_TenCV_TaoCV.setForeground(new java.awt.Color(255, 255, 255));
        label_TenCV_TaoCV.setText("Tên công việc");

        label_LinhVuc_TaCV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_LinhVuc_TaCV.setForeground(new java.awt.Color(255, 255, 255));
        label_LinhVuc_TaCV.setText("Lĩnh vực");

        label_MoTa_TaoCV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_MoTa_TaoCV.setForeground(new java.awt.Color(255, 255, 255));
        label_MoTa_TaoCV.setText("Mô tả");

        label_MDUT_TaoCV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_MDUT_TaoCV.setForeground(new java.awt.Color(255, 255, 255));
        label_MDUT_TaoCV.setText("Mức độ ưu tiên");

        label_NgayBD_TaoCV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_NgayBD_TaoCV.setForeground(new java.awt.Color(255, 255, 255));
        label_NgayBD_TaoCV.setText("Ngày bắt đầu");

        label_NgayKT_TaoCV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_NgayKT_TaoCV.setForeground(new java.awt.Color(255, 255, 255));
        label_NgayKT_TaoCV.setText("Ngày kết thúc");

        tf_TenCV_TaoCV.setBackground(new java.awt.Color(0, 153, 153));
        tf_TenCV_TaoCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_TenCV_TaoCVActionPerformed(evt);
            }
        });

        tf_LinhVuc_TaoCV.setBackground(new java.awt.Color(0, 153, 153));

        textarea_MoTa_TaoCV.setBackground(new java.awt.Color(0, 153, 153));
        textarea_MoTa_TaoCV.setColumns(20);
        textarea_MoTa_TaoCV.setRows(5);
        scrpane_MoTa_TaoCV.setViewportView(textarea_MoTa_TaoCV);

        combobox_MDUT_TaoCV.setBackground(new java.awt.Color(0, 153, 153));
        combobox_MDUT_TaoCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. Cần gấp", "2. Quan trọng", "3. Thường" }));
        combobox_MDUT_TaoCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_MDUT_TaoCVActionPerformed(evt);
            }
        });

        label_NguoiPT_TaoCV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_NguoiPT_TaoCV.setForeground(new java.awt.Color(255, 255, 255));
        label_NguoiPT_TaoCV.setText("Chọn người phụ trách");

        list_NguoiPT_TaoCV.setBackground(new java.awt.Color(0, 153, 153));
        list_NguoiPT_TaoCV.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrpane_NguoiPT_TaoCV.setViewportView(list_NguoiPT_TaoCV);

        btn_HoanThanh_TaoCV.setBackground(new java.awt.Color(0, 153, 153));
        btn_HoanThanh_TaoCV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_HoanThanh_TaoCV.setText("Hoàn thành");
        btn_HoanThanh_TaoCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_HoanThanh_TaoCVMouseClicked(evt);
            }
        });

        jDateChooser1.setBackground(new java.awt.Color(0, 153, 153));
        jDateChooser1.setDateFormatString("dd MMM yyyy");

        jDateChooser2.setBackground(new java.awt.Color(0, 153, 153));
        jDateChooser2.setDateFormatString("dd MMM yyyy");

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Tạo thêm");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_TaoCVLayout = new javax.swing.GroupLayout(panel_TaoCV);
        panel_TaoCV.setLayout(panel_TaoCVLayout);
        panel_TaoCVLayout.setHorizontalGroup(
            panel_TaoCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TaoCVLayout.createSequentialGroup()
                .addGroup(panel_TaoCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_TaoCVLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(label_TaoCV))
                    .addGroup(panel_TaoCVLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(panel_TaoCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_TaoCVLayout.createSequentialGroup()
                                .addComponent(label_NguoiPT_TaoCV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scrpane_NguoiPT_TaoCV, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_TaoCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_TaoCVLayout.createSequentialGroup()
                                    .addGroup(panel_TaoCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_MDUT_TaoCV)
                                        .addComponent(label_NgayBD_TaoCV))
                                    .addGroup(panel_TaoCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_TaoCVLayout.createSequentialGroup()
                                            .addGap(81, 81, 81)
                                            .addComponent(combobox_MDUT_TaoCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel_TaoCVLayout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(label_NgayKT_TaoCV)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_TaoCVLayout.createSequentialGroup()
                                    .addGroup(panel_TaoCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_TenCV_TaoCV)
                                        .addComponent(label_LinhVuc_TaCV)
                                        .addComponent(label_MoTa_TaoCV))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel_TaoCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_TenCV_TaoCV)
                                        .addComponent(tf_LinhVuc_TaoCV)
                                        .addComponent(scrpane_MoTa_TaoCV, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))))))
                    .addGroup(panel_TaoCVLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btn_HoanThanh_TaoCV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        panel_TaoCVLayout.setVerticalGroup(
            panel_TaoCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TaoCVLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(label_TaoCV)
                .addGap(18, 18, 18)
                .addGroup(panel_TaoCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_TenCV_TaoCV)
                    .addComponent(tf_TenCV_TaoCV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_TaoCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_LinhVuc_TaCV)
                    .addGroup(panel_TaoCVLayout.createSequentialGroup()
                        .addComponent(tf_LinhVuc_TaoCV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_TaoCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_MoTa_TaoCV)
                    .addComponent(scrpane_MoTa_TaoCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_TaoCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_TaoCVLayout.createSequentialGroup()
                        .addComponent(combobox_MDUT_TaoCV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(label_MDUT_TaoCV))
                .addGap(12, 12, 12)
                .addGroup(panel_TaoCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_NgayBD_TaoCV)
                    .addComponent(label_NgayKT_TaoCV)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_TaoCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_NguoiPT_TaoCV)
                    .addComponent(scrpane_NguoiPT_TaoCV, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_HoanThanh_TaoCV)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_TaoCV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_TaoCV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combobox_MDUT_TaoCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_MDUT_TaoCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_MDUT_TaoCVActionPerformed

    private void btn_HoanThanh_TaoCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HoanThanh_TaoCVMouseClicked
        Homepage hp = new Homepage();
        hp.show();
        dispose();
    }//GEN-LAST:event_btn_HoanThanh_TaoCVMouseClicked

    private void tf_TenCV_TaoCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_TenCV_TaoCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_TenCV_TaoCVActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        TaoCongViec tcv = new TaoCongViec();
        tcv.show();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(TaoCongViec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaoCongViec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaoCongViec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaoCongViec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaoCongViec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_HoanThanh_TaoCV;
    private javax.swing.JComboBox<String> combobox_MDUT_TaoCV;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel label_LinhVuc_TaCV;
    private javax.swing.JLabel label_MDUT_TaoCV;
    private javax.swing.JLabel label_MoTa_TaoCV;
    private javax.swing.JLabel label_NgayBD_TaoCV;
    private javax.swing.JLabel label_NgayKT_TaoCV;
    private javax.swing.JLabel label_NguoiPT_TaoCV;
    private javax.swing.JLabel label_TaoCV;
    private javax.swing.JLabel label_TenCV_TaoCV;
    private javax.swing.JList<String> list_NguoiPT_TaoCV;
    private javax.swing.JPanel panel_TaoCV;
    private javax.swing.JScrollPane scrpane_MoTa_TaoCV;
    private javax.swing.JScrollPane scrpane_NguoiPT_TaoCV;
    private javax.swing.JTextArea textarea_MoTa_TaoCV;
    private javax.swing.JTextField tf_LinhVuc_TaoCV;
    private javax.swing.JTextField tf_TenCV_TaoCV;
    // End of variables declaration//GEN-END:variables
}
