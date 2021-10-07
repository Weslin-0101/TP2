package view;

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

/**
 * Classe responsável para a visualização do Menu.
 * 
 * Esse mesma classe herda JFrame e implementa a interface ActionListener.
 * 
 * @author Cleber de Oliveira Brant.
 */
public class Menu extends JFrame implements ActionListener{

	private final JPanel contentPane;
	private final JMenuBar menuBar;
	private final JMenu cadastroMenu;
	private final JMenuItem cadastrarFilmesItemMenu;
	private final JMenuItem cadastrarCinemaItemMenu;
	private final JMenuItem cadastrarSessaoItemMenu;
	private final JMenuItem cadastrarAlimentosItemMenu;
	private final JButton visualizarFilmesBtn;
	private final JButton minhaContaBtn;
	private final JButton sairBtn;
	private final MenuController controller;

	/**
	 * Essa é a classe Menu
	 * ELa faz os chamados para cada uma das outras views que existem no programa.
	 * 
	 * Nela está presente os items dentro de um Menu menor, e também as telas restantes
	 * dentro de cada botão. Estão presentes:
	 * 		(1) -> MenuBar: no MenuBar mostra 4 items que se clicados
	 * te direciona para as suas telas de cadastro.
	 * 		(2) -> botão VisualizarFilme: direciona para a tela de Visualizar Filmes.
	 * 		(3) -> botão Minha Conta: direciona para a tela de Minha Conta.
	 * 		(4) -> botão Sair: retorna para a tela de Login.
	 * 
	 * @see CadastrarFilme
	 * @see CadastrarCinema
	 * @see CadastrarSessao
	 * @see CadastrarAlimento
	 * @see VisualizarFilmes
	 * @see MinhaConta
	 * @see Login
	 */ 
	public Menu() {
		
		controller = new MenuController(this);

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
		cadastrarCinemaItemMenu.addActionListener(this);
		cadastroMenu.add(cadastrarCinemaItemMenu);

		cadastrarSessaoItemMenu = new JMenuItem("Cadastrar Sessoes");
		cadastrarSessaoItemMenu.addActionListener(this);
		cadastroMenu.add(cadastrarSessaoItemMenu);

		cadastrarAlimentosItemMenu = new JMenuItem("Cadastrar Alimentos");
		cadastrarAlimentosItemMenu.addActionListener(this);
		cadastroMenu.add(cadastrarAlimentosItemMenu);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		visualizarFilmesBtn = new JButton("Visualizar filmes");
		visualizarFilmesBtn.setBounds(114, 38, 214, 49);
		visualizarFilmesBtn.setFont(new Font("Open Sans", Font.PLAIN, 14));
		visualizarFilmesBtn.addActionListener(this);
		contentPane.add(visualizarFilmesBtn);

		minhaContaBtn = new JButton("Minha conta");
		minhaContaBtn.setBounds(114, 115, 214, 49);
		minhaContaBtn.setFont(new Font("Open Sans", Font.PLAIN, 14));
		minhaContaBtn.addActionListener(this);
		contentPane.add(minhaContaBtn);

		sairBtn = new JButton("Sair");
		sairBtn.setBounds(114, 269, 214, 49);
		sairBtn.setFont(new Font("Open Sans", Font.PLAIN, 14));
		sairBtn.addActionListener(this);
		contentPane.add(sairBtn);

		setLocationRelativeTo(null);
	}
	
	/**
	 * Executa um comando quando um botão é clicado.
	 * 
	 * Implementação da interface ActionListener.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.controller.executarBotao(e);
	}

	@Override
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

	public JMenuItem getCadastrarSessaoItemMenu() {
		return cadastrarSessaoItemMenu;
	}

	public JMenuItem getCadastrarAlimentosItemMenu() {
		return cadastrarAlimentosItemMenu;
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
