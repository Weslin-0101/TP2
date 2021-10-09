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

import controller.EditarClienteController;
import model.Cliente;

/**
 * Classe responsável para a visualização e edição do Cliente.
 * Essa mesma classe herda o JFrame e implementa a interface ActionListener
 * 
 * @author Cleber de Oliveira Brant e Wesley Lira Carvalho
 */
public class EditarCliente extends JFrame implements ActionListener{
    
    private final Cliente cliente;
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
	private final EditarClienteController controller;
	private static final String COLO_STRING = "Open Sans";


	/**
	 * JPanel para o editar o cliente
	 * 
	 * JPanel cria diversos labels para inserir os dados
	 * de cada cliente para a sua edição. Além disso, também
	 * possui os dois seguintes botões e suas funções:
	 * 		(1) -> Editar: O botão gera um evento após ser clicado, do qual
	 * 		chama uma JOptionPane dizendo que a edição foi um sucesso e em seguida
	 * 		te redireciona para o Menu.
	 * 		
	 * 		(2) -> Voltar: O botão gera um evento após ser clicado, que no qual
	 * 		te redirecio para o Menu
	 * 
	 * @see Menu
	 */
	public EditarCliente(Cliente cliente) {
		
        controller = new EditarClienteController(this);
        this.cliente = cliente;

		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarCliente.class.getResource("/view/images/favicon.png")));
		setResizable(false);
		setTitle("Editar Cliente");
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

		nameField = new JTextField(cliente.getNome());
		nameField.setBounds(215, 16, 157, 27);
		contentPane.add(nameField);
		nameField.setColumns(10);

		dateField = new JTextField(cliente.getDataDeNascimento());
		dateField.setColumns(10);
		dateField.setBounds(215, 62, 157, 27);
		contentPane.add(dateField);

		cpfField = new JTextField(cliente.getCpf());
		cpfField.setColumns(10);
		cpfField.setBounds(215, 108, 157, 27);
		contentPane.add(cpfField);

		emailField = new JTextField(cliente.getEmail());
		emailField.setColumns(10);
		emailField.setBounds(215, 152, 157, 27);
		contentPane.add(emailField);

		senhaField = new JPasswordField(cliente.getSenha());
		senhaField.setColumns(10);
		senhaField.setBounds(215, 198, 157, 27);
		contentPane.add(senhaField);

		confirmarBtn = new JButton("Editar");
		confirmarBtn.setBounds(61, 244, 109, 41);
		confirmarBtn.addActionListener(this);
		contentPane.add(confirmarBtn);

		voltarBtn = new JButton("Voltar");
		voltarBtn.setBounds(247, 244, 109, 41);
		voltarBtn.addActionListener(this);
		contentPane.add(voltarBtn);

		setLocationRelativeTo(null);
	}

	/**
	 * Executa o comando após o botão ser clicado
	 * 
	 * Implementação da interface ActionListener
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.controller.executarBotao((JButton)e.getSource());
	}

	/**
	 * Gera um JOptionPane que aparece na tela logo após
	 * o botão Confirmar ser clicado!
	 * @param mensagem mensagem de confirmação do cadastro
	 * do cliente
	 */
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

	public EditarClienteController getController() {
		return controller;
	}

	public Cliente getCliente() {
		return cliente;
	}

    
	
}
