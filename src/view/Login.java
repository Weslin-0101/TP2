package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements ActionListener{

    private final JLabel usernameJLabel;
    private final JTextField username;
    private final JLabel passwrodJLabel;
    private final JPasswordField password;
    private final JButton loginBtn;
    private final JButton registerBtn;


    public Login() {

        this.setSize(425, 325);
        setLayout(null);
        setResizable(false);
        setTitle("Cinema");

        usernameJLabel = new JLabel("Usuário");
        usernameJLabel.setBounds(110, 98, 80, 25);
        add(usernameJLabel);

        username = new JTextField(20);
        username.setBounds(162, 98, 100, 25);
        add(username);

        passwrodJLabel = new JLabel("Senha");
        passwrodJLabel.setBounds(115, 136, 80, 25);
        add(passwrodJLabel);

        password = new JPasswordField(20);
        password.setBounds(162, 136, 100, 25);
        add(password);

        loginBtn = new JButton("Entrar");
        loginBtn.setBounds(85, 176, 105, 28);
        add(loginBtn);

        registerBtn = new JButton("Registrar-se");
        registerBtn.setBounds(210, 176, 105, 28);
        add(registerBtn);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    public JLabel getUsernameJLabel() {
        return usernameJLabel;
    }

    public JTextField getUsername() {
        return username;
    }

    public JLabel getPasswrodJLabel() {
        return passwrodJLabel;
    }

    public JPasswordField getPassword() {
        return password;
    }

    public JButton getLoginBtn() {
        return loginBtn;
    }

    public JButton getRegisterBtn() {
        return registerBtn;
    }

    
}
