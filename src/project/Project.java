/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import java.util.Scanner;
import javax.swing.SwingUtilities;
import view.login;

/**
 *
 * @author ASUS
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                login loginForm = new login();
                loginForm.setVisible(true);
                loginForm.setLocationRelativeTo(null);
            }
        });
    }
    
}
