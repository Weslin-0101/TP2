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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.CadastrarFilmeController;

/**
 * Classe responsável para a visualização do Cadastro de Filmes
 * 
 * Essa mesma classe herda o JFrame e implementa a interface ActionListener.
 * 
 * @author Cleber de Oliveira Brant
 */
public class CadastrarFilme extends JFrame implements ActionListener{

	private final JPanel contentPane;
	private final JLabel tituloLabel;
	private final JLabel duracaoLabel;
	private final JLabel sinopseLabel;
	private final JLabel generoLabel;
	private final JLabel cartazLabel;
	private final JLabel atoresLabel;
	private final JLabel diretorLabel;
	private final JTextField tituloField;
	private final JTextField duracaoField;
	private final JTextField sinopseField;
	private final JTextField generoField;
	private final JTextField cartazField;
	private final JTextField atoresField;
	private final JTextField diretorField;
	private final JButton confirmarFilmeBtn;
	private final JButton voltarBtn;
	private final CadastrarFilmeController controller;
	private static final String COLO_STRING = "Open Sans";

	/**
	 * JPanel para o cadastro de filme
	 * 
	 * JPanel cria diversos JPanels para introduzir as informações
	 * de cada filme para cadastrá-los.
	 * 
	 * JPanel também possui dois botões com as seguintes funções:
	 * 		(1) -> botão Voltar: retorna para o Menu.
	 * 		(2) -> botão Confirmar: retorna uma mensagem confirmando
	 * o cadastro de filme e te retornado para o Menu.
	 * 
	 * @see Menu
	 */
	public CadastrarFilme() {
		
		this.controller = new CadastrarFilmeController(this);

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarFilme.class.getResource("/view/images/favicon.png")));
		setTitle("Cadastro de filme");
		this.setSize(484, 413);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tituloLabel = new JLabel("Titulo");
		tituloLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		tituloLabel.setBounds(10, 31, 154, 14);
		contentPane.add(tituloLabel);

		duracaoLabel = new JLabel("Duracao");
		duracaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		duracaoLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		duracaoLabel.setBounds(10, 72, 154, 14);
		contentPane.add(duracaoLabel);

		sinopseLabel = new JLabel("Sinopse");
		sinopseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sinopseLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		sinopseLabel.setBounds(10, 112, 154, 14);
		contentPane.add(sinopseLabel);

		generoLabel = new JLabel("Genero");
		generoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		generoLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		generoLabel.setBounds(10, 151, 154, 14);
		contentPane.add(generoLabel);

		cartazLabel = new JLabel("Em cartaz");
		cartazLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cartazLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		cartazLabel.setBounds(10, 193, 154, 14);
		contentPane.add(cartazLabel);

		atoresLabel = new JLabel("Atores");
		atoresLabel.setHorizontalAlignment(SwingConstants.CENTER);
		atoresLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		atoresLabel.setBounds(10, 234, 154, 14);
		contentPane.add(atoresLabel);

		diretorLabel = new JLabel("Diretor");
		diretorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		diretorLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		diretorLabel.setBounds(10, 275, 154, 14);
		contentPane.add(diretorLabel);

		tituloField = new JTextField();
		tituloField.setBounds(174, 29, 233, 20);
		contentPane.add(tituloField);
		tituloField.setColumns(10);

		duracaoField = new JTextField();
		duracaoField.setColumns(10);
		duracaoField.setBounds(174, 70, 233, 20);
		contentPane.add(duracaoField);

		sinopseField = new JTextField();
		sinopseField.setColumns(10);
		sinopseField.setBounds(174, 110, 233, 20);
		contentPane.add(sinopseField);

		generoField = new JTextField();
		generoField.setColumns(10);
		generoField.setBounds(174, 149, 233, 20);
		contentPane.add(generoField);

		confirmarFilmeBtn = new JButton("Confirmar");
		confirmarFilmeBtn.addActionListener(this);
		confirmarFilmeBtn.setBounds(39, 322, 106, 36);
		contentPane.add(confirmarFilmeBtn);

		voltarBtn = new JButton("Voltar");
		voltarBtn.addActionListener(this);
		voltarBtn.setBounds(313, 322, 106, 36);
		contentPane.add(voltarBtn);

		cartazField = new JTextField();
		cartazField.setColumns(10);
		cartazField.setBounds(174, 191, 233, 20);
		contentPane.add(cartazField);

		atoresField = new JTextField();
		atoresField.setColumns(10);
		atoresField.setBounds(174, 232, 233, 20);
		contentPane.add(atoresField);

		diretorField = new JTextField();
		diretorField.setColumns(10);
		diretorField.setBounds(174, 273, 233, 20);
		contentPane.add(diretorField);

		setLocationRelativeTo(null);
	}

	/**
	 * Executa o comando após o botão ser clicado.
	 * 
	 * Implementação da interface ActionListener.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.controller.executarBotao(e);
	}

	/**
	 * Retorna um JOptionPane com uma mensagem confirmando o cadastro
	 * logo após o clique no botão Confirmar.
	 * 
	 * @param mensagem Mensagem dentro da JOptionPane confirmando o cadastro.
	 */
	public void mostrarMensagemCadastro(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, null, JOptionPane.INFORMATION_MESSAGE);
	}

	public JLabel getTituloLabel() {
		return tituloLabel;
	}

	public JLabel getDuracaoLabel() {
		return duracaoLabel;
	}

	public JLabel getSinopseLabel() {
		return sinopseLabel;
	}

	public JLabel getGeneroLabel() {
		return generoLabel;
	}

	public JLabel getCartazLabel() {
		return cartazLabel;
	}

	public JLabel getAtoresLabel() {
		return atoresLabel;
	}

	public JLabel getDiretorLabel() {
		return diretorLabel;
	}

	public JTextField getTituloField() {
		return tituloField;
	}

	public JTextField getDuracaoField() {
		return duracaoField;
	}

	public JTextField getSinopseField() {
		return sinopseField;
	}

	public JTextField getGeneroField() {
		return generoField;
	}

	public JTextField getCartazField() {
		return cartazField;
	}

	public JTextField getAtoresField() {
		return atoresField;
	}

	public JTextField getDiretorField() {
		return diretorField;
	}

	public JButton getConfirmarFilmeBtn() {
		return confirmarFilmeBtn;
	}

	public JButton getVoltarBtn() {
		return voltarBtn;
	}

	public CadastrarFilmeController getController() {
		return controller;
	}
	
}
