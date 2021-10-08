package view;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.CadastrarSalaController;

/**
 * Classe responsável pela view do cadastro de Sala.
 * Essa mesma classe herda o JFrame e implementa a interface ActionListener
 * 
 * @author Cleber de Oliveira Brant
 */
public class CadastrarSala extends JFrame implements ActionListener{

	private final JPanel contentPane;
	private final JTextField numeroSalaField;
	private final JTextField capacidadeField;
	private final JLabel numeroSalaLabel;
	private final JLabel capacidadeLabel;
	private final JComboBox<String> filmesComboBox;
	private final JComboBox<String> capacidadeComboBox;
	private final JButton confirmarBtn;
	private final JButton voltarBtn;
	private final CadastrarSalaController controller;
	private static final String COLO_STRING = "Open Sans";


	/**
	 * JPanel para o cadastro da Sala.
	 * 
	 * 
	 */
	public CadastrarSala() {
		
		controller = new CadastrarSalaController(this);

		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarSala.class.getResource("/view/images/favicon.png")));
		setResizable(false);
		setTitle("Sala");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		filmesComboBox = new JComboBox<>();
		filmesComboBox.setBounds(36, 11, 418, 31);
		filmesComboBox.addActionListener(this);
		contentPane.add(filmesComboBox);
		filmesComboBox.addItem("Filmes");

		numeroSalaField = new JTextField();
		numeroSalaField.setBounds(167, 97, 156, 31);
		contentPane.add(numeroSalaField);
		numeroSalaField.setColumns(10);

		numeroSalaLabel = new JLabel("Numero da Sala");
		numeroSalaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		numeroSalaLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		numeroSalaLabel.setBounds(167, 79, 156, 14);
		contentPane.add(numeroSalaLabel);

		capacidadeLabel = new JLabel("Capacidade");
		capacidadeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		capacidadeLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		capacidadeLabel.setBounds(167, 147, 156, 14);
		contentPane.add(capacidadeLabel);

		capacidadeField = new JTextField();
		capacidadeField.setColumns(10);
		capacidadeField.setBounds(167, 164, 156, 31);
		contentPane.add(capacidadeField);

		capacidadeComboBox = new JComboBox<>();
		capacidadeComboBox.setBounds(168, 232, 156, 31);
		contentPane.add(capacidadeComboBox);
		capacidadeComboBox.addItem("Tecnologia");
		capacidadeComboBox.addItem("2D");
		capacidadeComboBox.addItem("3D");
		capacidadeComboBox.addItem("DUB");
		capacidadeComboBox.addItem("DBOX");

		confirmarBtn = new JButton("Confirmar");
		confirmarBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		confirmarBtn.setBounds(36, 307, 114, 41);
		confirmarBtn.addActionListener(this);
		contentPane.add(confirmarBtn);

		voltarBtn = new JButton("Voltar");
		voltarBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		voltarBtn.setBounds(340, 307, 114, 41);
		voltarBtn.addActionListener(this);
		contentPane.add(voltarBtn);

		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.controller.executarBotao(e.getSource());

	}

	public JTextField getNumeroSalaField() {
		return numeroSalaField;
	}

	public JTextField getCapacidadeField() {
		return capacidadeField;
	}

	public JLabel getNumeroSalaLabel() {
		return numeroSalaLabel;
	}

	public JLabel getCapacidadeLabel() {
		return capacidadeLabel;
	}

	public JComboBox<String> getFilmesComboBox() {
		return filmesComboBox;
	}

	public JComboBox<String> getCapacidadeComboBox() {
		return capacidadeComboBox;
	}

	public JButton getConfirmarBtn() {
		return confirmarBtn;
	}

	public JButton getVoltarBtn() {
		return voltarBtn;
	}

	public CadastrarSalaController getController() {
		return controller;
	}
	
	
}
