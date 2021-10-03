package view;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.CadastrarClienteController;

public class CadastrarCliente extends JFrame implements ActionListener{

	private final JPanel contentPane;
	private final JLabel nameLabel;
	private final JLabel dateLabel;
	private final JLabel cpfLabel;
	private final JLabel emailLabel;
	private final JLabel senhaLabel;
	private final JTextField nameField;
	private final JTextField dateField;
	private final JTextField cpfField;
	private final JTextField emailField;
	private final JPasswordField senhaField;
	private final JButton confirmarBtn;
	private final JButton voltarBtn;
	private final CadastrarClienteController controller;
	private static final String COLO_STRING = "Open Sans";


	/**
	 * Classe responsável pela View de CadastrarCliente
	 * 
	 * Foi adicoinado um ícone na janela do Frame desta classe.
	 */
	public CadastrarCliente() {
		
		controller = new CadastrarClienteController(this);

		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarCliente.class.getResource("/view/images/favicon.png")));
		setResizable(false);
		setTitle("Cadastrar");
		this.setSize(425, 340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 340);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		nameLabel = new JLabel("Nome");
		nameLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setBounds(30, 11, 152, 35);
		contentPane.add(nameLabel);

		dateLabel = new JLabel("Data de nascimento");
		dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dateLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		dateLabel.setBounds(30, 57, 152, 35);
		contentPane.add(dateLabel);

		cpfLabel = new JLabel("CPF");
		cpfLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cpfLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		cpfLabel.setBounds(30, 103, 152, 35);
		contentPane.add(cpfLabel);

		emailLabel = new JLabel("Email");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		emailLabel.setBounds(33, 149, 152, 35);
		contentPane.add(emailLabel);

		senhaLabel = new JLabel("Senha");
		senhaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		senhaLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		senhaLabel.setBounds(33, 198, 152, 35);
		contentPane.add(senhaLabel);

		nameField = new JTextField();
		nameField.setBounds(215, 16, 157, 27);
		contentPane.add(nameField);
		nameField.setColumns(10);

		dateField = new JTextField();
		dateField.setColumns(10);
		dateField.setBounds(215, 62, 157, 27);
		contentPane.add(dateField);

		cpfField = new JTextField();
		cpfField.setColumns(10);
		cpfField.setBounds(215, 108, 157, 27);
		contentPane.add(cpfField);

		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(215, 152, 157, 27);
		contentPane.add(emailField);

		senhaField = new JPasswordField(20);
		senhaField.setColumns(10);
		senhaField.setBounds(215, 198, 157, 27);
		contentPane.add(senhaField);

		confirmarBtn = new JButton("Confirmar");
		confirmarBtn.setBounds(61, 244, 109, 41);
		confirmarBtn.addActionListener(this);
		contentPane.add(confirmarBtn);

		voltarBtn = new JButton("Voltar");
		voltarBtn.setBounds(247, 244, 109, 41);
		voltarBtn.addActionListener(this);
		contentPane.add(voltarBtn);

		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.controller.executarBotao(e);
	}

	public void mensagemConfirmarCadastro(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	@Override
	public JPanel getContentPane() {
		return contentPane;
	}

	public JLabel getNameLabel() {
		return nameLabel;
	}

	public JLabel getDateLabel() {
		return dateLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public JLabel getEmailLabel() {
		return emailLabel;
	}

	public JLabel getSenhaLabel() {
		return senhaLabel;
	}

	public JTextField getNameField() {
		return nameField;
	}

	public JTextField getDateField() {
		return dateField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JTextField getEmailField() {
		return emailField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}

	public JButton getConfirmarBtn() {
		return confirmarBtn;
	}

	public JButton getVoltarBtn() {
		return voltarBtn;
	}
}
