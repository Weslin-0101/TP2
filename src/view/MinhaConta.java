package view;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.MinhaContaController;
import model.Dados;

public class MinhaConta extends JFrame implements ActionListener{

	private final JPanel contentPane;
	private final JTable informacoesTable;
	private final JButton excluirBtn;
	private final JButton voltarBtn;
	private final JButton editarBtn;
	private final MinhaContaController controller;

	/**
	 * Create the frame.
	 */
	public MinhaConta() {
		
		controller = new MinhaContaController(this);
		Dados.iniciar();

		setIconImage(Toolkit.getDefaultToolkit().getImage(MinhaConta.class.getResource("/view/images/favicon.png")));
		setTitle("Minha Conta");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		informacoesTable = new JTable();
		informacoesTable.setBounds(10, 11, 521, 204);
		contentPane.add(informacoesTable);

		excluirBtn = new JButton("Excluir");
		excluirBtn.setFont(new Font("Open Sans", Font.PLAIN, 13));
		excluirBtn.addActionListener(this);
		excluirBtn.setBounds(428, 226, 89, 23);
		contentPane.add(excluirBtn);

		voltarBtn = new JButton("Voltar");
		voltarBtn.setFont(new Font("Open Sans", Font.PLAIN, 14));
		voltarBtn.addActionListener(this);
		voltarBtn.setBounds(48, 286, 102, 39);
		contentPane.add(voltarBtn);

		editarBtn = new JButton("Editar");
		editarBtn.setFont(new Font("Open Sans", Font.PLAIN, 14));
		editarBtn.addActionListener(this);
		editarBtn.setBounds(393, 286, 102, 39);
		contentPane.add(editarBtn);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

	public JTable getInformacoesTable() {
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

}
