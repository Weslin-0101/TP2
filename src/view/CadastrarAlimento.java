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

import controller.CadastrarAlimentoController;
import model.Dados;

public class CadastrarAlimento extends JFrame implements ActionListener{

	private final JPanel contentPane;
	private final JLabel nomeAlimentoLabel;
	private final JLabel precoAlimentoLabel;
	private final JLabel descricaoAlimentoLabel;
	private final JTextField nomeAlimentoField;
	private final JTextField precoAlimentoField;
	private final JTextField descricaoAlimentoField;
	private final JButton confirmarAlimentoBtn;
	private final JButton voltarAlimentoBtn;
	private final JComboBox<Object> escolhaComboBox;
	private final CadastrarAlimentoController controller;

	/**
	 * Classe para o cadastro de Alimentos
	 */
	public CadastrarAlimento() {
		
		/**
		 * Necessário haver a comunicação entre a View
		 * e o Controller, além também da classe Dados que
		 * simula o banco de dados. O método iniciar()
		 * é para que a classe possa usar os dados
		 * pré-cadastrados no banco de dados
		 */
		controller = new CadastrarAlimentoController(this);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarAlimento.class.getResource("/view/images/favicon.png")));
		setTitle("Cadastro do alimento");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		nomeAlimentoLabel = new JLabel("Nome");
		nomeAlimentoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nomeAlimentoLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		nomeAlimentoLabel.setBounds(10, 71, 175, 14);
		contentPane.add(nomeAlimentoLabel);

		nomeAlimentoField = new JTextField();
		nomeAlimentoField.setBounds(195, 69, 175, 20);
		contentPane.add(nomeAlimentoField);
		nomeAlimentoField.setColumns(10);

		precoAlimentoLabel = new JLabel("Preco Alimento");
		precoAlimentoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		precoAlimentoLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		precoAlimentoLabel.setBounds(10, 112, 175, 14);
		contentPane.add(precoAlimentoLabel);

		descricaoAlimentoLabel = new JLabel("Descricao Alimento");
		descricaoAlimentoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		descricaoAlimentoLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		descricaoAlimentoLabel.setBounds(10, 154, 175, 14);
		contentPane.add(descricaoAlimentoLabel);

		confirmarAlimentoBtn = new JButton("Confirmar");
		confirmarAlimentoBtn.setFont(new Font("Open Sans", Font.PLAIN, 11));
		confirmarAlimentoBtn.addActionListener(this);
		confirmarAlimentoBtn.setBounds(36, 200, 102, 35);
		contentPane.add(confirmarAlimentoBtn);

		voltarAlimentoBtn = new JButton("Voltar");
		voltarAlimentoBtn.addActionListener(this);
		voltarAlimentoBtn.setFont(new Font("Open Sans", Font.PLAIN, 11));
		voltarAlimentoBtn.setBounds(289, 200, 102, 35);
		contentPane.add(voltarAlimentoBtn);

		precoAlimentoField = new JTextField();
		precoAlimentoField.setColumns(10);
		precoAlimentoField.setBounds(195, 110, 175, 20);
		contentPane.add(precoAlimentoField);

		descricaoAlimentoField = new JTextField();
		descricaoAlimentoField.setColumns(10);
		descricaoAlimentoField.setBounds(195, 152, 175, 20);
		contentPane.add(descricaoAlimentoField);

		escolhaComboBox = new JComboBox<>();
		escolhaComboBox.setBounds(70, 26, 102, 22);
		contentPane.add(escolhaComboBox);
		escolhaComboBox.addItem("Pipocas");
		escolhaComboBox.addItem("Bebibas");
		escolhaComboBox.addItem("Doces");
		escolhaComboBox.addItem("Combos");

		setLocationRelativeTo(null);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.controller.executarBotao(e);
	}

	public JTextField getNomeAlimentoField() {
		return nomeAlimentoField;
	}

	public JTextField getPrecoAlimentoField() {
		return precoAlimentoField;
	}

	public JTextField getDescricaoAlimentoField() {
		return descricaoAlimentoField;
	}

	public JButton getConfirmarAlimentoBtn() {
		return confirmarAlimentoBtn;
	}

	public JButton getVoltarAlimentoBtn() {
		return voltarAlimentoBtn;
	}

	public JComboBox getEscolhaComboBox() {
		return escolhaComboBox;
	}

    public void mostrarMensagemAfirmativa(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
    }	
}
