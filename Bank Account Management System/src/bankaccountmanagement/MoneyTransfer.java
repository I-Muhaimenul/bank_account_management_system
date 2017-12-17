package bankaccountmanagement;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleTypes;

public class MoneyTransfer extends javax.swing.JFrame {

    Connection conn = null;
    String rcvaccount = null;
    String balance = null;
    OraclePreparedStatement pst = null;
    ResultSet rs = null;

    public MoneyTransfer() {
        initComponents();
    }

    public MoneyTransfer(String text, String amount) {
        initComponents();
        conn = JavaConnectDb.ConnecrDb();
        rcvaccount = text;
        balance = amount;
        setnull();
        info();
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        AmountText = new javax.swing.JTextField();
        ConfirmText = new javax.swing.JTextField();
        PassText = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("MONEY TRANSFER PANEL");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Receiver's Account Profile");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Account Number: ");

        jLabel4.setText("Name: ");

        jLabel5.setText("Mobile Number: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Money Transfer");

        jLabel10.setText("Amount: ");

        jLabel11.setText("Confirm Amount: ");

        jLabel12.setText("Password: ");

        jButton1.setText("Transfer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Transaction Details");

        jLabel14.setText("Transaction ID: ");

        jLabel15.setText("Amount: ");

        jLabel16.setText("Date: ");

        jLabel18.setText("jLabel18");

        jLabel19.setText("jLabel19");

        jLabel20.setText("jLabel20");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("Sender's Account Profile");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Account Number: ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("jLabel24");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Amount: ");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("jLabel26");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))))
                        .addComponent(jLabel9)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PassText, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addComponent(AmountText)
                                .addComponent(ConfirmText)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)))
                    .addComponent(jLabel22)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel25))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel24))))
                .addGap(99, 99, 99))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(AmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ConfirmText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(PassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
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
            UserChoice c = new UserChoice(UserChoice.account);
            c.setVisible(true);
            c.ViewProfile();

        } catch (SQLException ex) {
            Logger.getLogger(MoneyTransfer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String row = "DELETE FROM HASHTABLE";
            pst = (OraclePreparedStatement) conn.prepareStatement(row);
            pst.executeQuery();

            CallableStatement cstmt = conn.prepareCall("DECLARE\n "
                    + "pass varchar2(10);\n "
                    + "BEGIN\n "
                    + "SELECT PASSWORD INTO pass FROM ACCOUNT_INFO\n "
                    + "WHERE ACC_NO = ?;\n "
                    + "? := pass;\n "
                    + "END; ");
            cstmt.setString(1, UserChoice.account);
            cstmt.registerOutParameter(2, OracleTypes.VARCHAR);

            cstmt.execute();

            cstmt.getString(2);

            if (AmountText.getText().length() == 0 || ConfirmText.getText().length() == 0 || PassText.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Some fields are missing");
            } else if (!Objects.equals(Float.valueOf(AmountText.getText()), Float.valueOf(ConfirmText.getText()))) {
                JOptionPane.showMessageDialog(null, "Amount doesn't match");
            } else if (Float.valueOf(AmountText.getText()) > Float.valueOf(balance)) {
                JOptionPane.showMessageDialog(null, "Insufficient balance");
            } else if (Float.valueOf(AmountText.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Not a valid amount");
            } else if (!PassText.getText().equals(cstmt.getString(2))) {
                JOptionPane.showMessageDialog(null, "Wrong Password");
            } else if (Float.valueOf(AmountText.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid Amount");
            } else {

                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to transfer?", "Warning", dialogButton);

                if (JOptionPane.YES_OPTION == dialogResult) {
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:MM:ss");
                    Calendar cal = Calendar.getInstance();

                    String hash = UserChoice.account + AmountText.getText() + dateFormat.format(cal.getTime());

                    int code = hash.hashCode() & Integer.MAX_VALUE;

                    cstmt = conn.prepareCall("BEGIN "
                            + "INSERT INTO HASHTABLE VALUES (?,?,SYSDATE,?); "
                            + "END; ");

                    cstmt.setInt(1, Integer.valueOf(UserChoice.account));
                    cstmt.setFloat(2, Float.valueOf(AmountText.getText()));
                    cstmt.setInt(3, code);

                    cstmt.execute();

                    String input = JOptionPane.showInputDialog(null, "Enter the Code", "", JOptionPane.OK_OPTION);

                    if (input == null) {

                    } else if (input.length() == 0) {

                        JOptionPane.showMessageDialog(null, "Insert the Code first");
                    } else if (input.length() > 10) {
                        JOptionPane.showMessageDialog(null, "Code cannot be more than 10 digits");
                    } else {

                        cstmt = conn.prepareCall("BEGIN "
                                + "HASHCODEVERIFY(?,?); "
                                + "END;");

                        cstmt.setInt(1, Integer.parseInt(input));
                        cstmt.registerOutParameter(2, OracleTypes.NUMBER);
                        cstmt.execute();

                        if (cstmt.getInt(2) == 1) {

                            cstmt = conn.prepareCall("BEGIN "
                                    + "TRANSFER(?,?,?); "
                                    + "END;");
                            cstmt.setInt(1, Integer.valueOf(jLabel24.getText()));
                            cstmt.setInt(2, Integer.valueOf(jLabel6.getText()));
                            cstmt.setFloat(3, Float.valueOf(AmountText.getText()));
                            cstmt.execute();

                            String sql = "SELECT BALANCE FROM ACCOUNT WHERE ACC_NO = '" + jLabel24.getText() + "'";
                            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
                            rs = pst.executeQuery();
                            rs.next();
                            jLabel26.setText(String.valueOf(rs.getFloat(1)));

                            cstmt = conn.prepareCall("BEGIN\n"
                                    + "INSERT INTO TRANSACTION (ACC_NO,TRX_DATE,TRX_TIME,AMOUNT,TRX_TYPE,TRX_ACCOUNT)\n"
                                    + "VALUES (?, SYSDATE, TO_CHAR(SYSDATE, 'HH:MM:SS AM'), ?, 'TRANSFER(DEBIT)', ?);\n"
                                    + "INSERT INTO TRANSACTION (ACC_NO,TRX_DATE,TRX_TIME,AMOUNT,TRX_TYPE,TRX_ACCOUNT)\n"
                                    + "VALUES (?, SYSDATE, TO_CHAR(SYSDATE, 'HH:MM:SS AM'), ?, 'TRANSFER(CREDIT)', ?);\n"
                                    + "END;");

                            //Sender's Transaction ID
                            cstmt.setInt(1, Integer.valueOf(jLabel24.getText()));
                            cstmt.setFloat(2, Float.valueOf(AmountText.getText()));
                            cstmt.setInt(3, Integer.valueOf(jLabel6.getText()));

                            //Receiver's Transaction ID
                            cstmt.setInt(4, Integer.valueOf(jLabel6.getText()));
                            cstmt.setFloat(5, Float.valueOf(AmountText.getText()));
                            cstmt.setInt(6, Integer.valueOf(jLabel24.getText()));

                            cstmt.execute();

                            JOptionPane.showMessageDialog(null, "Money Successfully Transfered");
                            AmountText.setText(null);
                            ConfirmText.setText(null);
                            PassText.setText(null);

                            row = "DELETE FROM HASHTABLE";
                            pst = (OraclePreparedStatement) conn.prepareStatement(row);
                            pst.executeQuery();

                            CallableStatement cstmt3 = conn.prepareCall(""
                                    + "DECLARE\n"
                                    + "TRX NUMBER;\n"
                                    + "TDATE DATE;\n"
                                    + "TAMOUNT NUMBER;\n"
                                    + "BEGIN\n"
                                    + "SELECT MAX(TRX_ID) INTO TRX FROM TRANSACTION\n"
                                    + "WHERE TRX_TYPE = 'TRANSFER(DEBIT)' AND ACC_NO = ?;\n"
                                    + "SELECT AMOUNT, TRX_DATE INTO TAMOUNT, TDATE FROM TRANSACTION\n"
                                    + "WHERE TRX_ID = TRX;\n"
                                    + "? := TRX;\n"
                                    + "? := TAMOUNT;\n"
                                    + "? := TDATE;\n"
                                    + "END;");

                            cstmt3.setInt(1, Integer.valueOf(jLabel24.getText()));
                            cstmt3.registerOutParameter(2, OracleTypes.NUMBER);
                            cstmt3.registerOutParameter(3, OracleTypes.NUMBER);
                            cstmt3.registerOutParameter(4, OracleTypes.DATE);
                            cstmt3.execute();

                            jLabel18.setText(String.valueOf(cstmt3.getInt(2)));
                            jLabel19.setText(String.valueOf(cstmt3.getFloat(3)));
                            jLabel20.setText(String.valueOf(new SimpleDateFormat("dd-MMMM-yyyy ").format(cstmt3.getDate(4))));

                        } else if (cstmt.getInt(2) == 0) {
                            JOptionPane.showMessageDialog(null, "Not a Valid Code");
                        }
                    }
                }
            }

        } catch (SQLException | HeadlessException | NumberFormatException | NullPointerException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoneyTransfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountText;
    private javax.swing.JTextField ConfirmText;
    private javax.swing.JPasswordField PassText;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void setnull() {
        jLabel6.setText(null);
        jLabel7.setText(null);
        jLabel8.setText(null);
        jLabel18.setText(null);
        jLabel19.setText(null);
        jLabel20.setText(null);
        //jLabel21.setText(null);
        jLabel24.setText(UserChoice.account);
        jLabel26.setText(balance);
    }

    private void info() {
        try {
            CallableStatement cstmt = conn.prepareCall("DECLARE\n"
                    + "TNAME VARCHAR2(20);\n"
                    + "TMOBILE VARCHAR2(11);\n"
                    + "BEGIN \n"
                    + "SELECT NAME, MOBILE INTO TNAME, TMOBILE FROM ACCOUNT_INFO\n"
                    + "WHERE ACC_NO = ?;\n"
                    + "? := TNAME;\n"
                    + "? := TMOBILE;\n"
                    + "END;");

            cstmt.setInt(1, Integer.valueOf(rcvaccount));
            cstmt.registerOutParameter(2, OracleTypes.VARCHAR);
            cstmt.registerOutParameter(3, OracleTypes.VARCHAR);

            cstmt.execute();
            jLabel6.setText(rcvaccount);
            jLabel7.setText(cstmt.getString(2));
            jLabel8.setText(cstmt.getString(3));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
