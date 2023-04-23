package payrollSystem;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;

public class login implements ActionListener {
    
    HashMap<String,String> logininfo = new HashMap<String,String>();
    
    login(HashMap<String, String> loginInfoOriginal){
        
        logininfo = loginInfoOriginal;
    
    }
    
    private JFrame frame;
    private JPanel panel;
    private JLabel title;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JButton loginButton;
    private JLabel registerButton;
    private JTextField textField;
    private JPasswordField passwordField;
    
    
    public login() {
        
        
        
        frame = new JFrame("MotorPH");
        frame.setBounds(0, 0, 700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
       
        panel = new JPanel();
        panel.setForeground(new Color(255, 255, 255));
        panel.setBackground(new Color(255, 255, 255));
        panel.setLayout(null);
       
        
        
        title = new JLabel("Welcome, Please Login!");
        title.setBounds(188, 42, 300, 25);
        title.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        title.setForeground(new Color(0, 0, 0));
        panel.add(title);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(156, 160, 100, 25);
        userLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
        userLabel.setForeground(new Color(0, 0, 0));
        
        
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(156, 238, 100, 25);
        passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
        passwordLabel.setForeground(new Color(0, 0, 0));

        loginButton = new JButton("Login");
        loginButton.setBounds(278, 355, 75, 25);
        loginButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        loginButton.setForeground(new Color(0, 0, 0));
        loginButton.setBackground(Color.GRAY);
        loginButton.addActionListener(this);
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
        registerButton = new JLabel("Create an account!");
        registerButton.setBounds(252, 410, 150, 25);
        registerButton.setForeground(new Color(0, 0, 0));
        registerButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        

        panel.add(userLabel);
        panel.add(passwordLabel);
        JLabel label = new JLabel("");
        label.setBounds(0, 0, 0, 0);
        panel.add(label);
        panel.add(loginButton);
        panel.add(registerButton);

        frame.getContentPane().add(panel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 0, 686, 563);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(279, 162, 199, 32);
        panel_1.add(textField);
        textField.setColumns(10);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(279, 238, 199, 32);
        panel_1.add(passwordField);
        frame.setVisible(true);    
        
    }
    
    
    public void actionPerformed(ActionEvent ae) {
        String username = textField.getText();
        String password = new String(passwordField.getPassword());
        
        logininfo = new HashMap<>();
        logininfo.put("Crisostomo","10001" );
        logininfo.put("Mata","10002" );
        logininfo.put("Salcedo","10004" );
                
                 
                 if (logininfo.containsKey(username) && logininfo.get(username).equals(password)) {
                
                	homepage hp = new homepage();
     				hp.frame.setVisible(true);
     				frame.dispose();
                
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
                
                
    
        
        
             
    public static void main(String[] args) {
        new login();
    }
}


    
