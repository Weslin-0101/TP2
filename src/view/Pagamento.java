package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class Pagamento extends JFrame {

	private JPanel contentPane;
	private JTextField numeroDoCartaoField;
	private JTextField dataField;
	private JTextField nomeDoCartaoField;
	private JTextField codigoDeSegurancaField;
	private JTextField cpfCartaoField;
	private JTextField cpfPixField;
	private JTextField emailPixField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Pagamento frame = new Pagamento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pagamento() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pagamento.class.getResource("/view/images/favicon.png")));
		setResizable(false);
		setTitle("Pagamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox clientesComboBox = new JComboBox();
		clientesComboBox.setFont(new Font("Open Sans", Font.PLAIN, 13));
		clientesComboBox.setBounds(34, 24, 415, 27);
		contentPane.add(clientesComboBox);
		clientesComboBox.addItem("Clientes");

		JLabel cartaoDeCreditoLabel = new JLabel("Cartao de Credito");
		cartaoDeCreditoLabel.setFont(new Font("Open Sans", Font.PLAIN, 16));
		cartaoDeCreditoLabel.setBounds(10, 111, 151, 21);
		contentPane.add(cartaoDeCreditoLabel);

		numeroDoCartaoField = new JTextField();
		numeroDoCartaoField.setBounds(20, 168, 168, 21);
		contentPane.add(numeroDoCartaoField);
		numeroDoCartaoField.setColumns(10);

		JLabel numeroDoCartaoLabel = new JLabel("Numero do Cartao");
		numeroDoCartaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		numeroDoCartaoLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
		numeroDoCartaoLabel.setBounds(20, 152, 168, 14);
		contentPane.add(numeroDoCartaoLabel);

		dataField = new JTextField();
		dataField.setColumns(10);
		dataField.setBounds(301, 168, 168, 21);
		contentPane.add(dataField);

		JLabel dataLabel = new JLabel("Validade");
		dataLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dataLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
		dataLabel.setBounds(301, 152, 168, 14);
		contentPane.add(dataLabel);

		nomeDoCartaoField = new JTextField();
		nomeDoCartaoField.setColumns(10);
		nomeDoCartaoField.setBounds(20, 221, 168, 21);
		contentPane.add(nomeDoCartaoField);

		JLabel nomeDoCartaoLabel = new JLabel("Nome impresso ");
		nomeDoCartaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nomeDoCartaoLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
		nomeDoCartaoLabel.setBounds(20, 205, 168, 14);
		contentPane.add(nomeDoCartaoLabel);

		codigoDeSegurancaField = new JTextField();
		codigoDeSegurancaField.setColumns(10);
		codigoDeSegurancaField.setBounds(301, 221, 168, 21);
		contentPane.add(codigoDeSegurancaField);

		JLabel codigoDeSegurancaLabel = new JLabel("Codigo de seguranca");
		codigoDeSegurancaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		codigoDeSegurancaLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
		codigoDeSegurancaLabel.setBounds(301, 205, 168, 14);
		contentPane.add(codigoDeSegurancaLabel);

		cpfCartaoField = new JTextField();
		cpfCartaoField.setColumns(10);
		cpfCartaoField.setBounds(20, 274, 168, 21);
		contentPane.add(cpfCartaoField);

		JLabel cpfCartaoLabel = new JLabel("CPF");
		cpfCartaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cpfCartaoLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
		cpfCartaoLabel.setBounds(20, 260, 168, 14);
		contentPane.add(cpfCartaoLabel);

		JLabel pixLabel = new JLabel("Pix");
		pixLabel.setFont(new Font("Open Sans", Font.PLAIN, 16));
		pixLabel.setBounds(10, 332, 151, 21);
		contentPane.add(pixLabel);

		cpfPixField = new JTextField();
		cpfPixField.setColumns(10);
		cpfPixField.setBounds(20, 392, 168, 21);
		contentPane.add(cpfPixField);

		JLabel cpfPixLabel = new JLabel("CPF");
		cpfPixLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cpfPixLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
		cpfPixLabel.setBounds(20, 377, 168, 14);
		contentPane.add(cpfPixLabel);

		emailPixField = new JTextField();
		emailPixField.setColumns(10);
		emailPixField.setBounds(301, 392, 168, 21);
		contentPane.add(emailPixField);

		JLabel emailPixLabel = new JLabel("Email");
		emailPixLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailPixLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
		emailPixLabel.setBounds(301, 377, 168, 14);
		contentPane.add(emailPixLabel);

		JButton adicionarCartaoBtn = new JButton("Adicionar");
		adicionarCartaoBtn.setFont(new Font("Open Sans", Font.PLAIN, 13));
		adicionarCartaoBtn.setBounds(379, 314, 105, 23);
		contentPane.add(adicionarCartaoBtn);

		JButton adicionarPixBtn = new JButton("Adicionar");
		adicionarPixBtn.setFont(new Font("Open Sans", Font.PLAIN, 13));
		adicionarPixBtn.setBounds(379, 464, 105, 23);
		contentPane.add(adicionarPixBtn);

		JButton confirmarBtn = new JButton("Confirmar");
		confirmarBtn.setFont(new Font("Open Sans", Font.PLAIN, 14));
		confirmarBtn.setBounds(198, 487, 105, 38);
		contentPane.add(confirmarBtn);

		JLabel formaDePagamaLabel = new JLabel("Selecione uma forma de pagamento");
		formaDePagamaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		formaDePagamaLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		formaDePagamaLabel.setBounds(10, 62, 459, 14);
		contentPane.add(formaDePagamaLabel);

		JLabel bordaCartaoDeCredito = new JLabel("");
		bordaCartaoDeCredito.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		bordaCartaoDeCredito.setBounds(10, 143, 474, 160);
		contentPane.add(bordaCartaoDeCredito);

		JLabel bordaPixLabel = new JLabel("");
		bordaPixLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		bordaPixLabel.setBounds(10, 365, 474, 89);
		contentPane.add(bordaPixLabel);
	}

}
