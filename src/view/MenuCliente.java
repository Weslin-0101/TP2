package view;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MenuClienteController;

public class MenuCliente extends JFrame implements ActionListener{

	private final JPanel contentPane;
	private final JButton visualizarFilmesBtn;
	private final JButton minhaContaBtn;
	private final JButton sairBtn;
	private final MenuClienteController controller;
	private static final String COLO_STRING = "Open Sans";


	/**
	 * Essa é a classe Menu
	 * ELa faz os chamados para cada uma das outras views que existem no programa.
	 * 
	 * Nela está presente os items dentro de um Menu menor, e também as telas restantes
	 * dentro de cada botão
	 */
	public MenuCliente() {
		
		controller = new MenuClienteController(this);

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/view/images/favicon.png")));
		setTitle("Cinema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 409);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		visualizarFilmesBtn = new JButton("Visualizar filmes");
		visualizarFilmesBtn.setBounds(114, 38, 214, 49);
		visualizarFilmesBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		visualizarFilmesBtn.addActionListener(this);
		contentPane.add(visualizarFilmesBtn);

		minhaContaBtn = new JButton("Minha conta");
		minhaContaBtn.setBounds(114, 115, 214, 49);
		minhaContaBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		minhaContaBtn.addActionListener(this);
		contentPane.add(minhaContaBtn);

		sairBtn = new JButton("Sair");
		sairBtn.setBounds(114, 269, 214, 49);
		sairBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		sairBtn.addActionListener(this);
		contentPane.add(sairBtn);

		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.controller.executarBotao(e);
	}

	@Override
	public JPanel getContentPane() {
		return contentPane;
	}

	public JButton getVisualizarFilmesBtn() {
		return visualizarFilmesBtn;
	}

	public JButton getMinhaContaBtn() {
		return minhaContaBtn;
	}

	public JButton getSairBtn() {
		return sairBtn;
	}

}
