package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MenuController;
import model.Dados;

public class Menu extends JFrame implements ActionListener{

	private final JPanel contentPane;
	private final JMenuBar menuBar;
	private final JMenu cadastroMenu;
	private final JMenuItem cadastrarFilmesItemMenu;
	private final JMenuItem cadastrarCinemaItemMenu;
	private final JMenuItem cadastrarIngressoItemMenu;
	private final JMenuItem cadastrarSessaoItemMenu;
	private final JMenuItem cadastrarAlimentosItemMenu;
	private final JButton vizualizarFilmesBtn;
	private final JButton minhaContaBtn;
	private final JButton opcao3Btn;
	private final JButton sairBtn;
	private final MenuController controller;

	/**
	 * Create the frame.
	 */
	public Menu() {
		
		controller = new MenuController(this);
		Dados.iniciar();

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/view/images/favicon.png")));
		setTitle("Cinema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 409);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		cadastroMenu = new JMenu("Cadastro");
		cadastroMenu.setFont(new Font("Open Sans", Font.PLAIN, 12));
		menuBar.add(cadastroMenu);

		cadastrarFilmesItemMenu = new JMenuItem("Cadastrar Filmes");
		cadastrarFilmesItemMenu.addActionListener(this);
		cadastroMenu.add(cadastrarFilmesItemMenu);

		cadastrarCinemaItemMenu = new JMenuItem("Cadastrar Cinema");
		cadastroMenu.add(cadastrarCinemaItemMenu);

		cadastrarIngressoItemMenu = new JMenuItem("Cadastrar Ingresso");
		cadastroMenu.add(cadastrarIngressoItemMenu);

		cadastrarSessaoItemMenu = new JMenuItem("Cadastrar Sessoes");
		cadastroMenu.add(cadastrarSessaoItemMenu);

		cadastrarAlimentosItemMenu = new JMenuItem("Cadastrar Alimentos");
		cadastroMenu.add(cadastrarAlimentosItemMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		vizualizarFilmesBtn = new JButton("Vizualizar filmes");
		vizualizarFilmesBtn.setBounds(114, 38, 214, 49);
		vizualizarFilmesBtn.setFont(new Font("Open Sans", Font.PLAIN, 14));
		contentPane.add(vizualizarFilmesBtn);

		minhaContaBtn = new JButton("Minha conta");
		minhaContaBtn.setBounds(114, 115, 214, 49);
		minhaContaBtn.setFont(new Font("Open Sans", Font.PLAIN, 14));
		contentPane.add(minhaContaBtn);

		opcao3Btn = new JButton("Opcao 3");
		opcao3Btn.setBounds(114, 194, 214, 49);
		opcao3Btn.setFont(new Font("Open Sans", Font.PLAIN, 14));
		contentPane.add(opcao3Btn);

		sairBtn = new JButton("Sair");
		sairBtn.setBounds(114, 269, 214, 49);
		sairBtn.setFont(new Font("Open Sans", Font.PLAIN, 14));
		sairBtn.addActionListener(this);
		contentPane.add(sairBtn);

		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.controller.executarBotao(e);
	}

	public JPanel getContentPane() {
		return contentPane;
	}


	public JMenu getCadastroMenu() {
		return cadastroMenu;
	}

	public JMenuItem getCadastrarFilmesItemMenu() {
		return cadastrarFilmesItemMenu;
	}

	public JMenuItem getCadastrarCinemaItemMenu() {
		return cadastrarCinemaItemMenu;
	}

	public JMenuItem getCadastrarIngressoItemMenu() {
		return cadastrarIngressoItemMenu;
	}

	public JMenuItem getCadastrarSessaoItemMenu() {
		return cadastrarSessaoItemMenu;
	}

	public JMenuItem getCadastrarAlimentosItemMenu() {
		return cadastrarAlimentosItemMenu;
	}

	public JButton getVizualizarFilmesBtn() {
		return vizualizarFilmesBtn;
	}

	public JButton getMinhaContaBtn() {
		return minhaContaBtn;
	}

	public JButton getOpcao3Btn() {
		return opcao3Btn;
	}

	public JButton getSairBtn() {
		return sairBtn;
	}

}
