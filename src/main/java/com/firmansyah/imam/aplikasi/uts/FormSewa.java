/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firmansyah.imam.aplikasi.uts;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Imam Firmansyah
 */
public class FormSewa extends javax.swing.JFrame {

    /**
     * Creates new form FormSewa
     */
    public FormSewa() {
        initComponents();

        inputIdSewa.setEditable(false);
        inputNamaPelanggan.setEditable(false);
        inputAlamat.setEditable(false);
        inputNoIdentitas.setEditable(false);
        inputNoTelepon.setEditable(false);

        inputNamaKendaraan.setEditable(false);
        inputTahunKendaraan.setEditable(false);
        inputNoPolisi.setEditable(false);
        inputBiayaSewa.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNoSewa = new javax.swing.JLabel();
        inputIdSewa = new javax.swing.JTextField();
        labelIdPelanggan = new javax.swing.JLabel();
        inputIdPelanggan = new javax.swing.JComboBox<>();
        labelNamaPelanggan = new javax.swing.JLabel();
        inputNamaPelanggan = new javax.swing.JTextField();
        labelAlamat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputAlamat = new javax.swing.JTextArea();
        labelTanggalMulai = new javax.swing.JLabel();
        inputTanggalMulai = new com.toedter.calendar.JDateChooser();
        labelTanggalAkhir = new javax.swing.JLabel();
        inputTanggalAkhir = new com.toedter.calendar.JDateChooser();
        labelIdKendaraan = new javax.swing.JLabel();
        inputIdKendaraan = new javax.swing.JComboBox<>();
        inputNamaKendaraan = new javax.swing.JTextField();
        labelNamaKendaraan = new javax.swing.JLabel();
        inputNoPolisi = new javax.swing.JTextField();
        labelNoPolisi = new javax.swing.JLabel();
        inputTahunKendaraan = new javax.swing.JTextField();
        labelTahunKendaraan = new javax.swing.JLabel();
        inputBiayaSewa = new javax.swing.JTextField();
        labelSewa = new javax.swing.JLabel();
        btnSimpanTransaksi = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        inputNoTelepon = new javax.swing.JTextField();
        labelNoTelepon = new javax.swing.JLabel();
        inputNoIdentitas = new javax.swing.JTextField();
        labelNoIdentitas = new javax.swing.JLabel();
        btnFormKendaraan = new javax.swing.JButton();
        btnFormPelanggan = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSewa = new javax.swing.JTable();
        labelTransaksi = new javax.swing.JLabel();
        btnUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Sewa");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        labelNoSewa.setText("No. Sewa");

        labelIdPelanggan.setText("ID Pelanggan");

        inputIdPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdPelangganActionPerformed(evt);
            }
        });

        labelNamaPelanggan.setText("Nama Pelanggan");

        labelAlamat.setText("Alamat");

        inputAlamat.setColumns(20);
        inputAlamat.setRows(2);
        jScrollPane1.setViewportView(inputAlamat);

        labelTanggalMulai.setText("Tanggal Mulai");

        inputTanggalMulai.setDateFormatString("yyyy-MM-dd");

        labelTanggalAkhir.setText("Tanggal Akhir");

        inputTanggalAkhir.setDateFormatString("yyyy-MM-dd");

        labelIdKendaraan.setText("ID Kendaraan");

        inputIdKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdKendaraanActionPerformed(evt);
            }
        });

        labelNamaKendaraan.setText("Nama Kendaraan");

        labelNoPolisi.setText("No. Polisi");

        labelTahunKendaraan.setText("Tahun Kendaraan");

        labelSewa.setText("Biaya Sewa perhari");

        btnSimpanTransaksi.setText("Simpan Transaksi");
        btnSimpanTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanTransaksiActionPerformed(evt);
            }
        });

        labelNoTelepon.setText("No. Telp");

        labelNoIdentitas.setText("No. Identitas");

        btnFormKendaraan.setText("Form Kendaraan");
        btnFormKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormKendaraanActionPerformed(evt);
            }
        });

        btnFormPelanggan.setText("Form Pelanggan");
        btnFormPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormPelangganActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        tblSewa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "ID Transaksi", "Tanggal Sewa", "Status"
            }
        ));
        tblSewa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSewaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSewa);

        labelTransaksi.setText("Data Transaksi - Klik Untuk Melihat Detail Transaksi");

        btnUser.setText("Form User");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelAlamat)
                                    .addComponent(labelNamaPelanggan)
                                    .addComponent(labelIdPelanggan)
                                    .addComponent(labelNoSewa)
                                    .addComponent(labelNoTelepon)
                                    .addComponent(labelNoIdentitas))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(inputNoIdentitas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                        .addComponent(inputNoTelepon, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(inputNamaPelanggan, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputIdPelanggan, javax.swing.GroupLayout.Alignment.LEADING, 0, 195, Short.MAX_VALUE)
                                        .addComponent(inputIdSewa, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTanggalMulai)
                                    .addComponent(labelTanggalAkhir)
                                    .addComponent(labelIdKendaraan)
                                    .addComponent(labelNamaKendaraan)
                                    .addComponent(labelNoPolisi))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(inputTanggalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputTanggalMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(inputIdKendaraan, 0, 195, Short.MAX_VALUE)
                                            .addComponent(inputNamaKendaraan)
                                            .addComponent(inputNoPolisi))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelTahunKendaraan)
                                            .addComponent(labelSewa))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(inputTahunKendaraan, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(inputBiayaSewa))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTransaksi)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpanTransaksi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFormKendaraan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFormPelanggan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFormKendaraan, btnFormPelanggan, btnKeluar, btnUser});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNoSewa)
                            .addComponent(inputIdSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTransaksi)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputIdPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIdPelanggan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNamaPelanggan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAlamat)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNoTelepon))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputNoIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNoIdentitas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputTanggalMulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTanggalMulai))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputTanggalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTanggalAkhir))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelIdKendaraan)
                                    .addComponent(inputIdKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputNamaKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNamaKendaraan)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelTahunKendaraan)
                                    .addComponent(inputTahunKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputBiayaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelSewa))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNoPolisi)
                            .addComponent(inputNoPolisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanTransaksi)
                    .addComponent(btnFormKendaraan)
                    .addComponent(btnFormPelanggan)
                    .addComponent(btnKeluar)
                    .addComponent(btnUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1127, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        showDataSewa();

        try {
            getDataURL dataurl = new getDataURL();

            String url = Path.serverURL + "/sewa/pelanggan";

            String data = dataurl.getData(url);

            Object obj = JSONValue.parse(data);
            JSONArray dataArray = (JSONArray) obj;

            System.out.println("Banyak datanya : " + dataArray.size());

            inputIdPelanggan.removeAllItems();
            inputIdPelanggan.addItem("ID Pelanggan");

            for (int i = 0; i < dataArray.size(); i++) {
                JSONObject getData = (JSONObject) dataArray.get(i);

                inputIdPelanggan.addItem(getData.get("id").toString());

            }
        } catch (IOException ex) {
            Logger.getLogger(FormSewa.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            getDataURL dataurl = new getDataURL();

            String url = Path.serverURL + "/sewa/kendaraan";

            String data = dataurl.getData(url);

            Object obj = JSONValue.parse(data);
            JSONArray dataArray = (JSONArray) obj;

            System.out.println("Banyak datanya : " + dataArray.size());

            inputIdKendaraan.removeAllItems();
            inputIdKendaraan.addItem("ID Kendaraan");

            for (int i = 0; i < dataArray.size(); i++) {
                JSONObject getData = (JSONObject) dataArray.get(i);

                inputIdKendaraan.addItem(getData.get("id").toString());

            }
        } catch (IOException ex) {
            Logger.getLogger(FormSewa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void inputIdPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdPelangganActionPerformed
        String id_pelaggan = String.valueOf(inputIdPelanggan.getSelectedItem());

        if (id_pelaggan.equals("ID Pelanggan")) {
            id_pelaggan = "0";
        }

        System.out.println("ID Pelanggan yang di pilihan : " + id_pelaggan);

        try {
            getDataURL dataurl = new getDataURL();

            String url = Path.serverURL + "/pelanggan/show/" + id_pelaggan;

            String data = dataurl.getData(url);

            Object obj = JSONValue.parse(data);
            JSONArray dataArray = (JSONArray) obj;

            JSONObject getData = (JSONObject) dataArray.get(0);

            Object nama_pelanggan = getData.get("nama_pelanggan");
            Object alamat = getData.get("alamat");
            Object no_telp = getData.get("no_telp");
            Object no_identitas = getData.get("no_identitas");

            inputNamaPelanggan.setText((String) nama_pelanggan);
            inputAlamat.setText((String) alamat);
            inputNoTelepon.setText((String) no_telp);
            inputNoIdentitas.setText((String) no_identitas);

        } catch (IOException ex) {
            Logger.getLogger(FormSewa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inputIdPelangganActionPerformed

    private void btnFormKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormKendaraanActionPerformed
        this.dispose();

        // memanggil form login
        FormKendaraan callForm = new FormKendaraan();
        callForm.setLocationRelativeTo(null);
        callForm.setVisible(true);
    }//GEN-LAST:event_btnFormKendaraanActionPerformed

    private void inputIdKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdKendaraanActionPerformed
        String id_kendaraan = String.valueOf(inputIdKendaraan.getSelectedItem());

        if (id_kendaraan.equals("ID Kendaraan")) {
            id_kendaraan = "0";
        }

        System.out.println("ID Pelanggan yang di pilih : " + id_kendaraan);

        try {
            getDataURL dataurl = new getDataURL();

            String url = Path.serverURL + "/kendaraan/show/" + id_kendaraan;

            String data = dataurl.getData(url);

            Object obj = JSONValue.parse(data);
            JSONArray dataArray = (JSONArray) obj;

            JSONObject getData = (JSONObject) dataArray.get(0);

            Object no_polisi = getData.get("no_polisi");
            Object nama_kendaraan = getData.get("nama_kendaraan");
            Object tahun_kendaraan = getData.get("tahun_kendaraan");
            Object biaya_sewa = getData.get("biaya_sewa");

            inputNoPolisi.setText((String) no_polisi);
            inputNamaKendaraan.setText((String) nama_kendaraan);
            inputTahunKendaraan.setText((String) tahun_kendaraan);
            inputBiayaSewa.setText((String) biaya_sewa);

        } catch (IOException ex) {
            Logger.getLogger(FormSewa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inputIdKendaraanActionPerformed

    private void btnSimpanTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanTransaksiActionPerformed

        SimpleDateFormat ft = new SimpleDateFormat("YYYY-MM-dd");

        Date tgl_mulai = inputTanggalMulai.getDate();
        Date tgl_akhir = inputTanggalAkhir.getDate();
        String id_pelaggan = String.valueOf(inputIdPelanggan.getSelectedItem());
        String id_kendaraan = String.valueOf(inputIdKendaraan.getSelectedItem());

        int days = Days.daysBetween(new DateTime(tgl_mulai), new DateTime(tgl_akhir)).getDays();

        System.out.println("Days Between " + tgl_mulai + " : " + tgl_akhir + " - " + days);

        if (id_pelaggan.equals("ID Pelanggan")) {
            id_pelaggan = "";
        }

        if (id_kendaraan.equals("ID Kendaraan")) {
            id_kendaraan = " ";
        }

        if (tgl_mulai == null || tgl_akhir == null || id_pelaggan.isEmpty() || id_kendaraan.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong", "Informasi", JOptionPane.ERROR_MESSAGE);

        } else if (days <= 0) {

            JOptionPane.showMessageDialog(this, "Masukan Tanggal dengan Benar", "Informasi", JOptionPane.ERROR_MESSAGE);

        } else {

            String tanggal_mulai = ft.format(tgl_mulai);
            String tanggal_akhir = ft.format(tgl_akhir);

            String url = Path.serverURL + "/sewa/create/" + id_pelaggan + "/" + tanggal_mulai + "/" + tanggal_akhir + "/" + id_kendaraan;

            getDataURL dataurl = new getDataURL();

            try {

                String data = dataurl.getData(url);
                System.out.println(data);

                inputTanggalMulai.setDate(null);
                inputTanggalAkhir.setDate(null);
                JOptionPane.showMessageDialog(this, "Data Berhasil disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException ex) {

                Logger.getLogger(FormSewa.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }//GEN-LAST:event_btnSimpanTransaksiActionPerformed

    private void tblSewaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSewaMouseClicked
        int row = tblSewa.getSelectedRow();

        String tblSewaId = (tblSewa.getModel().getValueAt(row, 1).toString());
        System.out.println("ID Transaksi : " + tblSewaId);

        FormTransaksi callForm = new FormTransaksi();

        callForm.setLocationRelativeTo(null);

        try {
            callForm.detailTransaksi(tblSewaId);
        } catch (ParseException ex) {
            Logger.getLogger(FormSewa.class.getName()).log(Level.SEVERE, null, ex);
        }

        callForm.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_tblSewaMouseClicked

    private void btnFormPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormPelangganActionPerformed
        this.dispose();

        // memanggil form pelanggan
        FormPelanggan callForm = new FormPelanggan();
        callForm.setLocationRelativeTo(null);
        callForm.setVisible(true);
    }//GEN-LAST:event_btnFormPelangganActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult;
        dialogResult = JOptionPane.showConfirmDialog(this, "Anda Yakin Ingin Keluar? ", "Konfirmasi", dialogButton);
        if (dialogResult == 0) {
            System.out.println("Quit");
            this.dispose();
        } else {
            System.out.println("cancel");
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        this.dispose();

        // memanggil form login
        FormUser callForm = new FormUser();
        callForm.setLocationRelativeTo(null);
        callForm.setVisible(true);
    }//GEN-LAST:event_btnUserActionPerformed

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
            java.util.logging.Logger.getLogger(FormSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSewa().setVisible(true);
            }
        });
    }

    // function munculkan data sewa
    public void showDataSewa() {
        try {
            getDataURL dataurl = new getDataURL();
            DefaultTableModel model = (DefaultTableModel) tblSewa.getModel();

            model.setRowCount(0);

            String url = Path.serverURL + "/sewa/show";

            String data = dataurl.getData(url);

            Object obj = JSONValue.parse(data);
            JSONArray dataArray = (JSONArray) obj;

            System.out.println("Banyak datanya : " + dataArray.size());

            for (int i = 0; i < dataArray.size(); i++) {
                JSONObject getData = (JSONObject) dataArray.get(i);

                String cek_status = getData.get("status").toString();

                if (cek_status.equals("0")) {
                    cek_status = "Di Sewakan";
                } else {
                    cek_status = "Selesai";
                }

                Object[] row = {
                    i + 1,
                    getData.get("id"),
                    getData.get("tanggal_sewa"),
                    cek_status
                };

                model.addRow(row);
            }
        } catch (IOException ex) {
            Logger.getLogger(FormKendaraan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFormKendaraan;
    private javax.swing.JButton btnFormPelanggan;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JToggleButton btnSimpanTransaksi;
    private javax.swing.JButton btnUser;
    private javax.swing.JTextArea inputAlamat;
    private javax.swing.JTextField inputBiayaSewa;
    private javax.swing.JComboBox<String> inputIdKendaraan;
    private javax.swing.JComboBox<String> inputIdPelanggan;
    private javax.swing.JTextField inputIdSewa;
    private javax.swing.JTextField inputNamaKendaraan;
    private javax.swing.JTextField inputNamaPelanggan;
    private javax.swing.JTextField inputNoIdentitas;
    private javax.swing.JTextField inputNoPolisi;
    private javax.swing.JTextField inputNoTelepon;
    private javax.swing.JTextField inputTahunKendaraan;
    private com.toedter.calendar.JDateChooser inputTanggalAkhir;
    private com.toedter.calendar.JDateChooser inputTanggalMulai;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelIdKendaraan;
    private javax.swing.JLabel labelIdPelanggan;
    private javax.swing.JLabel labelNamaKendaraan;
    private javax.swing.JLabel labelNamaPelanggan;
    private javax.swing.JLabel labelNoIdentitas;
    private javax.swing.JLabel labelNoPolisi;
    private javax.swing.JLabel labelNoSewa;
    private javax.swing.JLabel labelNoTelepon;
    private javax.swing.JLabel labelSewa;
    private javax.swing.JLabel labelTahunKendaraan;
    private javax.swing.JLabel labelTanggalAkhir;
    private javax.swing.JLabel labelTanggalMulai;
    private javax.swing.JLabel labelTransaksi;
    private javax.swing.JTable tblSewa;
    // End of variables declaration//GEN-END:variables
}