import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Read implements ActionListener {
    JFrame jf;
    JPanel jp;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    Read() {
        ImageIcon background = new ImageIcon("/Users/vinayakprakash/Downloads/loc.gif");

        jf = new JFrame();
        jf.setTitle("Login Page");

        jp = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                background.paintIcon(this, g, 0, 0);
            }
        };

        jf.add(jp);

        jp.setLayout(new GridBagLayout());

        // Username field
        usernameField = new JTextField(15);
        GridBagConstraints gbcUsername = new GridBagConstraints();
        gbcUsername.gridx = 0;
        gbcUsername.gridy = 0;
        gbcUsername.insets = new Insets(10, 10, 10, 10); 
        jp.add(usernameField, gbcUsername);

        // Password field
        passwordField = new JPasswordField(15);
        GridBagConstraints gbcPassword = new GridBagConstraints();
        gbcPassword.gridx = 0;
        gbcPassword.gridy = 1;
        gbcPassword.insets = new Insets(10, 10, 10, 10); 
        jp.add(passwordField, gbcPassword);

        // Login button
        loginButton = new JButton("Login");
        GridBagConstraints gbcLoginButton = new GridBagConstraints();
        gbcLoginButton.gridx = 0;
        gbcLoginButton.gridy = 2;
        gbcLoginButton.insets = new Insets(10, 10, 10, 10); 
        jp.add(loginButton, gbcLoginButton);

        loginButton.addActionListener(this);

        jf.setVisible(true);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600, 800);
        jf.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==loginButton){
            

        }
    }

    public static void main(String[] args) {
        new Read();
    }
}