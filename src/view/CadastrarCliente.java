package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CadastrarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField dateField;
	private JTextField cpfField;
	private JTextField emailField;
	private JTextField senhaField;

	/**
	 * Create the frame.
	 */
	public CadastrarCliente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarCliente.class.getResource("/view/images/favicon.png")));

		setResizable(false);

		setTitle("Cadastrar");
		this.setSize(425, 340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel nameLabel = new JLabel("Nome");
		nameLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setBounds(30, 11, 152, 35);
		contentPane.add(nameLabel);

		JLabel dateLabel = new JLabel("Data de nascimento");
		dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dateLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		dateLabel.setBounds(30, 57, 152, 35);
		contentPane.add(dateLabel);

		JLabel cpfLabel = new JLabel("CPF");
		cpfLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cpfLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		cpfLabel.setBounds(30, 103, 152, 35);
		contentPane.add(cpfLabel);

		JLabel emailLabel = new JLabel("Email");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		emailLabel.setBounds(33, 149, 152, 35);
		contentPane.add(emailLabel);

		JLabel senhaLabel = new JLabel("Senha");
		senhaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		senhaLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		senhaLabel.setBounds(33, 198, 152, 35);
		contentPane.add(senhaLabel);

		nameField = new JTextField();
		nameField.setBounds(215, 16, 157, 27);
		contentPane.add(nameField);
		nameField.setColumns(10);

		dateField = new JTextField();
		dateField.setColumns(10);
		dateField.setBounds(215, 62, 157, 27);
		contentPane.add(dateField);

		cpfField = new JTextField();
		cpfField.setColumns(10);
		cpfField.setBounds(215, 108, 157, 27);
		contentPane.add(cpfField);

		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(215, 152, 157, 27);
		contentPane.add(emailField);

		senhaField = new JTextField();
		senhaField.setColumns(10);
		senhaField.setBounds(215, 198, 157, 27);
		contentPane.add(senhaField);

		JButton confirmarBtn = new JButton("Confirmar");
		confirmarBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		confirmarBtn.setBounds(61, 244, 109, 41);
		contentPane.add(confirmarBtn);

		JButton voltarBtn = new JButton("Voltar");
		voltarBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		voltarBtn.setBounds(247, 244, 109, 41);
		contentPane.add(voltarBtn);
	}
}
