/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import database.koneksi;
import entitas.ensuratkeluar;
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
public class crudsuratkeluar {

    koneksi conn;
    Connection kon;
    Vector output;
    ResultSet rs;
    ensuratkeluar per = new ensuratkeluar();
    DefaultTableModel tb;

    public crudsuratkeluar() {
        conn = new koneksi();
        kon = conn.buatKoneksi();
    }

    Scanner in = new Scanner(System.in);
    Scanner inp = new Scanner(System.in);

    public byte[] frameLogoModel(ensuratkeluar per) throws SQLException {
        byte[] path = null;
        Statement stm = kon.createStatement();
        System.out.println(per.getNo());
        rs = stm.executeQuery("select gambar from keluar where no_surat = '" + per.getNo() + "'");
        while (rs.next()) {
            System.out.println("Masuk");
            path = rs.getBytes("gambar");
        }
        return path;
    }

    public DefaultTableModel cari(String by) {
        try {
            tb = new DefaultTableModel(new String[]{"Nomor Surat", "Tanggal Kirim","Isi/Prihal", "Tujuan", "Lampiran", "Gambar Surat"}, 0);
            Statement stm = (Statement) kon.createStatement();
            rs = stm.executeQuery("select * from keluar where no_surat like '%" + by + "%' or tanggal like '%" + by + "%' or isi_prihal like '%" + by + "%' or tujuan like '%" + by + "%' or lampiran like '%" + by + "%' ");
            while (rs.next()) {
                tb.addRow(new Object[]{
                    rs.getString("no_surat"),
                    rs.getString("tanggal"),
                    rs.getString("isi_prihal"),
                    rs.getString("tujuan"),
                    rs.getString("lampiran"),
                    rs.getBytes("gambar"),});

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return tb;
    }

    public DefaultTableModel tampil() {
        try {
            tb = new DefaultTableModel(new String[]{"Nomor Surat", "Tanggal Kirim","Isi/Prihal", "Tujuan", "Lampiran", "Gambar Surat"}, 0);
            Statement stm = (Statement) kon.createStatement();
            rs = stm.executeQuery("select * from keluar");
            while (rs.next()) {
                tb.addRow(new Object[]{
                    rs.getString("no_surat"),
                    rs.getString("tanggal"),
                    rs.getString("isi_prihal"),
                    rs.getString("tujuan"),
                    rs.getString("lampiran"),
                    rs.getBytes("gambar"),});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return tb;
    }

    public int tambah(ensuratkeluar per) throws FileNotFoundException, SQLException {
        int hasil = 0;
        PreparedStatement ps = null;

        ps = kon.prepareCall("insert into keluar values('" + per.getNo() + "','" + per.getTgl() + "','" + per.getIsi() + "','" + per.getTujuan() + "','" + per.getLam() + "',?)");
        System.out.println(per.getGbr());
        ps.setBinaryStream(1, per.getGbr());
        int result = ps.executeUpdate();

        return hasil;

    }


    public int edit(ensuratkeluar per) throws SQLException {
        int hasil = 0;
        PreparedStatement ps = null;
        ps = kon.prepareCall("UPDATE keluar set no_surat = '" + per.getNo() + "' , tanggal= '" + per.getTgl() + "', isi_prihal = '" + per.getIsi() + "', tujuan = '" + per.getTujuan() + "', lampiran = '" + per.getLam() + "', gambar = ? where no_surat = '" + per.getNo() + "'");
        System.out.println(per.getGbr());
        ps.setBinaryStream(1, per.getGbr());
        int result = ps.executeUpdate();
        
        return hasil;
        
    }

    public int delete(ensuratkeluar per) throws SQLException {
        int hasil = 0;
        Statement stm = (Statement) kon.createStatement();
        hasil = stm.executeUpdate("delete from keluar where no_surat = '" + per.getNo() + "'");

        return hasil;
    }
    
    public int cek(ensuratkeluar per) {
        int hasil = 0;
        try {
            Statement stm = (Statement) kon.createStatement();
            rs = stm.executeQuery("select no_surat from keluar where no_surat= '" + per.getNo() + "'");
            while (rs.next()) {
                hasil++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada : " + ex);
        }
        return hasil;
    }
}
