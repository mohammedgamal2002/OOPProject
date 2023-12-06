package oopproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Scanner;

/**
 * @author PC
 */
public class LoginScreen extends JFrame {

    static Scanner input = new Scanner(System.in);
    static public ArrayList<User> userList = new ArrayList<>();
    private javax.swing.JButton loginButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;


    public LoginScreen() {
        showLoginScreen();
    }
    
    private void init() {
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
    }

    private void setElementsProperties() {
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 500));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/note-taking (2).png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(98, 23, 128, 128);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Welcome To");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(34, 196, 134, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Our Pad");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(138, 1192, 115, 32);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Your Pad_App");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(128, 245, 148, 32);

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Log In Frame");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(470, 50, 290, 43);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Username :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(420, 220, 80, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Password :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(420, 260, 80, 20);

        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("if you dont have an account ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 420, 160, 16);

        registerButton.setBackground(new java.awt.Color(204, 204, 204));
        registerButton.setForeground(new java.awt.Color(0, 0, 0));
        registerButton.setText("Register");

        jPanel1.add(registerButton);
        registerButton.setBounds(460, 420, 120, 23);

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(usernameField);
        usernameField.setBounds(500, 220, 250, 22);

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
//        passwordField.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                PasswordFieldActionPerformed(evt);
//            }
//        });
        jPanel1.add(passwordField);
        passwordField.setBounds(500, 260, 250, 22);

        loginButton.setBackground(new java.awt.Color(204, 204, 204));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("Log In");
        jPanel1.add(loginButton);

        loginButton.setBounds(580, 340, 90, 27);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 1178, 234, 8);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(42, 234, 234, 5);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\pxfuel (1).jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, -10, 610, 520);
    }

    private void prepareFrame() {


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 500));


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();            //

        setVisible(true);

    }

    private void showLoginScreen() {
        init();
        setElementsProperties();
        addLoginListeners();
        prepareFrame();
    }

    private void addLoginListeners() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register();
            }
        });
    }

    private void login(){
        String username = usernameField.getText();
        String password = passwordField.getText();
        if(isValidUser(username, password)){
            System.out.println(("أنت راجل تمام وعال العال"));
        }
        else{
            System.out.println("انت كداب يلا");
        }
    }
    private void register(){
        this.setVisible(false);
        RegisterScreen registerScreen = new RegisterScreen();
    }

    private boolean isValidUser(String username, String password) {
        // Check credentials against the stored users
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUser_name().equals(username) && userList.get(i).getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    
    
}