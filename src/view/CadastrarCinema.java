package view;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.CadastrarCinemaController;

public class CadastrarCinema extends JFrame implements ActionListener{

	private final JPanel contentPane;
	private final JLabel enderecoLabel;
	private final JLabel cepLabel;
	private final JLabel referenciaLabel;
	private final JLabel nomeCinemaLabel;
	private final JLabel numeroSalaLabel;
	private final JLabel capacidadeLabel;
	private final JComboBox<Object> capacidadeComboBox;
	private final JTextField enderecoField;
	private final JTextField cepField;
	private final JTextField referenciaField;
	private final JTextField nomeCinemaField;
	private final JTextField numeroSalaField;
	private final JTextField capacidadeField;
	private final JButton confirmaCinemaBtn;
	private final JButton voltarCinemaBtn;
	private final CadastrarCinemaController controller;
	private static final String COLOR_STRING = "Open Sans";

	/**
	 * Classe para a View do cadastro de cinema!
	 */
	public CadastrarCinema() {
		
		this.controller	= new CadastrarCinemaController(this);

		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarCinema.class.getResource("/view/images/favicon.png")));
		this.setSize(525, 523);
		setResizable(false);
		setTitle("Cadastro do cinema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		enderecoLabel = new JLabel("Endereco");
		enderecoLabel.setBounds(10, 71, 168, 14);
		enderecoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		enderecoLabel.setFont(new Font(COLOR_STRING, Font.PLAIN, 14));
		contentPane.add(enderecoLabel);

		cepLabel = new JLabel("CEP");
		cepLabel.setBounds(20, 118, 158, 14);
		cepLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cepLabel.setFont(new Font(COLOR_STRING, Font.PLAIN, 14));
		contentPane.add(cepLabel);

		referenciaLabel = new JLabel("Ponto de referencia");
		referenciaLabel.setBounds(10, 164, 168, 14);
		referenciaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		referenciaLabel.setFont(new Font(COLOR_STRING, Font.PLAIN, 14));
		contentPane.add(referenciaLabel);

		enderecoField = new JTextField();
		enderecoField.setBounds(188, 69, 258, 20);
		contentPane.add(enderecoField);
		enderecoField.setColumns(10);

		cepField = new JTextField();
		cepField.setBounds(188, 116, 258, 20);
		contentPane.add(cepField);
		cepField.setColumns(10);

		referenciaField = new JTextField();
		referenciaField.setBounds(188, 162, 258, 20);
		contentPane.add(referenciaField);
		referenciaField.setColumns(10);

		confirmaCinemaBtn = new JButton("Confirmar");
		confirmaCinemaBtn.setBounds(40, 410, 130, 35);
		confirmaCinemaBtn.addActionListener(this);
		contentPane.add(confirmaCinemaBtn);

		voltarCinemaBtn = new JButton("Voltar");
		voltarCinemaBtn.setBounds(338, 410, 130, 35);
		voltarCinemaBtn.addActionListener(this);
		contentPane.add(voltarCinemaBtn);

		nomeCinemaLabel = new JLabel("Nome");
		nomeCinemaLabel.setBounds(10, 26, 168, 14);
		nomeCinemaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nomeCinemaLabel.setFont(new Font(COLOR_STRING, Font.PLAIN, 14));
		contentPane.add(nomeCinemaLabel);

		nomeCinemaField = new JTextField();
		nomeCinemaField.setBounds(188, 24, 258, 20);
		contentPane.add(nomeCinemaField);
		nomeCinemaField.setColumns(10);

		numeroSalaLabel = new JLabel("Numero da sala");
		numeroSalaLabel.setBounds(10, 209, 168, 14);
		numeroSalaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		numeroSalaLabel.setFont(new Font(COLOR_STRING, Font.PLAIN, 14));
		contentPane.add(numeroSalaLabel);

		numeroSalaField = new JTextField();
		numeroSalaField.setBounds(188, 207, 258, 20);
		contentPane.add(numeroSalaField);

		capacidadeLabel = new JLabel("Capacidade");
		capacidadeLabel.setBounds(10, 256, 168, 14);
		capacidadeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		capacidadeLabel.setFont(new Font(COLOR_STRING, Font.PLAIN, 14));
		contentPane.add(capacidadeLabel);

		capacidadeField = new JTextField();
		capacidadeField.setBounds(188, 254, 258, 20);
		capacidadeField.setColumns(10);
		contentPane.add(capacidadeField);

		capacidadeComboBox = new JComboBox<>();
		capacidadeComboBox.setBounds(168, 300, 156, 31);
		contentPane.add(capacidadeComboBox);
		capacidadeComboBox.addItem("Tecnologia");
		capacidadeComboBox.addItem("2D");
		capacidadeComboBox.addItem("3D");
		capacidadeComboBox.addItem("DUB");
		capacidadeComboBox.addItem("DBOX");

		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.controller.executarBotao(e);
	}

	public void mostrarMensagemCadastroCinema(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public JLabel getEnderecoLabel() {
		return enderecoLabel;
	}

	public JLabel getCepLabel() {
		return cepLabel;
	}

	public JLabel getReferenciaLabel() {
		return referenciaLabel;
	}

	public JLabel getNomeCinemaLabel() {
		return nomeCinemaLabel;
	}

	public JLabel getNumeroSalaLabel() {
		return numeroSalaLabel;
	}

	public JLabel getCapacidadeLabel() {
		return capacidadeLabel;
	}

	public JTextField getEnderecoField() {
		return enderecoField;
	}

	public JTextField getCepField() {
		return cepField;
	}

	public JTextField getReferenciaField() {
		return referenciaField;
	}

	public JTextField getNomeCinemaField() {
		return nomeCinemaField;
	}

	public JTextField getNumeroSalaField() {
		return numeroSalaField;
	}

	public JTextField getCapacidadeField() {
		return capacidadeField;
	}

	public JButton getConfirmaCinemaBtn() {
		return confirmaCinemaBtn;
	}

	public JButton getVoltarCinemaBtn() {
		return voltarCinemaBtn;
	}

	public JComboBox<Object> getCapacidadeComboBox() {
		return capacidadeComboBox;
	}
}
