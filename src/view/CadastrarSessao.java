package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CadastrarSessao extends JFrame {

	private JPanel salaSessaoField;
	private JTextField dataSessaoField;
	private JTextField horarioSessaoField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CadastrarSessao frame = new CadastrarSessao();
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
	public CadastrarSessao() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarSessao.class.getResource("/view/images/favicon.png")));
		setTitle("Cadastrar Sess\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 262);
		salaSessaoField = new JPanel();
		salaSessaoField.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(salaSessaoField);
		salaSessaoField.setLayout(null);

		JLabel dataSessaoLabel = new JLabel("Data das sessoes");
		dataSessaoLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		dataSessaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dataSessaoLabel.setBounds(10, 32, 166, 14);
		salaSessaoField.add(dataSessaoLabel);

		JLabel horarioSessaoLabel = new JLabel("Horario");
		horarioSessaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		horarioSessaoLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		horarioSessaoLabel.setBounds(10, 74, 166, 14);
		salaSessaoField.add(horarioSessaoLabel);

		JLabel salaSessaoLabel = new JLabel("Sala");
		salaSessaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		salaSessaoLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		salaSessaoLabel.setBounds(10, 118, 166, 14);
		salaSessaoField.add(salaSessaoLabel);

		dataSessaoField = new JTextField();
		dataSessaoField.setBounds(196, 30, 127, 20);
		salaSessaoField.add(dataSessaoField);
		dataSessaoField.setColumns(10);

		horarioSessaoField = new JTextField();
		horarioSessaoField.setBounds(196, 72, 127, 20);
		salaSessaoField.add(horarioSessaoField);
		horarioSessaoField.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(196, 116, 127, 20);
		salaSessaoField.add(textField_2);
		textField_2.setColumns(10);

		JButton confirmarSessaoBtn = new JButton("Confirmar");
		confirmarSessaoBtn.setFont(new Font("Open Sans", Font.PLAIN, 14));
		confirmarSessaoBtn.setBounds(24, 165, 127, 34);
		salaSessaoField.add(confirmarSessaoBtn);

		JButton voltarSessaoBtn = new JButton("Voltar");
		voltarSessaoBtn.setFont(new Font("Open Sans", Font.PLAIN, 14));
		voltarSessaoBtn.setBounds(228, 165, 127, 34);
		salaSessaoField.add(voltarSessaoBtn);
	}

}
