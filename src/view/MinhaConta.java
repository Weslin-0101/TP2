package view;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import controller.MinhaContaController;
import model.Cliente;

/**
 * Classe responsável pela visualização da Minha Conta.
 * 
 * Essa mesma classe herda o JFrame e implementa a interface ActionListener.
 * 
 * @author Cleber de Oliveira Brant.
 */
public class MinhaConta extends JFrame implements ActionListener {

	private final JPanel contentPane;
	private final JTextArea informacoesTable;
	private final JComboBox<String> buscarClientesComboBox;
	private final JButton excluirBtn;
	private final JButton voltarBtn;
	private final JButton editarBtn;
	private final JButton mostrarDetalhes;
	private final MinhaContaController controller;
	private static final String COLO_STRING = "Open Sans";

	/**
	 * JPanel para a Minha Conta.
	 * 
	 * JPanel insere um JTextArea que mostra as informações do cliente que se
	 * logou.
	 * 
	 * Além disso, possui alguns botões com diferentes funções, são elas: (1)
	 * -> botão Mostrar Detalhes: mostra na JTextArea as informações de cadastro
	 * do Cliente logado. (2) -> botão Excluir: exclui a conta do Cliente logado.
	 * (3) -> botão Editar: edita as informações do cliente Logado. (4) -> botão
	 * Voltar: retorna para a tela de Menu.
	 * 
	 * @see Menu
	 */
	public MinhaConta() {

		Cliente cliente = new Cliente("", "", "", "", "");
		controller = new MinhaContaController(this);

		setIconImage(Toolkit.getDefaultToolkit().getImage(MinhaConta.class.getResource("/view/images/favicon.png")));
		setTitle("Minha Conta");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		informacoesTable = new JTextArea(cliente.toString());
		informacoesTable.setBounds(10, 11, 521, 204);
		informacoesTable.setEditable(false);
		contentPane.add(informacoesTable);

		mostrarDetalhes = new JButton("Mostrar Detalhes");
		mostrarDetalhes.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		mostrarDetalhes.addActionListener(this);
		mostrarDetalhes.setBounds(10, 226, 170, 23);
		contentPane.add(mostrarDetalhes);

		excluirBtn = new JButton("Excluir");
		excluirBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		excluirBtn.addActionListener(this);
		excluirBtn.setBounds(428, 226, 89, 23);
		contentPane.add(excluirBtn);

		voltarBtn = new JButton("Voltar");
		voltarBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		voltarBtn.addActionListener(this);
		voltarBtn.setBounds(48, 286, 102, 39);
		contentPane.add(voltarBtn);

		editarBtn = new JButton("Editar");
		editarBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		editarBtn.addActionListener(this);
		editarBtn.setBounds(393, 286, 102, 39);
		contentPane.add(editarBtn);

		buscarClientesComboBox = new JComboBox<>();
		buscarClientesComboBox.setBounds(219, 227, 170, 22);
		buscarClientesComboBox.setModel(controller.atualizarClientes());
		contentPane.add(buscarClientesComboBox);
		buscarClientesComboBox.addItem("Selecionar Clientes");

		setLocationRelativeTo(null);
	}

	/**
	 * Executa um comando quando um botão é clicado.
	 * 
	 * Implementa a interface da ActionListener.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		this.controller.executaBotao(e.getSource());
	}

	/**
	 * Retorna um JOptionPane informando que a conta foi excluída.
	 * 
	 * @param mensagem Mensagem que aparece dentro da JOptionPane.
	 */
	public void mostrarMensagemExcluido(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, null, JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Retorna um JPiotnPane informando que ocorreu algum erro.
	 * 
	 * @param mensagem Mensagem que aparece dentro da JOPtionPane.
	 */
	public void mostrarMensagemErro(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, null, JOptionPane.ERROR_MESSAGE);
	}

	public JTextArea getInformacoesTable() {
		return informacoesTable;
	}

	public JButton getExcluirBtn() {
		return excluirBtn;
	}

	public JButton getVoltarBtn() {
		return voltarBtn;
	}

	public JButton getEditarBtn() {
		return editarBtn;
	}

	public JButton getMostrarDetalhes() {
		return mostrarDetalhes;
	}

	public MinhaContaController getController() {
		return controller;
	}

	public JComboBox<String> getBuscarClientesComboBox() {
		return buscarClientesComboBox;
	}
}
