/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.QuanTri;

/**
 *
 * @author DELL
 */
public class ViewQuanTri extends javax.swing.JPanel {

    /**
     * Creates new form viewQuanTr
     */
    public ViewQuanTri() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        cotTrai = new javax.swing.JPanel();
        panel_chucNang_quanTri = new javax.swing.JPanel();
        b_quanLySinhVien = new javax.swing.JButton();
        b_quanLyGiaoVien = new javax.swing.JButton();
        b_quanLyMonHoc = new javax.swing.JButton();
        b_quanLyLopMonHoc = new javax.swing.JButton();
        b_quanLyLopChinh = new javax.swing.JButton();
        b_quanLyKhoa = new javax.swing.JButton();
        b_quanLyNganh = new javax.swing.JButton();
        cotPhai = new javax.swing.JPanel();
        UC_qlsv = new javax.swing.JPanel();
        data_UC_qlsv = new javax.swing.JScrollPane();
        table_UC_qlsv = new javax.swing.JTable();
        thaoTac_UC_quanLySinhVien = new javax.swing.JPanel();
        lb_hoTen = new javax.swing.JLabel();
        lb_gioiTinh = new javax.swing.JLabel();
        lb_queQuan = new javax.swing.JLabel();
        lb_ngaySinh = new javax.swing.JLabel();
        lb_soDienThoai = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        lb_cmnd = new javax.swing.JLabel();
        lb_lopChinh = new javax.swing.JLabel();
        tf_hoTen = new javax.swing.JTextField();
        cb_gioiTinh = new javax.swing.JComboBox<>();
        tf_queQuan = new javax.swing.JTextField();
        tf_soDienThoai = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        tf_cmnd = new javax.swing.JTextField();
        cb_lopChinh = new javax.swing.JComboBox<>();
        cb_ngay = new javax.swing.JComboBox<>();
        cb_thang = new javax.swing.JComboBox<>();
        tf_nam = new javax.swing.JTextField();
        b_themSinhVien = new javax.swing.JButton();
        b_xoaSinhVien = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cotTrai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panel_chucNang_quanTri.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panel_chucNang_quanTri.setLayout(new java.awt.GridBagLayout());

        b_quanLySinhVien.setText("Quản lý sinh viên");
        b_quanLySinhVien.setMargin(new java.awt.Insets(2, 0, 2, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        panel_chucNang_quanTri.add(b_quanLySinhVien, gridBagConstraints);

        b_quanLyGiaoVien.setText("quản lý giáo viên");
        b_quanLyGiaoVien.setMargin(new java.awt.Insets(2, 0, 2, 14));
        b_quanLyGiaoVien.setMaximumSize(null);
        b_quanLyGiaoVien.setMinimumSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        panel_chucNang_quanTri.add(b_quanLyGiaoVien, gridBagConstraints);

        b_quanLyMonHoc.setText("quản lý môn học");
        b_quanLyMonHoc.setMargin(new java.awt.Insets(2, 0, 2, 14));
        b_quanLyMonHoc.setMaximumSize(null);
        b_quanLyMonHoc.setMinimumSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        panel_chucNang_quanTri.add(b_quanLyMonHoc, gridBagConstraints);

        b_quanLyLopMonHoc.setText("quản lý lớp môn học");
        b_quanLyLopMonHoc.setMargin(new java.awt.Insets(2, 0, 2, 14));
        b_quanLyLopMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_quanLyLopMonHocActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        panel_chucNang_quanTri.add(b_quanLyLopMonHoc, gridBagConstraints);

        b_quanLyLopChinh.setText("quản lý lớp chính");
        b_quanLyLopChinh.setMargin(new java.awt.Insets(2, 0, 2, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        panel_chucNang_quanTri.add(b_quanLyLopChinh, gridBagConstraints);

        b_quanLyKhoa.setText("Quản lý khoa");
        b_quanLyKhoa.setMargin(new java.awt.Insets(2, 0, 2, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        panel_chucNang_quanTri.add(b_quanLyKhoa, gridBagConstraints);

        b_quanLyNganh.setText("Quản lý ngành");
        b_quanLyNganh.setMargin(new java.awt.Insets(2, 0, 2, 14));
        b_quanLyNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_quanLyNganhActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        panel_chucNang_quanTri.add(b_quanLyNganh, gridBagConstraints);

        cotTrai.add(panel_chucNang_quanTri);

        cotPhai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cotPhai.setLayout(new java.awt.GridLayout());

        UC_qlsv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UC_qlsv.setLayout(new java.awt.BorderLayout());

        table_UC_qlsv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Sv001", "Trần Đức Huy", "Nam", "21/09/2003", "Hà Nội", "0336361384", "vlsvhuy@gmail.com", "123456789123", null}
            },
            new String [] {
                "Mã Sinh Viên", "Họ tên", "Giới tính", "Ngày sinh", "Quê quán", "Số điện thoại", "Email", "Cmnd", "Lớp Chính"
            }
        ));
        data_UC_qlsv.setViewportView(table_UC_qlsv);
        if (table_UC_qlsv.getColumnModel().getColumnCount() > 0) {
            table_UC_qlsv.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        UC_qlsv.add(data_UC_qlsv, java.awt.BorderLayout.PAGE_START);

        thaoTac_UC_quanLySinhVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 2));

        lb_hoTen.setText("Họ tên");

        lb_gioiTinh.setText("Giới tính");

        lb_queQuan.setText("Quê quán");

        lb_ngaySinh.setText("Ngày sinh (d/m/y)");

        lb_soDienThoai.setText("Số điện thoại");

        lb_email.setText("Email");

        lb_cmnd.setText("Cmnd");

        lb_lopChinh.setText("Lớp chính");

        tf_hoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hoTenActionPerformed(evt);
            }
        });

        cb_gioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cb_gioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_gioiTinhActionPerformed(evt);
            }
        });

        tf_queQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_queQuanActionPerformed(evt);
            }
        });

        cb_lopChinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cb_ngay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cb_thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        cb_thang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_thangActionPerformed(evt);
            }
        });

        tf_nam.setText("2000");
        tf_nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_namActionPerformed(evt);
            }
        });

        b_themSinhVien.setText("Thêm sinh viên");
        b_themSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_themSinhVienActionPerformed(evt);
            }
        });

        b_xoaSinhVien.setText("Xóa Sinh viên");

        javax.swing.GroupLayout thaoTac_UC_quanLySinhVienLayout = new javax.swing.GroupLayout(thaoTac_UC_quanLySinhVien);
        thaoTac_UC_quanLySinhVien.setLayout(thaoTac_UC_quanLySinhVienLayout);
        thaoTac_UC_quanLySinhVienLayout.setHorizontalGroup(
            thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thaoTac_UC_quanLySinhVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_hoTen)
                    .addComponent(lb_soDienThoai)
                    .addGroup(thaoTac_UC_quanLySinhVienLayout.createSequentialGroup()
                        .addGroup(thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_ngaySinh)
                            .addComponent(lb_cmnd))
                        .addGap(18, 18, 18)
                        .addGroup(thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(thaoTac_UC_quanLySinhVienLayout.createSequentialGroup()
                                    .addComponent(cb_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cb_thang, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tf_soDienThoai)
                                .addComponent(tf_cmnd)
                                .addComponent(tf_hoTen))
                            .addGroup(thaoTac_UC_quanLySinhVienLayout.createSequentialGroup()
                                .addComponent(b_themSinhVien)
                                .addGap(18, 18, 18)
                                .addComponent(b_xoaSinhVien)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thaoTac_UC_quanLySinhVienLayout.createSequentialGroup()
                        .addGroup(thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_gioiTinh)
                            .addComponent(lb_queQuan)
                            .addComponent(lb_email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_email)
                            .addComponent(tf_queQuan)
                            .addComponent(cb_gioiTinh, 0, 157, Short.MAX_VALUE)))
                    .addGroup(thaoTac_UC_quanLySinhVienLayout.createSequentialGroup()
                        .addComponent(lb_lopChinh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_lopChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        thaoTac_UC_quanLySinhVienLayout.setVerticalGroup(
            thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thaoTac_UC_quanLySinhVienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_hoTen)
                    .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_gioiTinh)
                    .addComponent(cb_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_ngaySinh)
                    .addGroup(thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(cb_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_queQuan)
                        .addComponent(tf_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_soDienThoai)
                    .addComponent(tf_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_email)
                        .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_cmnd)
                    .addGroup(thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_cmnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_lopChinh)
                        .addComponent(cb_lopChinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(thaoTac_UC_quanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_themSinhVien)
                    .addComponent(b_xoaSinhVien))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UC_qlsv.add(thaoTac_UC_quanLySinhVien, java.awt.BorderLayout.CENTER);

        cotPhai.add(UC_qlsv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cotTrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cotPhai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cotPhai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cotTrai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_quanLyLopMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_quanLyLopMonHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_quanLyLopMonHocActionPerformed

    private void b_quanLyNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_quanLyNganhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_quanLyNganhActionPerformed

    private void tf_hoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_hoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_hoTenActionPerformed

    private void cb_gioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_gioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_gioiTinhActionPerformed

    private void tf_queQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_queQuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_queQuanActionPerformed

    private void cb_thangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_thangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_thangActionPerformed

    private void tf_namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_namActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_namActionPerformed

    private void b_themSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_themSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_themSinhVienActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UC_qlsv;
    private javax.swing.JButton b_quanLyGiaoVien;
    private javax.swing.JButton b_quanLyKhoa;
    private javax.swing.JButton b_quanLyLopChinh;
    private javax.swing.JButton b_quanLyLopMonHoc;
    private javax.swing.JButton b_quanLyMonHoc;
    private javax.swing.JButton b_quanLyNganh;
    private javax.swing.JButton b_quanLySinhVien;
    private javax.swing.JButton b_themSinhVien;
    private javax.swing.JButton b_xoaSinhVien;
    private javax.swing.JComboBox<String> cb_gioiTinh;
    private javax.swing.JComboBox<String> cb_lopChinh;
    private javax.swing.JComboBox<String> cb_ngay;
    private javax.swing.JComboBox<String> cb_thang;
    private javax.swing.JPanel cotPhai;
    private javax.swing.JPanel cotTrai;
    private javax.swing.JScrollPane data_UC_qlsv;
    private javax.swing.JLabel lb_cmnd;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_gioiTinh;
    private javax.swing.JLabel lb_hoTen;
    private javax.swing.JLabel lb_lopChinh;
    private javax.swing.JLabel lb_ngaySinh;
    private javax.swing.JLabel lb_queQuan;
    private javax.swing.JLabel lb_soDienThoai;
    private javax.swing.JPanel panel_chucNang_quanTri;
    private javax.swing.JTable table_UC_qlsv;
    private javax.swing.JTextField tf_cmnd;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_hoTen;
    private javax.swing.JTextField tf_nam;
    private javax.swing.JTextField tf_queQuan;
    private javax.swing.JTextField tf_soDienThoai;
    private javax.swing.JPanel thaoTac_UC_quanLySinhVien;
    // End of variables declaration//GEN-END:variables
}
