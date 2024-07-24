/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import database.koneksi;
import entitas.enpetugas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class crudpetugas {
    koneksi conn;
    Connection kon;
    Vector output;
    ResultSet rs;
    enpetugas per = new enpetugas();
    DefaultTableModel tb;
        
    Scanner in = new Scanner(System.in);
    Scanner inp = new Scanner(System.in);
        
    public crudpetugas(){
        conn = new koneksi();
        kon = conn.buatKoneksi();
    }
    
    public DefaultTableModel tampil(){
        try {
            tb = new DefaultTableModel(new String[]{"Nama","Username","Password","Status"},0);
            Statement stm = (Statement) kon.createStatement();
            rs = stm.executeQuery("select * from pengguna");
            while (rs.next()) {
                tb.addRow(new Object[]{
                    rs.getString("nama"),
                    rs.getString("username"),
                    rs.getString("passw"),
                    rs.getString("statusp"),
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return tb;
    }
    public DefaultTableModel cari(String by) {
        try {
            tb = new DefaultTableModel(new String[]{"Nama","Username","Password","Status"}, 0);
            Statement stm = (Statement) kon.createStatement();
            rs = stm.executeQuery("select * from pengguna where nama like '%" + by + "%' or username like '%" + by + "%' or passw like '%" + by + "%' or statusp like '%" + by + "%' ");
            while (rs.next()) {
                tb.addRow(new Object[]{
                    rs.getString("nama"),
                    rs.getString("username"),
                    rs.getString("passw"),
                    rs.getString("statusp"),
                });

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return tb;
    }
    public int tambah(enpetugas per){
            int hasil = 0;
            try {
                Statement stm = (Statement) kon.createStatement();
                hasil = stm.executeUpdate("insert into pengguna values('" + per.getNama()+ "','" + per.getUsername()+ "','" + per.getPassword()+ "','" + per.getStatus()+ "')");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada : " + ex);
            }
            return hasil;
    }
    
    public int edit(enpetugas per){
        int hasil = 0;
        try {
            Statement stm = (Statement) kon.createStatement();
            hasil = stm.executeUpdate("UPDATE pengguna set nama= '"+ per.getNama()+"',username= '"+ per.getUsername()+"' , passw= '"+ per.getPassword()+"',statusp= '"+ per.getUsername()+"' where nama= '"+ per.getNama()+"'");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada : " + ex);
        }
        return hasil;    
    }
    
    public int delete(enpetugas per){
        int hasil = 0;
        try {
            Statement stm = kon.createStatement();
            hasil = stm.executeUpdate("delete from pengguna where nama = '"+ per.getNama()+"'");
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada : " + ex);
        }
        return hasil;

    }
    
    public int cek(enpetugas per){
        int hasil = 0;
         try {
                Statement stm = (Statement) kon.createStatement();
                rs = stm.executeQuery("select * from pengguna where nama= '"+ per.getNama()+"'") ;
                while(rs.next()){
                    hasil++;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada : " + ex);
            }
            return hasil;
    }
    public void jumluser() throws SQLException{
        conn = new koneksi();
        kon = conn.buatKoneksi();
        
        String sql = "SELECT COUNT(nama) as total FROM pengguna";
        PreparedStatement pst = kon.prepareStatement(sql);
        rs = pst.executeQuery(sql);
        rs.next();
        
    }
}
