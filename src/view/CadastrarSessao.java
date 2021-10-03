package view;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.CadastrarSessaoController;

public class CadastrarSessao extends JFrame implements ActionListener{

	private final JPanel salaSessaoField;
	private final JLabel dataSessaoLabel;
	private final JLabel horarioSessaoLabel;
	private final JLabel salaSessaoLabel;
	private final JButton confirmarSessaoBtn;
	private final JButton voltarSessaoBtn;
	private final JTextField dataSessaoField;
	private final JTextField horarioSessaoField;
	private final JComboBox<String> salaComboBox;
	private final CadastrarSessaoController controller;
	private static final String COLO_STRING = "Open Sans";



	/**
	 * Responsável pela view do cadastro de Sessão
	 */
	public CadastrarSessao() {
		
		controller = new CadastrarSessaoController(this);

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarSessao.class.getResource("/view/images/favicon.png")));
		setTitle("Cadastrar Sess\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 262);
		salaSessaoField = new JPanel();
		salaSessaoField.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(salaSessaoField);
		salaSessaoField.setLayout(null);

		dataSessaoLabel = new JLabel("Data das sessoes");
		dataSessaoLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		dataSessaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dataSessaoLabel.setBounds(10, 32, 166, 14);
		salaSessaoField.add(dataSessaoLabel);

		horarioSessaoLabel = new JLabel("Horario");
		horarioSessaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		horarioSessaoLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		horarioSessaoLabel.setBounds(10, 74, 166, 14);
		salaSessaoField.add(horarioSessaoLabel);

		salaSessaoLabel = new JLabel("Sala");
		salaSessaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		salaSessaoLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		salaSessaoLabel.setBounds(10, 118, 166, 14);
		salaSessaoField.add(salaSessaoLabel);

		dataSessaoField = new JTextField();
		dataSessaoField.setBounds(196, 30, 127, 20);
		salaSessaoField.add(dataSessaoField);
		dataSessaoField.setColumns(10);

		horarioSessaoField = new JTextField();
		horarioSessaoField.setBounds(196, 72, 127, 20);
		salaSessaoField.add(horarioSessaoField);
		horarioSessaoField.setColumns(10);

		salaComboBox = new JComboBox<>();
		salaComboBox.setBounds(196, 116, 127, 20);
		salaComboBox.setModel(controller.atualizarSala());
		salaSessaoField.add(salaComboBox);

		confirmarSessaoBtn = new JButton("Confirmar");
		confirmarSessaoBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		confirmarSessaoBtn.setBounds(24, 165, 127, 34);
		confirmarSessaoBtn.addActionListener(this);
		salaSessaoField.add(confirmarSessaoBtn);

		voltarSessaoBtn = new JButton("Voltar");
		voltarSessaoBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		voltarSessaoBtn.setBounds(228, 165, 127, 34);
		voltarSessaoBtn.addActionListener(this);
		salaSessaoField.add(voltarSessaoBtn);

		setLocationRelativeTo(null);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.controller.executarBotao(e.getSource());
	}

	public void mostrarMensagemConfirmando(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}


	public JButton getConfirmarSessaoBtn() {
		return confirmarSessaoBtn;
	}


	public JButton getVoltarSessaoBtn() {
		return voltarSessaoBtn;
	}


	public JTextField getDataSessaoField() {
		return dataSessaoField;
	}


	public JTextField getHorarioSessaoField() {
		return horarioSessaoField;
	}


	public JComboBox<String> getSalaComboBox() {
		return salaComboBox;
	}

	
}
