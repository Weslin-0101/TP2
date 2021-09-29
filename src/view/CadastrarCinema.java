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

public class CadastrarCinema extends JFrame {

	private final JPanel contentPane;
	private final JLabel enderecoLabel;
	private final JLabel cepLabel;
	private final JLabel referenciaLabel;
	private final JTextField enderecoField;
	private final JTextField cepField;
	private final JTextField referenciaField;
	private final JTextField nomeCinemaField;
	private final JTextField numeroSalaField;
	private final JTextField capacidadeField;
	private final JTextField tecnologiaField;
	private final JTextField mapaSalaField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CadastrarCinema frame = new CadastrarCinema();
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
	public CadastrarCinema() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarCinema.class.getResource("/view/images/favicon.png")));
		this.setSize(525, 523);
		setResizable(false);
		setTitle("Cadastro do cinema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		enderecoLabel = new JLabel("Endereco");
		enderecoLabel.setBounds(10, 71, 168, 14);
		enderecoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		enderecoLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		contentPane.add(enderecoLabel);

		cepLabel = new JLabel("CEP");
		cepLabel.setBounds(20, 118, 158, 14);
		cepLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cepLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		contentPane.add(cepLabel);

		referenciaLabel = new JLabel("Ponto de referencia");
		referenciaLabel.setBounds(10, 164, 168, 14);
		referenciaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		referenciaLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		contentPane.add(referenciaLabel);

		enderecoField = new JTextField();
		enderecoField.setBounds(188, 69, 258, 20);
		contentPane.add(enderecoField);
		enderecoField.setColumns(10);

		cepField = new JTextField();
		cepField.setBounds(188, 116, 258, 20);
		contentPane.add(cepField);
		cepField.setColumns(10);

		referenciaField = new JTextField();
		referenciaField.setBounds(188, 162, 258, 20);
		contentPane.add(referenciaField);
		referenciaField.setColumns(10);

		JButton confirmaCinemaBtn = new JButton("Confirmar");
		confirmaCinemaBtn.setBounds(40, 410, 130, 35);
		confirmaCinemaBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(confirmaCinemaBtn);

		JButton voltarCinemaBtn = new JButton("Voltar");
		voltarCinemaBtn.setBounds(338, 410, 130, 35);
		contentPane.add(voltarCinemaBtn);

		JLabel nomeCinemaLabel = new JLabel("Nome");
		nomeCinemaLabel.setBounds(10, 26, 168, 14);
		nomeCinemaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nomeCinemaLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		contentPane.add(nomeCinemaLabel);

		nomeCinemaField = new JTextField();
		nomeCinemaField.setBounds(188, 24, 258, 20);
		contentPane.add(nomeCinemaField);
		nomeCinemaField.setColumns(10);

		JLabel numeroSalaLabel = new JLabel("Numero da sala");
		numeroSalaLabel.setBounds(10, 209, 168, 14);
		numeroSalaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		numeroSalaLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		contentPane.add(numeroSalaLabel);

		numeroSalaField = new JTextField();
		numeroSalaField.setBounds(188, 207, 258, 20);
		numeroSalaField.setColumns(10);
		contentPane.add(numeroSalaField);

		JLabel capacidadeLabel = new JLabel("Capacidade");
		capacidadeLabel.setBounds(10, 256, 168, 14);
		capacidadeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		capacidadeLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		contentPane.add(capacidadeLabel);

		capacidadeField = new JTextField();
		capacidadeField.setBounds(188, 254, 258, 20);
		capacidadeField.setColumns(10);
		contentPane.add(capacidadeField);

		JLabel tecnologiaLabel = new JLabel("Tecnologia");
		tecnologiaLabel.setBounds(10, 304, 168, 14);
		tecnologiaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tecnologiaLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		contentPane.add(tecnologiaLabel);

		tecnologiaField = new JTextField();
		tecnologiaField.setBounds(188, 302, 258, 20);
		tecnologiaField.setColumns(10);
		contentPane.add(tecnologiaField);

		JLabel mapaSalaLabel = new JLabel("Mapa da sala");
		mapaSalaLabel.setBounds(10, 351, 168, 14);
		mapaSalaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mapaSalaLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		contentPane.add(mapaSalaLabel);

		mapaSalaField = new JTextField();
		mapaSalaField.setBounds(188, 349, 258, 20);
		mapaSalaField.setColumns(10);
		contentPane.add(mapaSalaField);
	}

}
