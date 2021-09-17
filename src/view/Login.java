package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Cliente;

public class Login implements ActionListener {
    
    private static JFrame janela = new JFrame("Cinema");
    private static JLabel userLabel = new JLabel("Usuário");
    private static JLabel passwordLabel = new JLabel("Senha");
    private static JTextField userText = new JTextField(20);
    private static JPasswordField passwordText = new JPasswordField(20);
    private static JButton loginBtn = new JButton("Login");
    private static JButton registerBtn = new JButton("Registrar");

    private Cliente cliente;

    public Login() {

        userLabel.setBounds(40, 175, 80, 25);
        userText.setBounds(60, 200, 160, 25);
        passwordLabel.setBounds(30, 225, 80, 25);
        passwordText.setBounds(60, 250, 160, 25);
        loginBtn.setBounds(10, 290, 80, 25);
        registerBtn.setBounds(150, 290, 80, 25);

        janela.setLayout(null);
        janela.add(userLabel);
        janela.add(userText);
        janela.add(passwordLabel);
        janela.add(passwordText);
        janela.add(loginBtn);
        janela.add(registerBtn);

        janela.setSize(264, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        Login login = new Login();

        loginBtn.addActionListener(login);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        String username = userText.getText();
        String password = passwordText.getText();

        Object src = e.getSource();
        if (src == loginBtn) {
            if (username.equals("admin") && (password.equals("admin"))) {
                JOptionPane.showMessageDialog(null, "PASSA A BUCETINHA");
            } else {
                passwordLabel.setText("AAAAAAAAAAAAAAA");
            }
        }
    }
}
