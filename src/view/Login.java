package view;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import controller.LoginController;
import model.Dados;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements ActionListener{

    private final JLabel usernameJLabel;
    private final JTextField username;
    private final JLabel passwrodJLabel;
    private final JPasswordField password;
    private final JButton loginBtn;
    private final JButton registerBtn;
    private final LoginController controller;


    /* 
    Classe Login para logar e se registrar

    Conta Master cadastrada para ADMIN:

    Foi adicionado um ícone na janela dessa View.

    */
    public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/view/images/favicon.png")));

        /**
         * A classe View se comunica com o Controller dela mesma
         * e com o método iniciar() da classe Dados, para que possa
         * adicionar os dados pré-cadastrados ou aqueles que serão
         * ainda cadastrados.
         * 
         */
		controller = new LoginController(this);

		this.setSize(425, 340);
		getContentPane().setLayout(null);
		setResizable(false);
		setTitle("Cinema");

		usernameJLabel = new JLabel("Usuario");
		usernameJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		usernameJLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		usernameJLabel.setBounds(10, 83, 143, 25);
		getContentPane().add(usernameJLabel);

		username = new JTextField(20);
		username.setBounds(162, 84, 100, 25);
		getContentPane().add(username);

		passwrodJLabel = new JLabel("Senha");
		passwrodJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passwrodJLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		passwrodJLabel.setBounds(10, 119, 143, 25);
		getContentPane().add(passwrodJLabel);

		password = new JPasswordField(20);
		password.setBounds(162, 120, 100, 25);
		getContentPane().add(password);

		loginBtn = new JButton("Entrar");
		loginBtn.setFont(new Font("Open Sans", Font.PLAIN, 13));
		loginBtn.setBounds(69, 172, 105, 28);
		loginBtn.addActionListener(this);
		getContentPane().add(loginBtn);

		registerBtn = new JButton("Registrar-se");
		registerBtn.setFont(new Font("Open Sans", Font.PLAIN, 13));
		registerBtn.setBounds(215, 172, 105, 28);
		registerBtn.addActionListener(this);
		getContentPane().add(registerBtn);

		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
	}
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        this.controller.executarBotao(e);
        
    }

    public void mostrarMensagemLoginInvalido(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void mostrarMensagemLoginValido(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public JTextField getUsername() {
        return username;
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
