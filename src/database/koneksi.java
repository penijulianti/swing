/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
public class koneksi {
    public Connection kon;
    public Connection buatKoneksi (){
        if (kon == null) {
            try {
                String db = "jdbc:mysql://localhost/surat";
                String user = "root";
                String password ="";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                kon = (Connection) DriverManager.getConnection(db,user,password);
            System.out.println("Koneksi Berhasil");
            } catch (Exception e) {
            System.out.println("Koneksi Gagal");
            }
        }
        return kon;
        }
}
