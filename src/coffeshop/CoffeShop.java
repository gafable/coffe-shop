/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeshop;

import javax.swing.JOptionPane;
import services.DbConnection;
import views.auth.Login;

/**
 *
 * @author 1styrGroupA
 */
public class CoffeShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "hello world!");
        new  DbConnection().connect();
        new Login().setVisible(true);
    }
    
}
