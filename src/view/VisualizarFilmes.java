package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import controller.VisualizarFilmesController;
import model.Dados;

public class VisualizarFilmes extends JFrame implements ActionListener{

	private final JPanel contentPane;
	private final JComboBox<Object> selecionarFilmeComboBox;
	private final JComboBox ingressoComboBox;
	private final JComboBox salaComboBox;
	private final JComboBox sessaoComboBox;
	private final JTextArea areaText;
	private final JLabel ingressoLabel;
	private final JLabel salaLabel;
	private final JLabel sessaoLabel;
	private final JButton okBtn;
	private final JButton seguirAdianteBtn;
	private final JButton voltarBtn;
	private final VisualizarFilmesController controller;

	/**
	 * Create the frame.
	 */
	public VisualizarFilmes() {
		
		controller = new VisualizarFilmesController(this);
		Dados.iniciar();

		setIconImage(Toolkit.getDefaultToolkit().getImage(VisualizarFilmes.class.getResource("/view/images/favicon.png")));
		setTitle("Visualizar Filmes");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		selecionarFilmeComboBox = new JComboBox();
		selecionarFilmeComboBox.setBounds(64, 22, 390, 22);
		contentPane.add(selecionarFilmeComboBox);
		selecionarFilmeComboBox.addItem("Selecionar Filme");
		
		okBtn = new JButton("OK");
		okBtn.setBounds(465, 19, 59, 28);
		contentPane.add(okBtn);

		areaText = new JTextArea();
		areaText.setBounds(20, 58, 540, 199);
		contentPane.add(areaText);

		ingressoComboBox = new JComboBox();
		ingressoComboBox.setBounds(64, 299, 101, 28);
		contentPane.add(ingressoComboBox);
		ingressoComboBox.addItem("Selecione");
		ingressoComboBox.addItem("Meia");
		ingressoComboBox.addItem("Inteira");

		salaComboBox = new JComboBox();
		salaComboBox.setBounds(232, 299, 101, 28);
		contentPane.add(salaComboBox);
		salaComboBox.addItem("Selecione");

		sessaoComboBox = new JComboBox();
		sessaoComboBox.setBounds(409, 299, 101, 28);
		contentPane.add(sessaoComboBox);
		sessaoComboBox.setModel(controller.atualizarCaixaFilmes());
		sessaoComboBox.addItem("Selecione");

		ingressoLabel = new JLabel("Ingresso");
		ingressoLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
		ingressoLabel.setBounds(64, 278, 101, 22);
		contentPane.add(ingressoLabel);

		salaLabel = new JLabel("Sala");
		salaLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
		salaLabel.setBounds(232, 278, 101, 22);
		contentPane.add(salaLabel);

		sessaoLabel = new JLabel("Sessao");
		sessaoLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
		sessaoLabel.setBounds(409, 278, 101, 22);
		contentPane.add(sessaoLabel);

		seguirAdianteBtn = new JButton("Seguir Adiante");
		seguirAdianteBtn.setFont(new Font("Open Sans", Font.PLAIN, 13));
		seguirAdianteBtn.setBounds(54, 353, 124, 43);
		seguirAdianteBtn.addActionListener(this);
		contentPane.add(seguirAdianteBtn);

		voltarBtn = new JButton("Voltar");
		voltarBtn.setFont(new Font("Open Sans", Font.PLAIN, 13));
		voltarBtn.setBounds(400, 353, 124, 43);
		voltarBtn.addActionListener(this);
		contentPane.add(voltarBtn);

		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.controller.executarBotao(e);
		
	}

	public JComboBox<Object> getSelecionarFilmeComboBox() {
		return selecionarFilmeComboBox;
	}

	public JComboBox getIngressoComboBox() {
		return ingressoComboBox;
	}

	public JComboBox getSalaComboBox() {
		return salaComboBox;
	}

	public JComboBox getSessaoComboBox() {
		return sessaoComboBox;
	}

	public JTextArea getAreaText() {
		return areaText;
	}

	public JLabel getIngressoLabel() {
		return ingressoLabel;
	}

	public JLabel getSalaLabel() {
		return salaLabel;
	}

	public JLabel getSessaoLabel() {
		return sessaoLabel;
	}

	public JButton getOkBtn() {
		return okBtn;
	}

	public JButton getSeguirAdianteBtn() {
		return seguirAdianteBtn;
	}

	public JButton getVoltarBtn() {
		return voltarBtn;
	}
}
