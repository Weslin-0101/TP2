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

/**
 * Classe da view responsável visualizar o Menu para o usuário
 * que se logou como Cliente
 * 
 * Essa mesma classe herda JFrame e implementa a interface ActionListener
 * 
 * @author Wesley Lira Carvalho
 */
public class MenuCliente extends JFrame implements ActionListener{

	private final JPanel contentPane;
	private final JButton visualizarFilmesBtn;
	private final JButton minhaContaBtn;
	private final JButton sairBtn;
	private final MenuClienteController controller;
	private static final String COLO_STRING = "Open Sans";


	/**
	 * JPanel para a visualização do Menu
	 * 
	 * JPanel cria 3 tipos de botões dos quais possuem diferentes
	 * funções, são eles:
	 * 		(1) -> Visualizar Filmes: O botão gera um evento que te direciona
	 * 		para o JPanel de VisualizarFilmes, onde pode escolher qual filme deseja
	 * 		e qual ingresso, horário e sessão.
	 * 		(2) -> Minha Conta: O botão gera um evento que te direciona para
	 * 		a tela de Minha Conta, onde pode ver os dados que você cadastrou da sua conta
	 * 		e ainda poder editar e excluir a conta.
	 * 		(3) -> Sair: O botão gera um evento que te redireciona de volta para
	 * 		a tela de Login
	 * 
	 * @see VisualizarFilmes
	 * @see MinhaConta
	 * @see Login
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

	/**
	 * Executa o comando quando o botão é clicado
	 * 
	 * Implementa a interface ActionListener
	 */
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
