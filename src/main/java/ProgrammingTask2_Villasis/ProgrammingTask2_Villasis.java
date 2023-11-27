/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ProgrammingTask2_Villasis;

import Forms.MainForm;
import Forms.SplashScreen;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander
 */
public class ProgrammingTask2_Villasis {

    public static void main(String[] args) {
        //Open SplashScreen
        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                sp.getLoadingValue(i);

                if (i == 10) {
                    sp.getLoading("Gathering Informations...");
                }
                if (i == 20) {
                    sp.getLoading("Loading Informations...");
                }
                if (i == 50) {
                    sp.getLoading("Connecting to Database...");
                }
                if (i == 70) {
                    sp.getLoading("Connection Successful!");
                }
                if (i == 80) {
                    sp.getLoading("Launching LTO Queueing System...");
                }
                sp.getLoadingBar(i);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //Close Splashscreen
        sp.dispose();
        
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //Open Main Form
        MainForm mainform = new MainForm();
        mainform.setLocationRelativeTo(null);
        mainform.setVisible(true);
    }
}
