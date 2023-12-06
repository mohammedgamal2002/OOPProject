package oopproject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterScreen extends JFrame {
    private javax.swing.JTextField UsernameField;
    private javax.swing.JPasswordField ConfirmPasswordField;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel registerScreen;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPasswordField PasswordField;
    public RegisterScreen(){
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 500));

        initUI();
        addLabels();
        addFields();
        addDate();
        addButtons();
        addRegisterListeners();
        showRegistrationScreen();
    }
    public void initUI(){
        registerScreen = new javax.swing.JPanel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        registerScreen.setBackground(new java.awt.Color(255, 255, 255));
        registerScreen.setLayout(null);
        registerScreen.setSize(400,400);
        registerScreen.validate();
        //registerScreen.setBounds(0,0,500,500);

        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        FirstNameField = new javax.swing.JTextField();
        LastNameField = new javax.swing.JTextField();
        UserNameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        EmailField = new javax.swing.JTextField();

        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        jLabel19 = new javax.swing.JLabel();
        ConfirmPasswordField = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
    }

    public void addLabels(){
        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("First name :");
        registerScreen.add(jLabel11);
        jLabel11.setBounds(346, 96, 61, 16);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Last Name :");
        registerScreen.add(jLabel12);
        jLabel12.setBounds(350, 140, 62, 16);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("UserNameField :");
        registerScreen.add(jLabel13);
        jLabel13.setBounds(323, 184, 86, 16);

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Date Of Birth :");
        registerScreen.add(jLabel14);
        jLabel14.setBounds(334, 236, 75, 16);

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Email :");
        registerScreen.add(jLabel15);
        jLabel15.setBounds(387, 280, 35, 16);

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Password :");
        registerScreen.add(jLabel16);
        jLabel16.setBounds(366, 330, 56, 16);

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Register Frame");
        registerScreen.add(jLabel17);
        jLabel17.setBounds(387, 19, 175, 33);


        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Already have account ?");
        registerScreen.add(jLabel18);
        jLabel18.setBounds(430, 477, 150, 16);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Confirm Password :");
        registerScreen.add(jLabel19);
        jLabel19.setBounds(319, 371, 102, 16);

        ConfirmPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        registerScreen.add(ConfirmPasswordField);
        ConfirmPasswordField.setBounds(452, 368, 169, 22);

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive - Al Azhar University\\Desktop\\3386851.jpg")); // NOI18N
        jLabel20.setText("jLabel10");
        registerScreen.add(jLabel20);
        jLabel20.setBounds(0, 0, 920, 540);
    }
    public void addFields(){
        FirstNameField.setBackground(new java.awt.Color(255, 255, 255));
        FirstNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerScreen.add(FirstNameField);
        FirstNameField.setBounds(447, 93, 169, 26);

        LastNameField.setBackground(new java.awt.Color(255, 255, 255));
        LastNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerScreen.add(LastNameField);
        LastNameField.setBounds(452, 137, 168, 26);

        UserNameField.setBackground(new java.awt.Color(255, 255, 255));
        UserNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerScreen.add(UserNameField);
        UserNameField.setBounds(452, 181, 169, 26);

        PasswordField.setBackground(new java.awt.Color(255, 255, 255));
        PasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerScreen.add(PasswordField);
        PasswordField.setBounds(452, 324, 169, 26);

        EmailField.setBackground(new java.awt.Color(255, 255, 255));
        EmailField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerScreen.add(EmailField);
        EmailField.setBounds(452, 280, 169, 26);
    }
    private void addDate(){
        jList1.setBackground(new java.awt.Color(255, 255, 255));
        jList1.setForeground(new java.awt.Color(0, 0, 0));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};

            public int getSize() {
                return days.length;
            }

            public String getElementAt(int i) {
                return days[i];
            }
        });
        jScrollPane3.setViewportView(jList1);

        registerScreen.add(jScrollPane3);
        jScrollPane3.setBounds(452, 236, 36, 26);
        jList2.setBackground(new java.awt.Color(255, 255, 255));
        jList2.setForeground(new java.awt.Color(0, 0, 0));
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

            public int getSize() {
                return months.length;
            }

            public String getElementAt(int i) {
                return months[i];
            }
        });
        jScrollPane4.setViewportView(jList2);

        registerScreen.add(jScrollPane4);
        jScrollPane4.setBounds(494, 236, 81, 24);

        jList3.setBackground(new java.awt.Color(255, 255, 255));
        jList3.setForeground(new java.awt.Color(0, 0, 0));
        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] years = {"2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971"};

            public int getSize() {
                return years.length;
            }

            public String getElementAt(int i) {
                return years[i];
            }
        });

        jScrollPane5.setViewportView(jList3);
        registerScreen.add(jScrollPane5);
        jScrollPane5.setBounds(581, 236, 48, 24);

    }
    private void addButtons(){
        registerButton.setBackground(new java.awt.Color(153, 153, 255));
        registerButton.setForeground(new java.awt.Color(0, 0, 0));
        registerButton.setText("Register");

        registerScreen.add(registerButton);
        registerButton.setBounds(365, 408, 256, 23);
    }
    
    private void addRegisterListeners(){
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User user = register("", "ahmed","123","","");
                LoginScreen.userList.add(user);
                registerScreen.setVisible(true);
                LoginScreen loginScreen = new LoginScreen();

            }
        });
        
    }
    public void showRegistrationScreen() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(registerScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(registerScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        this.setVisible(true);

    }


    public User register(String email, String username , String password, String firstName, String lastName){
        User user = new User(username, password);
        return user;
    }

}
