/*
 * ReservierungErfassenDIA.java
 *
 * Created on 31. Mai 2005, 11:49
 */

package GUI;
import javax.swing.*;
import FK.*;

public class ReservierungErfassenDIA extends javax.swing.JDialog {
    
    /** Creates new form ReservierungErfassenDIA */
    public ReservierungErfassenDIA(java.awt.Frame parent, boolean modal, String knr) {
        super(parent, modal);
        initComponents();
        kundeNrText.setText(knr);
        this.setSize(500, 300);
        this.setVisible(true); 
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        objektlNrLabel = new javax.swing.JLabel();
        objektNRText = new javax.swing.JTextField();
        datumVon = new javax.swing.JLabel();
        vonDatumTagText = new javax.swing.JTextField();
        vonDatumMonatText = new javax.swing.JTextField();
        vonDatumJahrText = new javax.swing.JTextField();
        datumBis = new javax.swing.JLabel();
        bisDatumTagText = new javax.swing.JTextField();
        bisDatumMonatText = new javax.swing.JTextField();
        bisDatumJahrText = new javax.swing.JTextField();
        kundeNrLabel = new javax.swing.JLabel();
        kundeNrText = new javax.swing.JTextField();
        ReservierungLabel = new javax.swing.JLabel();
        abbrechenBTN = new javax.swing.JButton();
        okBTN = new javax.swing.JButton();

        getContentPane().setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        objektlNrLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        objektlNrLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        objektlNrLabel.setText("Objekt-Nr:");
        getContentPane().add(objektlNrLabel);
        objektlNrLabel.setBounds(40, 40, 100, 15);

        objektNRText.setFont(new java.awt.Font("Tahoma", 0, 12));
        getContentPane().add(objektNRText);
        objektNRText.setBounds(160, 40, 60, 20);

        datumVon.setFont(new java.awt.Font("Tahoma", 0, 12));
        datumVon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        datumVon.setText("von:");
        getContentPane().add(datumVon);
        datumVon.setBounds(50, 110, 90, 14);

        vonDatumTagText.setFont(new java.awt.Font("Tahoma", 0, 12));
        getContentPane().add(vonDatumTagText);
        vonDatumTagText.setBounds(160, 110, 30, 20);

        vonDatumMonatText.setFont(new java.awt.Font("Tahoma", 0, 12));
        getContentPane().add(vonDatumMonatText);
        vonDatumMonatText.setBounds(190, 110, 30, 20);

        vonDatumJahrText.setFont(new java.awt.Font("Tahoma", 0, 12));
        getContentPane().add(vonDatumJahrText);
        vonDatumJahrText.setBounds(220, 110, 40, 20);

        datumBis.setFont(new java.awt.Font("Tahoma", 0, 12));
        datumBis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        datumBis.setText("bis:");
        getContentPane().add(datumBis);
        datumBis.setBounds(50, 140, 90, 14);

        bisDatumTagText.setFont(new java.awt.Font("Tahoma", 0, 12));
        getContentPane().add(bisDatumTagText);
        bisDatumTagText.setBounds(160, 140, 30, 20);

        bisDatumMonatText.setFont(new java.awt.Font("Tahoma", 0, 12));
        getContentPane().add(bisDatumMonatText);
        bisDatumMonatText.setBounds(190, 140, 30, 20);

        bisDatumJahrText.setFont(new java.awt.Font("Tahoma", 0, 12));
        getContentPane().add(bisDatumJahrText);
        bisDatumJahrText.setBounds(220, 140, 40, 20);

        kundeNrLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        kundeNrLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kundeNrLabel.setText("Kundennummer:");
        getContentPane().add(kundeNrLabel);
        kundeNrLabel.setBounds(40, 80, 100, 15);

        kundeNrText.setFont(new java.awt.Font("Tahoma", 0, 12));
        getContentPane().add(kundeNrText);
        kundeNrText.setBounds(160, 80, 60, 20);

        ReservierungLabel.setFont(new java.awt.Font("Tahoma", 1, 18));
        ReservierungLabel.setText("Reservierung");
        getContentPane().add(ReservierungLabel);
        ReservierungLabel.setBounds(10, 0, 140, 30);

        abbrechenBTN.setFont(new java.awt.Font("Tahoma", 0, 12));
        abbrechenBTN.setText("Abbrechen");
        abbrechenBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abbrechenBTNActionPerformed(evt);
            }
        });

        getContentPane().add(abbrechenBTN);
        abbrechenBTN.setBounds(110, 190, 110, 23);

        okBTN.setFont(new java.awt.Font("Tahoma", 0, 12));
        okBTN.setText("OK");
        okBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBTNActionPerformed(evt);
            }
        });

        getContentPane().add(okBTN);
        okBTN.setBounds(300, 190, 110, 23);

        pack();
    }
    // </editor-fold>//GEN-END:initComponents

    private void okBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBTNActionPerformed
        int objektNr = Integer.parseInt(objektNRText.getText());
        int kundenNr = Integer.parseInt(kundeNrText.getText());
//        String mieteVon = vonDatumTagText.getText()+"."+vonDatumMonatText.getText()+"."+vonDatumJahrText.getText();
//        String mieteBis = bisDatumTagText.getText()+"."+bisDatumMonatText.getText()+"."+bisDatumJahrText.getText();
        String mieteVon = vonDatumTagText.getText() + "-" + vonDatumTagText.getText() + "-" + vonDatumTagText.getText();
        String mieteBis = bisDatumJahrText.getText() + "-" + bisDatumJahrText.getText() + "-" +bisDatumJahrText.getText();
        
        Reservierung eineReservierung = new Reservierung(objektNr, kundenNr, mieteVon, mieteBis);
        
        int rnr = eineReservierung.Speichern();
        if(rnr>0)
        {
            JOptionPane.showMessageDialog(this, "Reservierung wurde erfolgreich mit der ReservierungsNr. "+rnr+" angelegt", "OK", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();  
        }
        else if(rnr==-2)
        {
           JOptionPane.showMessageDialog(this, "Reservierung konnte nicht angelegt werden. \nIn diesem Buchungszeitruam liegt schon eine Buchung f�r dieses Objekt vor.", "Error", JOptionPane.ERROR_MESSAGE);  
        }
        else
        {
           JOptionPane.showMessageDialog(this, "Reservierung konnte nicht angelegt werden. \nBitte kontrollieren Sie die eingegebenden Daten", "Error", JOptionPane.ERROR_MESSAGE); 
        }  
    }//GEN-LAST:event_okBTNActionPerformed

    private void abbrechenBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abbrechenBTNActionPerformed
        this.dispose();  
    }//GEN-LAST:event_abbrechenBTNActionPerformed
    
    public void setKnr(String knr)
    {
        kundeNrText.setText(knr);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ReservierungLabel;
    private javax.swing.JButton abbrechenBTN;
    private javax.swing.JTextField bisDatumJahrText;
    private javax.swing.JTextField bisDatumMonatText;
    private javax.swing.JTextField bisDatumTagText;
    private javax.swing.JLabel datumBis;
    private javax.swing.JLabel datumVon;
    private javax.swing.JLabel kundeNrLabel;
    private javax.swing.JTextField kundeNrText;
    private javax.swing.JTextField objektNRText;
    private javax.swing.JLabel objektlNrLabel;
    private javax.swing.JButton okBTN;
    private javax.swing.JTextField vonDatumJahrText;
    private javax.swing.JTextField vonDatumMonatText;
    private javax.swing.JTextField vonDatumTagText;
    // End of variables declaration//GEN-END:variables
    
}
