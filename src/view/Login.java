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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Classe responsável pela visualização da tela de Login.
 * 
 * Essa mesma classe herda JFrame e implementa a interface ActionListener.
 * 
 * @author Cleber de Oliveira Brant.
 */
public class Login extends JFrame implements ActionListener{

    private final JLabel usernameJLabel;
    private final JTextField username;
    private final JLabel passwrodJLabel;
    private final JPasswordField password;
    private final JButton loginBtn;
    private final JButton registerBtn;
    private final LoginController controller;
    private static final String COLO_STRING = "Open Sans";



    /**
     * JPanel para o Login.
     * 
     * JPanel adiciona duas JLabels para inserir os dados de Usuário
     * para se logar no sistema. Além de que também possui dois botões
     * com funções diferentes, dos quais são eles:
     *      (1) -> botão Entrar: direciona para a tela de Menu.
     *      (2) -> botão Registrar-se: direcioa para a tela de Cadastro
     * de Cliente.
     */
    public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/view/images/favicon.png")));

		controller = new LoginController(this);

		this.setSize(425, 340);
		getContentPane().setLayout(null);
		setResizable(false);
		setTitle("Cinema");

		usernameJLabel = new JLabel("Usuario");
		usernameJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		usernameJLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		usernameJLabel.setBounds(10, 83, 143, 25);
		getContentPane().add(usernameJLabel);

		username = new JTextField(20);
		username.setBounds(162, 84, 100, 25);
		getContentPane().add(username);

		passwrodJLabel = new JLabel("Senha");
		passwrodJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passwrodJLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		passwrodJLabel.setBounds(10, 119, 143, 25);
		getContentPane().add(passwrodJLabel);

		password = new JPasswordField(20);
		password.setBounds(162, 120, 100, 25);
		getContentPane().add(password);

		loginBtn = new JButton("Entrar");
		loginBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		loginBtn.setBounds(69, 172, 105, 28);
		loginBtn.addActionListener(this);
		getContentPane().add(loginBtn);

		registerBtn = new JButton("Registrar-se");
		registerBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		registerBtn.setBounds(215, 172, 105, 28);
		registerBtn.addActionListener(this);
		getContentPane().add(registerBtn);

		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
	}
    
    /**
     * Executa um comando dependendo de qual botão foi clicado.
     * 
     * Implementação da interface ActionListener.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
        this.controller.executarBotao(e);
        
    }

    /**
     * Retorna um JOptionPane informando que os dados digitados são inválidos.
     * 
     * @param mensagem Mensagem informando que os dados digitados estão errados.
     */
    public void mostrarMensagemLoginInvalido(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, null, JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Retorna um JOptionPane informando que os dados digitados são válidos.
     * 
     * @param mensagem Mensagem informando que os dados digitados estão certos.
     */
    public void mostrarMensagemLoginValido(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, null, JOptionPane.INFORMATION_MESSAGE);
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
