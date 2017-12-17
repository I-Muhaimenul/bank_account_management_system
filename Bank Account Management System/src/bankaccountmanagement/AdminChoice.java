package bankaccountmanagement;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleTypes;

public class AdminChoice extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    OraclePreparedStatement pst = null;

    public AdminChoice() {
        initComponents();
        conn = JavaConnectDb.ConnecrDb();
        DeleteTableView();
        GroupButton1();
        GroupButton2();
        Setnull();
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    private void GroupButton1() {
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(jRadioButton1);
        bg1.add(jRadioButton2);

    }

    private void GroupButton2() {
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(RadioDeposit);
        bg2.add(RadioTransaction);
    }

    private void Update_Table() {

        try {
            CallableStatement cstmt = conn.prepareCall("BEGIN "
                    + "? :=all_accounts(); "
                    + "END; ");
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute();

            rs = (ResultSet) cstmt.getObject(1);

            ViewTable.setModel(DbUtils.resultSetToTableModel(rs));

            ViewTable.setEnabled(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void DeleteTableView() {
        jLabel21.setText(null);
        jLabel22.setText(null);
        jLabel23.setText(null);
        jLabel24.setText(null);
        try {
            CallableStatement cstmt = conn.prepareCall("BEGIN "
                    + "? :=all_accounts(); "
                    + "END; ");
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute();

            rs = (ResultSet) cstmt.getObject(1);

            RemoveTable.setModel(DbUtils.resultSetToTableModel(rs));

            RemoveTable.setEnabled(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        AccountText1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        NameText2 = new javax.swing.JTextField();
        PermanentText2 = new javax.swing.JTextField();
        MobileText2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ComboType = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        UsernameText2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PasswordText2 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        ConfirmText2 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        InitialText2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        PresentText2 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        AccountText3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        RemoveTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        AccountText4 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        NameText4 = new javax.swing.JTextField();
        CellText4 = new javax.swing.JTextField();
        PresentText4 = new javax.swing.JTextField();
        PermanentText4 = new javax.swing.JTextField();
        UsernameText4 = new javax.swing.JTextField();
        PasswordText4 = new javax.swing.JPasswordField();
        ConfirmText4 = new javax.swing.JPasswordField();
        jButton11 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TrxTable = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        RadioDeposit = new javax.swing.JRadioButton();
        RadioTransaction = new javax.swing.JRadioButton();
        jLabel54 = new javax.swing.JLabel();
        AccountText5 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ACC_NO", "NAME", "USERNAME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ViewTable);

        jLabel1.setText("Account Number: ");

        jButton1.setText("View Account's Profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("View All Accounts");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel14.setText("ACCOUNT'S INFORMATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addComponent(jButton2)))
                        .addComponent(jButton3)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(AccountText1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel14)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AccountText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("View Account", jPanel1);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("CREATE AN ACCOUNT");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("User's Personal Information");

        jLabel4.setText("Name: ");

        jLabel5.setText("Cell Number: ");

        jLabel6.setText("Present Address: ");

        jLabel7.setText("Permanent Address: ");

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("User Account's Information");

        jLabel9.setText("Account Type: ");

        ComboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CURRENT", "SAVINGS" }));
        ComboType.setSelectedIndex(-1);
        ComboType.setToolTipText("");

        jLabel10.setText("Username: ");

        jLabel11.setText("Password: ");

        jLabel12.setText("Confirm Password: ");

        jLabel13.setText("Initial Deposit: ");

        jButton5.setText("Add Account");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel42.setText("Gender: ");

        jRadioButton1.setText("Male");

        jRadioButton2.setText("Female");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel42))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PermanentText2)
                                        .addComponent(MobileText2)
                                        .addComponent(NameText2)
                                        .addComponent(PresentText2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2))))
                        .addGap(155, 155, 155)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ComboType, 0, 100, Short.MAX_VALUE)
                                            .addComponent(UsernameText2)
                                            .addComponent(PasswordText2)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ConfirmText2)
                                            .addComponent(InitialText2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton5)))
                                .addGap(93, 93, 93))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(ComboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NameText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(UsernameText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(MobileText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(PasswordText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(ConfirmText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PresentText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PermanentText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(InitialText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jRadioButton1)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Create Account", jPanel2);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("ACCOUNT REMOVAL");

        jLabel16.setText("Account Number: ");

        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Account Number: ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Account Type: ");

        jLabel19.setText("Name: ");

        jLabel20.setText("Cell Number: ");

        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("jLabel21");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("jLabel22");

        jLabel23.setText("jLabel23");

        jLabel24.setText("jLabel24");

        jButton8.setText("Remove");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        RemoveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ACC_NO", "NAME", "USERNAME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(RemoveTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(AccountText3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton8)
                                    .addComponent(jButton6))))
                        .addGap(31, 31, 31)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(AccountText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel24))
                        .addGap(34, 34, 34)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Remove Account", jPanel3);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("ACCOUNT'S INFORMATION UPDATE ");

        jLabel26.setText("Account Number: ");

        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setText("Current Information");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Account Number: ");

        jLabel29.setText("Name: ");

        jLabel30.setText("Cell Number: ");

        jLabel31.setText("Present Address: ");

        jLabel32.setText("Permanent Address: ");

        jButton10.setText("Back");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel33.setText("Username: ");

        jLabel34.setText("Password: ");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("jLabel35");

        jLabel36.setText("jLabel36");

        jLabel37.setText("jLabel37");

        jLabel38.setText("jLabel38");

        jLabel39.setText("jLabel39");

        jLabel40.setText("jLabel40");

        jLabel41.setText("jLabel41");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel43.setText("Update Information");

        jLabel44.setText("Name: ");

        jLabel45.setText("Cell Number: ");

        jLabel46.setText("Present Address: ");

        jLabel47.setText("Permanent Address: ");

        jLabel48.setText("Username: ");

        jLabel49.setText("Password: ");

        jLabel50.setText("Confirm Password: ");

        jButton11.setText("Update ");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel27))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AccountText4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton9)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel34)
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel32)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel29)
                                            .addComponent(jLabel28))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel35)
                                            .addComponent(jLabel36)
                                            .addComponent(jLabel38)
                                            .addComponent(jLabel39)
                                            .addComponent(jLabel40)
                                            .addComponent(jLabel41)
                                            .addComponent(jLabel37))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel43)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel44)
                                                .addComponent(jLabel45)
                                                .addComponent(jLabel46)
                                                .addComponent(jLabel47)
                                                .addComponent(jLabel48))
                                            .addGap(40, 40, 40)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(NameText4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                .addComponent(CellText4)
                                                .addComponent(UsernameText4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(PermanentText4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(PresentText4, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel50)
                                                .addComponent(jLabel49))
                                            .addGap(48, 48, 48)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(PasswordText4)
                                                .addComponent(ConfirmText4))))
                                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(68, 68, 68))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(AccountText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel44)
                    .addComponent(NameText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel35)
                    .addComponent(jLabel45)
                    .addComponent(CellText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel36)
                    .addComponent(jLabel46)
                    .addComponent(PresentText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel37)
                    .addComponent(jLabel47)
                    .addComponent(PermanentText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel38)
                    .addComponent(jLabel48)
                    .addComponent(UsernameText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel39)
                    .addComponent(jLabel49)
                    .addComponent(PasswordText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel40)
                    .addComponent(jLabel50)
                    .addComponent(ConfirmText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel41)
                    .addComponent(jButton11))
                .addGap(13, 13, 13)
                .addComponent(jButton10)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Update Information", jPanel4);

        TrxTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TRX_ID", "TRX_DATE", "TRX_TIME", "AMOUNT", "TRX_TYPE", "TRX_ACCOUNT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TrxTable);

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel51.setText("MONEY DEPOSIT & ");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel53.setText("TRANSACTION HISTORY");

        jLabel52.setText("Type: ");

        jButton12.setText("Back");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        RadioDeposit.setText("Money Deposit");

        RadioTransaction.setText("Transaction History");

        jLabel54.setText("Account Number: ");

        jButton13.setText("View");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(jLabel51))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel53)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel52)
                                        .addGap(85, 85, 85)
                                        .addComponent(RadioDeposit))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(RadioTransaction))
                                    .addComponent(jLabel54)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AccountText5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(RadioDeposit))
                .addGap(4, 4, 4)
                .addComponent(RadioTransaction)
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountText5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Money Deposit & Transaction History", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            conn.close();
            close();
            Choice c = new Choice();
            c.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AdminChoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Update_Table();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            CallableStatement cstmt = conn.prepareCall("BEGIN \n"
                    + "? := ACCOUNTEXIST(?); \n"
                    + "END;");

            cstmt.registerOutParameter(1, OracleTypes.NUMBER);
            cstmt.setString(2, AccountText1.getText());

            cstmt.execute();

            int check = cstmt.getInt(1);

            if (check == 1) {
                conn.close();
                close();
                AccountProfile a = new AccountProfile(AccountText1.getText());
                a.setVisible(true);
                a.ViewProfile();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Account Number");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            conn.close();
            close();
            Choice c = new Choice();
            c.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AdminChoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int check = 0;
        String s = NameText2.getText();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                check = 1;
            }
        }

        try {
            if (check == 1 || NameText2.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter a valid name");
            } else if (MobileText2.getText().length() != 11) {
                JOptionPane.showMessageDialog(null, "Not a valid mobile number");
            } else if (PresentText2.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Present Address is not valid");
            } else if (PermanentText2.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Permanent Address is not valid");
            } else if (jRadioButton1.isSelected() == false && jRadioButton2.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Gender not selected");
            } else if (ComboType.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(null, "Please select account type");
            } else if (UsernameText2.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please enter an username");
            } else if (PasswordText2.getText().length() == 0 && ConfirmText2.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please enter the password");
            } else if (PasswordText2.getText().length() < 4 || ConfirmText2.getText().length() < 4) {
                JOptionPane.showMessageDialog(null, "Password must be at least 4 characters");
            } else if (!PasswordText2.getText().equals(ConfirmText2.getText())) {
                JOptionPane.showMessageDialog(null, "Password doesn't match");
            } else if (InitialText2.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please enter the deposit amount");
            } else if (Float.valueOf(InitialText2.getText()) < 500.00) {
                JOptionPane.showMessageDialog(null, "Initial deposit amount must be 500 or more");
            } else {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to add the account?", "Warning", dialogButton);
                if (JOptionPane.YES_OPTION == dialogResult) {

                    CallableStatement cstmt = conn.prepareCall(
                            "DECLARE\n"
                            + "ID NUMBER;\n"
                            + "BEGIN\n"
                            + "INSERT INTO ACCOUNT(BALANCE,TYPE,ACC_OPEN) VALUES (?,?,SYSDATE);\n"
                            + "SELECT MAX(ACC_NO) INTO ID FROM ACCOUNT;\n"
                            + "INSERT INTO ACCOUNT_INFO VALUES(ID,?,?,?,?,?,?,?);\n"
                            + "END;");

                    cstmt.setString(1, InitialText2.getText());
                    cstmt.setString(2, ComboType.getSelectedItem().toString());
                    cstmt.setString(3, NameText2.getText().toUpperCase());
                    cstmt.setString(4, MobileText2.getText());
                    cstmt.setString(5, PresentText2.getText().toUpperCase());
                    cstmt.setString(6, PermanentText2.getText().toUpperCase());
                    cstmt.setString(7, UsernameText2.getText());
                    cstmt.setString(8, PasswordText2.getText());
                    if (jRadioButton1.isSelected()) {
                        cstmt.setString(9, "MALE");
                    } else if (jRadioButton2.isSelected()) {
                        cstmt.setString(9, "FEMALE");
                    }

                    cstmt.execute();

                    String sql = "SELECT MAX(ACC_NO) FROM ACCOUNT";
                    pst = (OraclePreparedStatement) conn.prepareStatement(sql);
                    rs = pst.executeQuery();

                    rs.next();

                    JOptionPane.showMessageDialog(null, "Account Added\n Account Number: '" + rs.getInt(1) + "'");

                    sql = "INSERT INTO TRANSACTION (ACC_NO,TRX_DATE,TRX_TIME,AMOUNT,TRX_TYPE) "
                            + "VALUES('" + rs.getInt(1) + "', SYSDATE, TO_CHAR(SYSDATE, 'HH:MM:SS AM'), '" + Float.valueOf(InitialText2.getText()) + "', "
                            + "'DEPOSIT')";
                    pst = (OraclePreparedStatement) conn.prepareStatement(sql);
                    pst.executeQuery();

                    conn.close();
                    close();
                    AdminChoice c = new AdminChoice();
                    c.setVisible(true);
                }
            }
        } catch (NumberFormatException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            conn.close();
            close();
            Choice c = new Choice();
            c.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AdminChoice.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try {

            CallableStatement cstmt = conn.prepareCall("BEGIN \n"
                    + "? := search_account(?); \n"
                    + "END; \n");

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setInt(2, Integer.valueOf(AccountText3.getText()));

            cstmt.execute();

            rs = (ResultSet) cstmt.getObject(1);

            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "Invalid Account Number");
            } else {
                rs.next();
                jLabel21.setText(rs.getString("acc_no"));
                jLabel22.setText(rs.getString("type"));
                jLabel23.setText(rs.getString("name"));
                jLabel24.setText(rs.getString("mobile"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Account Number");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        if (jLabel21.getText() == null || jLabel22.getText() == null) {
            JOptionPane.showMessageDialog(null, "Search for an account first");
        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove?", "Warning", dialogButton);

            if (JOptionPane.YES_OPTION == dialogResult) {
                try {
                    CallableStatement cstmt = conn.prepareCall("BEGIN "
                            + "DELETE FROM ACCOUNT WHERE ACC_NO = ?; "
                            + "END; ");
                    cstmt.setInt(1, Integer.valueOf(jLabel21.getText()));
                    cstmt.execute();
                    JOptionPane.showMessageDialog(null, "Account Successfully Deleted");
                    DeleteTableView();
                } catch (SQLException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            conn.close();
            close();
            Choice c = new Choice();
            c.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AdminChoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (AccountText4.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Search for an Account first");
        } else if (NameText4.getText().length() == 0 || CellText4.getText().length() == 0 || PresentText4.getText().length() == 0
                || PermanentText4.getText().length() == 0 || UsernameText4.getText().length() == 0 || PasswordText4.getText().length() == 0
                || ConfirmText4.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Some fields are missing");
        } else if (PasswordText4.getText().length() < 4 || ConfirmText4.getText().length() < 4) {
            JOptionPane.showMessageDialog(null, "Password must be atleast 4 characters");
        } else if (!PasswordText4.getText().equals(ConfirmText4.getText())) {
            JOptionPane.showMessageDialog(null, "Password doesn't match");
        } else if (CellText4.getText().length() != 11) {
            JOptionPane.showMessageDialog(null, "Mobile Number must be 11 digits");
        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "Warning", dialogButton);
            if (JOptionPane.YES_OPTION == dialogResult) {
                try {
                    CallableStatement cstmt = conn.prepareCall("BEGIN "
                            + "UPDATE ACCOUNT_INFO SET ACCOUNT_INFO.NAME = ?, ACCOUNT_INFO.MOBILE = ?, ACCOUNT_INFO.PRESENT_ADDRESS = ?, \n"
                            + "ACCOUNT_INFO.PERMANENT_ADDRESS = ?, ACCOUNT_INFO.USERNAME = ?, ACCOUNT_INFO.PASSWORD = ? "
                            + "WHERE ACCOUNT_INFO.ACC_NO = ?; "
                            + "END;");
                    cstmt.setString(1, NameText4.getText().toUpperCase());
                    cstmt.setString(2, CellText4.getText());
                    cstmt.setString(3, PresentText4.getText().toUpperCase());
                    cstmt.setString(4, PermanentText4.getText().toUpperCase());
                    cstmt.setString(5, UsernameText4.getText());
                    cstmt.setString(6, PasswordText4.getText());
                    cstmt.setInt(7, Integer.valueOf(jLabel35.getText()));

                    cstmt.execute();

                    JOptionPane.showMessageDialog(null, "Account's Information successfully Updated");

                    CallableStatement cstmt2 = conn.prepareCall("BEGIN \n"
                            + "? := search_account(?); \n"
                            + "END; \n");

                    cstmt2.registerOutParameter(1, OracleTypes.CURSOR);
                    cstmt2.setInt(2, Integer.valueOf(jLabel35.getText()));

                    cstmt2.execute();

                    rs = (ResultSet) cstmt2.getObject(1);

                    rs.next();
                    jLabel35.setText(rs.getString("acc_no"));
                    jLabel36.setText(rs.getString("name"));
                    jLabel37.setText(rs.getString("mobile"));
                    jLabel38.setText(rs.getString("present_address"));
                    jLabel39.setText(rs.getString("permanent_address"));
                    jLabel40.setText(rs.getString("username"));
                    jLabel41.setText(rs.getString("password"));

                    NameText4.setText(null);
                    CellText4.setText(null);
                    PresentText4.setText(null);
                    PermanentText4.setText(null);
                    UsernameText4.setText(null);
                    PasswordText4.setText(null);
                    ConfirmText4.setText(null);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            CallableStatement cstmt = conn.prepareCall("BEGIN \n"
                    + "? := search_account(?); \n"
                    + "END; \n");

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setInt(2, Integer.valueOf(AccountText4.getText()));

            cstmt.execute();

            rs = (ResultSet) cstmt.getObject(1);

            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "Invalid Account Number");
            } else {
                rs.next();
                jLabel35.setText(rs.getString("acc_no"));
                jLabel36.setText(rs.getString("name"));
                jLabel37.setText(rs.getString("mobile"));
                jLabel38.setText(rs.getString("present_address"));
                jLabel39.setText(rs.getString("permanent_address"));
                jLabel40.setText(rs.getString("username"));
                jLabel41.setText(rs.getString("password"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            conn.close();
            close();
            Choice c = new Choice();
            c.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AdminChoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        if (RadioDeposit.isSelected() == false && RadioTransaction.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Select the type");
        } else if (AccountText5.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the account number");
        } else if (RadioDeposit.isSelected()) {
            try {
                String test = "SELECT ACC_NO FROM ACCOUNT WHERE ACC_NO = '" + AccountText5.getText() + "'";
                pst = (OraclePreparedStatement) conn.prepareStatement(test);
                rs = pst.executeQuery();
                if (rs.next()) {
                    conn.close();
                    close();
                    AccountProfile a = new AccountProfile(AccountText5.getText());
                    a.setVisible(true);
                    a.ViewProfile();
                } else {
                    JOptionPane.showMessageDialog(null, "Not a Valid Account Number");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminChoice.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (RadioTransaction.isSelected()) {
            try {
                String test = "SELECT ACC_NO FROM TRANSACTION WHERE ACC_NO = '" + AccountText5.getText() + "'";
                pst = (OraclePreparedStatement) conn.prepareStatement(test);
                rs = pst.executeQuery();
                if (rs.next()) {

                    CallableStatement cstmt = conn.prepareCall("BEGIN "
                            + "? :=all_transaction(?); "
                            + "END; ");
                    cstmt.registerOutParameter(1, OracleTypes.CURSOR);
                    cstmt.setInt(2, Integer.valueOf(AccountText5.getText()));
                    cstmt.execute();

                    rs = (ResultSet) cstmt.getObject(1);

                    TrxTable.setModel(DbUtils.resultSetToTableModel(rs));

                    TrxTable.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "No Transaction History for this Account");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

    }//GEN-LAST:event_jButton13ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminChoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountText1;
    private javax.swing.JTextField AccountText3;
    private javax.swing.JTextField AccountText4;
    private javax.swing.JTextField AccountText5;
    private javax.swing.JTextField CellText4;
    private javax.swing.JComboBox<String> ComboType;
    private javax.swing.JPasswordField ConfirmText2;
    private javax.swing.JPasswordField ConfirmText4;
    private javax.swing.JTextField InitialText2;
    private javax.swing.JTextField MobileText2;
    private javax.swing.JTextField NameText2;
    private javax.swing.JTextField NameText4;
    private javax.swing.JPasswordField PasswordText2;
    private javax.swing.JPasswordField PasswordText4;
    private javax.swing.JTextField PermanentText2;
    private javax.swing.JTextField PermanentText4;
    private javax.swing.JTextField PresentText2;
    private javax.swing.JTextField PresentText4;
    private javax.swing.JRadioButton RadioDeposit;
    private javax.swing.JRadioButton RadioTransaction;
    private javax.swing.JTable RemoveTable;
    private javax.swing.JTable TrxTable;
    private javax.swing.JTextField UsernameText2;
    private javax.swing.JTextField UsernameText4;
    private javax.swing.JTable ViewTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void Setnull() {
        jLabel35.setText(null);
        jLabel36.setText(null);
        jLabel37.setText(null);
        jLabel38.setText(null);
        jLabel39.setText(null);
        jLabel40.setText(null);
        jLabel41.setText(null);
    }
}
