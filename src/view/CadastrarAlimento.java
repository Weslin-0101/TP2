package view;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CadastrarAlimento extends JFrame {

	private JPanel contentPane;
	private JTextField nomeAlimentoField;
	private JTextField precoAlimentoField;
	private JTextField descricaoAlimentoField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CadastrarAlimento frame = new CadastrarAlimento();
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
	public CadastrarAlimento() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarAlimento.class.getResource("/view/images/favicon.png")));
		setTitle("Cadastro do alimento");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 290);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel nomeAlimentoLabel = new JLabel("Nome");
		nomeAlimentoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nomeAlimentoLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		nomeAlimentoLabel.setBounds(10, 71, 175, 14);
		contentPane.add(nomeAlimentoLabel);

		nomeAlimentoField = new JTextField();
		nomeAlimentoField.setBounds(195, 69, 175, 20);
		contentPane.add(nomeAlimentoField);
		nomeAlimentoField.setColumns(10);

		JLabel precoAlimentoLabel = new JLabel("Preco Alimento");
		precoAlimentoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		precoAlimentoLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		precoAlimentoLabel.setBounds(10, 112, 175, 14);
		contentPane.add(precoAlimentoLabel);

		JLabel descricaoAlimentoLabel = new JLabel("Descricao Alimento");
		descricaoAlimentoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		descricaoAlimentoLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		descricaoAlimentoLabel.setBounds(10, 154, 175, 14);
		contentPane.add(descricaoAlimentoLabel);

		JButton confirmarAlimentoBtn = new JButton("Confirmar");
		confirmarAlimentoBtn.setFont(new Font("Open Sans", Font.PLAIN, 11));
		confirmarAlimentoBtn.setBounds(36, 200, 102, 35);
		contentPane.add(confirmarAlimentoBtn);

		JButton voltarAlimentoBtn = new JButton("Voltar");
		voltarAlimentoBtn.setFont(new Font("Open Sans", Font.PLAIN, 11));
		voltarAlimentoBtn.setBounds(289, 200, 102, 35);
		contentPane.add(voltarAlimentoBtn);

		precoAlimentoField = new JTextField();
		precoAlimentoField.setColumns(10);
		precoAlimentoField.setBounds(195, 110, 175, 20);
		contentPane.add(precoAlimentoField);

		descricaoAlimentoField = new JTextField();
		descricaoAlimentoField.setColumns(10);
		descricaoAlimentoField.setBounds(195, 152, 175, 20);
		contentPane.add(descricaoAlimentoField);

		JComboBox escolhaComboBox = new JComboBox();
		escolhaComboBox.setBounds(70, 26, 102, 22);
		contentPane.add(escolhaComboBox);
		escolhaComboBox.addItem("Pipocas");
		escolhaComboBox.addItem("Bebibas");
		escolhaComboBox.addItem("Doces");
		escolhaComboBox.addItem("Combos");

	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
