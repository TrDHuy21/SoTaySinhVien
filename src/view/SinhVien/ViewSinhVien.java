/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.SinhVien;

import java.util.Collection;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.SinhVien;

/**
 *
 * @author DELL
 */
public class ViewSinhVien extends javax.swing.JFrame {
    public static SinhVien SV = model.SinhVien.User;
    public static ViewSinhVien viewSinhVien;

    /**
     * Creates new form ViewTrangChuSinhVien
     */
    public ViewSinhVien() {
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

        thongTinCaNhan = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        TNCN_sdt = new javax.swing.JLabel();
        TNCN_email = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TNCN_mlc = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TNCN_cmnd = new javax.swing.JLabel();
        TNCN_msv = new javax.swing.JLabel();
        TNCN_ten = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TNCN_ns = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TNCN_qq = new javax.swing.JLabel();
        thongTinLopChinh = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        trai_lb_ten = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        khungPhai = new javax.swing.JPanel();

        jLabel17.setText("CMND");

        jLabel6.setText("Họ tên");

        jLabel20.setText("Mã lớp chính");

        TNCN_sdt.setText("jLabel9");
        TNCN_sdt.setText(model.SinhVien.User.getSdt());

        TNCN_email.setText("jLabel22");
        TNCN_email.setText(model.SinhVien.User.getEmail());

        jLabel16.setText("Số điện thoại");

        jLabel10.setText("Ngày Sinh");

        jLabel12.setText("Mã sinh viên");

        TNCN_mlc.setText("jLabel11");
        if (model.SinhVien.User.getLopChinh() != null) {
            TNCN_mlc.setText(model.SinhVien.User.getLopChinh().getMa());
        } else {
            TNCN_mlc.setText("");
        }

        TNCN_cmnd.setText("jLabel14");
        TNCN_cmnd.setText(model.SinhVien.User.getCmnd());

        TNCN_msv.setText("jLabel7");
        TNCN_msv.setText(model.SinhVien.User.getMa());

        TNCN_ten.setText("jLabel13");
        TNCN_ten.setText((model.SinhVien.User.getTen()));

        jLabel19.setText("Email");

        TNCN_ns.setText("jLabel15");
        String s = ""+ model.SinhVien.User.getNgaySinh().getDay() + " / "
        + model.SinhVien.User.getNgaySinh().getMonth() + " / "
        + model.SinhVien.User.getNgaySinh().getYear();
        TNCN_ns.setText(s);

        jLabel8.setText("Quê quán");

        TNCN_qq.setText("jLabel23");
        TNCN_qq.setText(model.SinhVien.User.getQue());

        javax.swing.GroupLayout thongTinCaNhanLayout = new javax.swing.GroupLayout(thongTinCaNhan);
        thongTinCaNhan.setLayout(thongTinCaNhanLayout);
        thongTinCaNhanLayout.setHorizontalGroup(
            thongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thongTinCaNhanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(thongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel6)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGroup(thongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thongTinCaNhanLayout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(thongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TNCN_msv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TNCN_sdt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TNCN_cmnd, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                            .addComponent(TNCN_qq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TNCN_ns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TNCN_ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(thongTinCaNhanLayout.createSequentialGroup()
                                .addComponent(TNCN_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(284, 284, 284))))
                    .addGroup(thongTinCaNhanLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TNCN_mlc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(thongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(thongTinCaNhanLayout.createSequentialGroup()
                    .addGap(413, 413, 413)
                    .addComponent(jLabel18)
                    .addContainerGap(223, Short.MAX_VALUE)))
        );
        thongTinCaNhanLayout.setVerticalGroup(
            thongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thongTinCaNhanLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(thongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TNCN_msv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(thongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TNCN_ten))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(thongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(TNCN_mlc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(thongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TNCN_ns)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(thongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TNCN_sdt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(thongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TNCN_cmnd)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(thongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(TNCN_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(thongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TNCN_qq))
                .addGap(0, 0, 0))
            .addGroup(thongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(thongTinCaNhanLayout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(jLabel18)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel1.setText("Giáo viên:");

        jLabel3.setText("jLabel3");
        if (model.SinhVien.User.getLopChinh() != null) {
            jLabel3.setText(model.SinhVien.User.getLopChinh().getGiaoVien().getTen());
        } else {
            jLabel3.setText("");
        }

        jLabel4.setText("Mã lớp");

        jLabel5.setText("jLabel5");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Sinh Viên", "Họ tên", "Ngày Sinh", "Quê quán"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout thongTinLopChinhLayout = new javax.swing.GroupLayout(thongTinLopChinh);
        thongTinLopChinh.setLayout(thongTinLopChinhLayout);
        thongTinLopChinhLayout.setHorizontalGroup(
            thongTinLopChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thongTinLopChinhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(thongTinLopChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(thongTinLopChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thongTinLopChinhLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        thongTinLopChinhLayout.setVerticalGroup(
            thongTinLopChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thongTinLopChinhLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(thongTinLopChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(thongTinLopChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("sinh viên");
        setSize(getMinimumSize());

        trai_lb_ten.setText("jLabel2");
        trai_lb_ten.setText(model.SinhVien.User.getTen());

        jButton1.setText("thông tin cá nhân");
        jButton1.setMargin(new java.awt.Insets(2, 0, 2, 14));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thông tin lớp chính");
        jButton2.setMargin(new java.awt.Insets(2, 0, 2, 14));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Thời khóa biểu");
        jButton3.setMargin(new java.awt.Insets(2, 0, 2, 14));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("kết quả học tập");
        jButton4.setMargin(new java.awt.Insets(2, 0, 2, 14));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("kết quả thi");
        jButton5.setMargin(new java.awt.Insets(2, 0, 2, 14));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        khungPhai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        khungPhai.setMinimumSize(new java.awt.Dimension(500, 500));
        khungPhai.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                khungPhaiComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(khungPhai);
        khungPhai.getAccessibleContext().setAccessibleName("");
        khungPhai.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trai_lb_ten)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trai_lb_ten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        khungPhai.removeAll();
        khungPhai.add(thongTinCaNhan);
        khungPhai.revalidate();
        khungPhai.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void khungPhaiComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_khungPhaiComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_khungPhaiComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        khungPhai.removeAll();
        if (model.SinhVien.User.getLopChinh()==null)
            return;
        khungPhai.add(thongTinLopChinh);
        jLabel5.setText(SV.getLopChinh().getMa());
        jLabel3.setText(SV.getLopChinh().getGiaoVien().getTen());
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int i = 1;
        Collection<SinhVien> listsv = model.SinhVien.User.getLopChinh().getDsSinhVien().values();
        for (SinhVien sv : listsv) {
            String s = "" + sv.getNgaySinh().getDay() + " / "
                    + sv.getNgaySinh().getMonth() + " / "
                    + sv.getNgaySinh().getYear();
            t.addRow(new Object[]{i++, sv.getMa(), sv.getTen(), s, sv.getQue()});
        }
        khungPhai.revalidate();
        khungPhai.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ViewTrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ViewTrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ViewTrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ViewTrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewTrangChuSinhVien().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TNCN_cmnd;
    private javax.swing.JLabel TNCN_email;
    private javax.swing.JLabel TNCN_mlc;
    private javax.swing.JLabel TNCN_msv;
    private javax.swing.JLabel TNCN_ns;
    private javax.swing.JLabel TNCN_qq;
    private javax.swing.JLabel TNCN_sdt;
    private javax.swing.JLabel TNCN_ten;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel khungPhai;
    private javax.swing.JPanel thongTinCaNhan;
    private javax.swing.JPanel thongTinLopChinh;
    private javax.swing.JLabel trai_lb_ten;
    // End of variables declaration//GEN-END:variables
}