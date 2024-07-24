/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import database.koneksi;
import entitas.ensuratmasuk;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class crudsuratmasuk {

    koneksi conn;
    Connection kon;
    Vector output;
    ResultSet rs;
    ensuratmasuk per = new ensuratmasuk();
    DefaultTableModel tb;

    public crudsuratmasuk() {
        conn = new koneksi();
        kon = conn.buatKoneksi();
    }

    Scanner in = new Scanner(System.in);
    Scanner inp = new Scanner(System.in);

    public byte[] frameLogoModel(ensuratmasuk per) throws SQLException {
        byte[] path = null;
        Statement stm = kon.createStatement();
        System.out.println(per.getNo());
        rs = stm.executeQuery("select gambar from masuk where no_surat = '" + per.getNo() + "'");
        while (rs.next()) {
            System.out.println("Masuk");
            path = rs.getBytes("gambar");
        }
        return path;
    }

    public DefaultTableModel cari(String by) {
        try {
            tb = new DefaultTableModel(new String[]{"Nomor Surat", "Tanggal Diterima", "Terima Dari", "Isi/Prihal", "Lampiran", "Keterangan"}, 0);
            Statement stm = (Statement) kon.createStatement();
            rs = stm.executeQuery("select * from masuk where no_surat like '%" + by + "%' or tanggal_terima like '%" + by + "%' or terima_dari like '%" + by + "%' or isi_prihal like '%" + by + "%' or lampiran like '%" + by + "%' or keterangan like '%" + by + "%'");
            while (rs.next()) {
                tb.addRow(new Object[]{
                    rs.getString("no_surat"),
                    rs.getString("tanggal_terima"),
                    rs.getString("terima_dari"),
                    rs.getString("isi_prihal"),
                    rs.getString("lampiran"),
                    rs.getString("keterangan"),});

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return tb;
    }

    public DefaultTableModel tampil() {
        try {
            tb = new DefaultTableModel(new String[]{"Nomor Surat", "Tanggal Diterima", "Terima Dari", "Isi/Prihal", "Lampiran", "Keterangan", "Gambar Surat"}, 0);
            Statement stm = (Statement) kon.createStatement();
            rs = stm.executeQuery("select * from masuk");
            while (rs.next()) {
                tb.addRow(new Object[]{
                    rs.getString("no_surat"),
                    rs.getString("tanggal_terima"),
                    rs.getString("terima_dari"),
                    rs.getString("isi_prihal"),
                    rs.getString("lampiran"),
                    rs.getString("keterangan"),
                    rs.getBytes("gambar"),});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return tb;
    }

    public int tambah(ensuratmasuk per) throws FileNotFoundException, SQLException {
        int hasil = 0;

        PreparedStatement ps = null;

        ps = kon.prepareCall("insert into masuk values('" + per.getNo() + "','" + per.getTgl() + "','" + per.getDari() + "','" + per.getIsi() + "','" + per.getLam() + "','" + per.getKet() + "',?)");
        System.out.println(per.getGbr());
        ps.setBinaryStream(1, per.getGbr());
        int result = ps.executeUpdate();

        return hasil;

    }
    
    

    public int cek(ensuratmasuk per) {
        int hasil = 0;
        try {
            Statement stm = (Statement) kon.createStatement();
            rs = stm.executeQuery("select no_surat from masuk where no_surat= '" + per.getNo() + "'");
            while (rs.next()) {
                hasil++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada : " + ex);
        }
        return hasil;
    }

    public int edit(ensuratmasuk per) throws SQLException {
        int hasil = 0;
        PreparedStatement ps = null;
        ps = kon.prepareCall("UPDATE masuk set no_surat = '" + per.getNo() + "' , tanggal_terima = '" + per.getTgl() + "', terima_dari = '" + per.getDari() + "' , isi_prihal = '" + per.getIsi() + "', lampiran = '" + per.getLam() + "', keterangan = '" + per.getKet() + "', gambar = ? where no_surat = '" + per.getNo() + "'");
        System.out.println(per.getGbr());
        ps.setBinaryStream(1, per.getGbr());
        int result = ps.executeUpdate();
        return hasil;
    }

    public int delete(ensuratmasuk per) throws SQLException {
        int hasil = 0;
        Statement stm = (Statement) kon.createStatement();
        hasil = stm.executeUpdate("delete from masuk where no_surat = '" + per.getNo() + "'");

        return hasil;
    }
}
