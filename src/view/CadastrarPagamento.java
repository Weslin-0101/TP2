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
import javax.swing.border.EtchedBorder;

import controller.PagamentoController;

/**
 * Classe responsável pela visualização do cadastro de pagamento.
 * 
 * Essa mesma classe herda JFrame e implementa a interface ActionListener.
 * 
 * @author Cleber de Oliveira Brant.
 */
public class CadastrarPagamento extends JFrame implements ActionListener{

	private final JPanel contentPane;
	private final JComboBox<String> clientesComboBox;
	private final JLabel cartaoDeCreditoLabel;
	private final JLabel numeroDoCartaoLabel;
	private final JLabel dataLabel;
	private final JLabel nomeDoCartaoLabel;
	private final JLabel codigoDeSegurancaLabel;
	private final JLabel cpfCartaoLabel;
	private final JLabel pixLabel;
	private final JLabel cpfPixLabel;
	private final JLabel emailPixLabel;
	private final JLabel formaDePagamaLabel;
	private final JLabel bordaCartaoDeCredito;
	private final JLabel bordaPixLabel;
	private final JButton adicionarCartaoBtn;
	private final JButton adicionarPixBtn;
	private final JButton confirmarBtn;
	private final JTextField numeroDoCartaoField;
	private final JTextField dataField;
	private final JTextField nomeDoCartaoField;
	private final JTextField codigoDeSegurancaField;
	private final JTextField cpfCartaoField;
	private final JTextField cpfPixField;
	private final JTextField emailPixField;
	private final PagamentoController controller;
	private static final String COLO_STRING = "Open Sans";


	/**
	 * Tela responsável para o cadastro de pagamento.
	 * 
	 * JPanel adiciona um comboBox com a lista de cliente cadastrados
	 * atualizada para que possa selecionar para dizer qual cliente está
	 * adicionando o seu método de pagamento.
	 * 
	 * JPanel também cria diversos JLabels para inserir os dados e cadastrar
	 * o Pagamento. Além disso, também apresenta três botões, são eles:
	 * 		(1) -> botão AdicionarCartão: adiciona os dados inseridos dentro
	 * da arrayList e retorna uma mensagem confirmando o cadastro.
	 * 		(2) -> botão AdicionarPix: adiciona os dados inseridos dentro
	 * da arrayList e retorna uma mensagem confirmando o cadastro.
	 * 		(3) -> botão Confirmar: retorna uma mensagem confirmando o cadastro
	 * e a compra do Ingresso.
	 * 
	 * @see Menu
	 */
	public CadastrarPagamento() {
		
		controller = new PagamentoController(this);

		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarPagamento.class.getResource("/view/images/favicon.png")));
		setResizable(false);
		setTitle("Pagamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		clientesComboBox = new JComboBox<>();
		clientesComboBox.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		clientesComboBox.setBounds(34, 24, 415, 27);
		clientesComboBox.setModel(controller.atualizarClientes());
		contentPane.add(clientesComboBox);
		clientesComboBox.addItem("Clientes");

		cartaoDeCreditoLabel = new JLabel("Cartao de Credito");
		cartaoDeCreditoLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 16));
		cartaoDeCreditoLabel.setBounds(10, 111, 151, 21);
		contentPane.add(cartaoDeCreditoLabel);

		numeroDoCartaoField = new JTextField();
		numeroDoCartaoField.setBounds(20, 168, 168, 21);
		contentPane.add(numeroDoCartaoField);
		numeroDoCartaoField.setColumns(10);

		numeroDoCartaoLabel = new JLabel("Numero do Cartao");
		numeroDoCartaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		numeroDoCartaoLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		numeroDoCartaoLabel.setBounds(20, 152, 168, 14);
		contentPane.add(numeroDoCartaoLabel);

		dataField = new JTextField();
		dataField.setColumns(10);
		dataField.setBounds(301, 168, 168, 21);
		contentPane.add(dataField);

		dataLabel = new JLabel("Validade");
		dataLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dataLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		dataLabel.setBounds(301, 152, 168, 14);
		contentPane.add(dataLabel);

		nomeDoCartaoField = new JTextField();
		nomeDoCartaoField.setColumns(10);
		nomeDoCartaoField.setBounds(20, 221, 168, 21);
		contentPane.add(nomeDoCartaoField);

		nomeDoCartaoLabel = new JLabel("Nome impresso ");
		nomeDoCartaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nomeDoCartaoLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		nomeDoCartaoLabel.setBounds(20, 205, 168, 14);
		contentPane.add(nomeDoCartaoLabel);

		codigoDeSegurancaField = new JTextField();
		codigoDeSegurancaField.setColumns(10);
		codigoDeSegurancaField.setBounds(301, 221, 168, 21);
		contentPane.add(codigoDeSegurancaField);

		codigoDeSegurancaLabel = new JLabel("Codigo de seguranca");
		codigoDeSegurancaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		codigoDeSegurancaLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		codigoDeSegurancaLabel.setBounds(301, 205, 168, 14);
		contentPane.add(codigoDeSegurancaLabel);

		cpfCartaoField = new JTextField();
		cpfCartaoField.setColumns(10);
		cpfCartaoField.setBounds(20, 274, 168, 21);
		contentPane.add(cpfCartaoField);

		cpfCartaoLabel = new JLabel("CPF");
		cpfCartaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cpfCartaoLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		cpfCartaoLabel.setBounds(20, 260, 168, 14);
		contentPane.add(cpfCartaoLabel);

		pixLabel = new JLabel("Pix");
		pixLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 16));
		pixLabel.setBounds(10, 332, 151, 21);
		contentPane.add(pixLabel);

		cpfPixField = new JTextField();
		cpfPixField.setColumns(10);
		cpfPixField.setBounds(20, 392, 168, 21);
		contentPane.add(cpfPixField);

		cpfPixLabel = new JLabel("CPF");
		cpfPixLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cpfPixLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		cpfPixLabel.setBounds(20, 377, 168, 14);
		contentPane.add(cpfPixLabel);

		emailPixField = new JTextField();
		emailPixField.setColumns(10);
		emailPixField.setBounds(301, 392, 168, 21);
		contentPane.add(emailPixField);

		emailPixLabel = new JLabel("Email");
		emailPixLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailPixLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		emailPixLabel.setBounds(301, 377, 168, 14);
		contentPane.add(emailPixLabel);

		adicionarCartaoBtn = new JButton("Adicionar");
		adicionarCartaoBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		adicionarCartaoBtn.setBounds(379, 314, 105, 23);
		adicionarCartaoBtn.addActionListener(this);
		contentPane.add(adicionarCartaoBtn);

		adicionarPixBtn = new JButton("Adicionar");
		adicionarPixBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		adicionarPixBtn.setBounds(379, 464, 105, 23);
		adicionarPixBtn.addActionListener(this);
		contentPane.add(adicionarPixBtn);

		confirmarBtn = new JButton("Confirmar");
		confirmarBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		confirmarBtn.setBounds(198, 487, 105, 38);
		confirmarBtn.addActionListener(this);
		contentPane.add(confirmarBtn);

		formaDePagamaLabel = new JLabel("Selecione uma forma de pagamento");
		formaDePagamaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		formaDePagamaLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		formaDePagamaLabel.setBounds(10, 62, 459, 14);
		contentPane.add(formaDePagamaLabel);

		bordaCartaoDeCredito = new JLabel("");
		bordaCartaoDeCredito.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		bordaCartaoDeCredito.setBounds(10, 143, 474, 160);
		contentPane.add(bordaCartaoDeCredito);

		bordaPixLabel = new JLabel("");
		bordaPixLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		bordaPixLabel.setBounds(10, 365, 474, 89);
		contentPane.add(bordaPixLabel);

		setLocationRelativeTo(null);
	}

	/**
	 * Retorna um JOptionPane para quando for adicionado algum Pagamento.
	 * 
	 * @param mensagem Mensagem confirmando que o método de pagamento
	 * foi adicionado.
	 */
	public void mostrarMensagemPagamento(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, null, JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Retorna um JOptionPane para quando confirmar a compra do Ingresso.
	 * 
	 * @param mensagem Mensagem confirmando a compra do Ingresso.
	 */
	public void mostrarMensagemConfirmacao(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, null, JOptionPane.INFORMATION_MESSAGE);
	}

	public JComboBox<String> getClientesComboBox() {
		return clientesComboBox;
	}

	public JLabel getCartaoDeCreditoLabel() {
		return cartaoDeCreditoLabel;
	}

	public JLabel getNumeroDoCartaoLabel() {
		return numeroDoCartaoLabel;
	}

	public JLabel getDataLabel() {
		return dataLabel;
	}

	public JLabel getNomeDoCartaoLabel() {
		return nomeDoCartaoLabel;
	}

	public JLabel getCodigoDeSegurancaLabel() {
		return codigoDeSegurancaLabel;
	}

	public JLabel getCpfCartaoLabel() {
		return cpfCartaoLabel;
	}

	public JLabel getPixLabel() {
		return pixLabel;
	}

	public JLabel getCpfPixLabel() {
		return cpfPixLabel;
	}

	public JLabel getEmailPixLabel() {
		return emailPixLabel;
	}

	public JLabel getFormaDePagamaLabel() {
		return formaDePagamaLabel;
	}

	public JLabel getBordaCartaoDeCredito() {
		return bordaCartaoDeCredito;
	}

	public JLabel getBordaPixLabel() {
		return bordaPixLabel;
	}

	public JButton getAdicionarCartaoBtn() {
		return adicionarCartaoBtn;
	}

	public JButton getAdicionarPixBtn() {
		return adicionarPixBtn;
	}

	public JButton getConfirmarBtn() {
		return confirmarBtn;
	}

	public JTextField getNumeroDoCartaoField() {
		return numeroDoCartaoField;
	}

	public JTextField getDataField() {
		return dataField;
	}

	public JTextField getNomeDoCartaoField() {
		return nomeDoCartaoField;
	}

	public JTextField getCodigoDeSegurancaField() {
		return codigoDeSegurancaField;
	}

	public JTextField getCpfCartaoField() {
		return cpfCartaoField;
	}

	public JTextField getCpfPixField() {
		return cpfPixField;
	}

	public JTextField getEmailPixField() {
		return emailPixField;
	}

	/**
	 * Executa um comando de acordo com qual botão foi clicado.
	 * 
	 * Implementa a interface ActionListener.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.controller.executarBotao(e.getSource());
	}
}
