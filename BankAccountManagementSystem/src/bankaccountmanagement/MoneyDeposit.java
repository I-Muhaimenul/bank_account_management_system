package bankaccountmanagement;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import oracle.jdbc.OracleTypes;

public class MoneyDeposit extends javax.swing.JFrame {

    String account = null;
    public static String admin_name = null;
    public static String admin_username = null;
    Connection conn = null;

    public MoneyDeposit() {
        initComponents();
    }

    public MoneyDeposit(String acc_number) {
        initComponents();
        conn = JavaConnectDb.ConnecrDb();
        account = acc_number;
        initialize();
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    private void initialize() {
        jLabel3.setText(null);
        jLabel5.setText(null);
        jLabel7.setText(null);
        jLabel20.setText(null);
        jLabel21.setText(null);
        jLabel23.setText(null);

        try {
            CallableStatement cstmt = conn.prepareCall("BEGIN \n"
                    + "SELECT ACC_NO, TYPE, BALANCE INTO ?,?,? FROM ACCOUNT \n"
                    + "WHERE ACC_NO = ?; \n"
                    + "END;");
            cstmt.registerOutParameter(1, OracleTypes.NUMBER);
            cstmt.registerOutParameter(2, OracleTypes.VARCHAR);
            cstmt.registerOutParameter(3, OracleTypes.NUMBER);
            cstmt.setInt(4, Integer.valueOf(account));

            cstmt.execute();

            jLabel3.setText(cstmt.getString(1));
            jLabel5.setText(cstmt.getString(2));
            jLabel7.setText(String.valueOf(cstmt.getFloat(3)));
            jLabel14.setText(admin_name);
            jLabel15.setText(admin_username);

        } catch (SQLException ex) {
            Logger.getLogger(MoneyDeposit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DepositText = new javax.swing.JTextField();
        ConfirmText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("MONEY DEPOSIT PANEL");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Account Number: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Account Type: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Current Balance: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("jLabel7");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Deposit Amount:");

        jLabel9.setText("Confirm Amount: ");

        jButton1.setText("Deposit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("ACCOUNT'S INFORMATION");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("DEPOSIT SECTION");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Admin's Name: ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Admin's Username: ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("jLabel14");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("jLabel15");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("TRANSACTION DETAILS");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Transaction ID:");

        jLabel18.setText("Deposited Amount: ");

        jLabel19.setText("Transaction Date: ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("jLabel20");

        jLabel21.setText("jLabel21");

        jLabel23.setText("jLabel23");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel23)))
                                    .addComponent(jLabel16))
                                .addGap(172, 172, 172)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ConfirmText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel14)
                                            .addComponent(DepositText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel14)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DepositText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConfirmText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel16))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            conn.close();
            close();
            AccountProfile a = new AccountProfile(account);
            a.setVisible(true);
            a.ViewProfile();
        } catch (SQLException ex) {
            Logger.getLogger(MoneyDeposit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int checker = 1;

        if (DepositText.getText().length() == 0 || ConfirmText.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Some fields are missing");
        } else if (!Objects.equals(Float.valueOf(DepositText.getText()), Float.valueOf(ConfirmText.getText()))) {
            JOptionPane.showMessageDialog(null, "Amount doesn't match");
        } else if (Float.valueOf(DepositText.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "Not a valid amount");
        } else {
            try {
                JPasswordField pwd = new JPasswordField(10);
                JOptionPane.showConfirmDialog(null, pwd, "Enter Admin's Password", JOptionPane.OK_CANCEL_OPTION);
                String pass = pwd.getText();

                CallableStatement cstmt = conn.prepareCall("BEGIN\n"
                        + "SELECT USERNAME INTO ? FROM LOGIN\n"
                        + "WHERE USERNAME = ? AND PASSWORD = ?;\n"
                        + "END; ");
                cstmt.registerOutParameter(1, OracleTypes.VARCHAR);
                cstmt.setString(2, jLabel15.getText());
                cstmt.setString(3, pass);

                cstmt.execute();

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Wrong Password");
                checker = 0;
            }
            if (checker == 1) {
                try {
                    CallableStatement cstmt = conn.prepareCall("BEGIN \n"
                            + "? := DEPOSIT(?,?); \n"
                            + "END;");
                    cstmt.registerOutParameter(1, OracleTypes.NUMBER);
                    cstmt.setInt(2, Integer.valueOf(jLabel3.getText()));
                    cstmt.setFloat(3, Float.valueOf(DepositText.getText()));
                    cstmt.execute();

                    CallableStatement cstmt2 = conn.prepareCall("BEGIN \n"
                            + "UPDATE ACCOUNT SET BALANCE = ? WHERE ACC_NO = ?; \n"
                            + "INSERT INTO TRANSACTION(ACC_NO, TRX_DATE, TRX_TIME, AMOUNT, TRX_TYPE) "
                            + "VALUES(?, SYSDATE, TO_CHAR(SYSDATE, 'HH:MM:SS AM'), ?, 'DEPOSIT'); \n"
                            + "END;");
                    cstmt2.setFloat(1, cstmt.getFloat(1));
                    cstmt2.setInt(2, Integer.valueOf(jLabel3.getText()));
                    cstmt2.setInt(3, Integer.valueOf(jLabel3.getText()));
                    cstmt2.setFloat(4, Float.valueOf(DepositText.getText()));
                    cstmt2.execute();

                    JOptionPane.showMessageDialog(null, "Money Successfully Deposited");
                    jLabel7.setText(String.valueOf(cstmt.getFloat(1)));

                    CallableStatement cstmt3 = conn.prepareCall(""
                            + "DECLARE\n"
                            + "TRX NUMBER;\n"
                            + "TDATE DATE;\n"
                            + "TAMOUNT NUMBER;\n"
                            + "BEGIN\n"
                            + "SELECT MAX(TRX_ID) INTO TRX FROM TRANSACTION\n"
                            + "WHERE TRX_TYPE = 'DEPOSIT' AND ACC_NO = ?;\n"
                            + "SELECT AMOUNT, TRX_DATE INTO TAMOUNT, TDATE FROM TRANSACTION\n"
                            + "WHERE TRX_ID = TRX;\n"
                            + "? := TRX;\n"
                            + "? := TAMOUNT;\n"
                            + "? := TDATE;\n"
                            + "END;");

                    cstmt3.setInt(1, Integer.valueOf(jLabel3.getText()));
                    cstmt3.registerOutParameter(2, OracleTypes.NUMBER);
                    cstmt3.registerOutParameter(3, OracleTypes.NUMBER);
                    cstmt3.registerOutParameter(4, OracleTypes.DATE);
                    cstmt3.execute();

                    jLabel20.setText(String.valueOf(cstmt3.getInt(2)));
                    jLabel21.setText(String.valueOf(cstmt3.getFloat(3)));
                    jLabel23.setText(String.valueOf(new SimpleDateFormat("dd-MMMM-yyyy ").format(cstmt3.getDate(4))));

                    DepositText.setText(null);
                    ConfirmText.setText(null);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoneyDeposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConfirmText;
    private javax.swing.JTextField DepositText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
