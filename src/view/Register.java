package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class Register {
    
    private static JFrame janelaFrame = new JFrame("Cadastro");
    private static JLabel nameLabel = new JLabel("Nome");
    private static JLabel dataNascJLabel = new JLabel("Data");
    private static JLabel cpfJLabel = new JLabel("CPF");
    private static JLabel estadoJLabel = new JLabel("Estado");
    private static JLabel cidadeJLabel = new JLabel("Cidade");
    private static JLabel userLabel = new JLabel("Usuário");
    private static JLabel passworLabel = new JLabel("Senha");
    private static JTextField nameText = new JTextField(20);
    private static JTextField dataText = new JTextField(20);
    private static JTextField cpfText = new JTextField(20);
    private static JTextField cidadeText = new JTextField(20);
    private static JTextField estadoText = new JTextField(20);
    private static JTextField userText = new JTextField(20);
    private static JPasswordField passwordText = new JPasswordField(20);
    private static JButton confirmBtn = new JButton("Confirmar");


    public Register() {

        nameLabel.setBounds(10, 20, 80, 40);
        nameText.setBounds(50, 30, 150, 20);
        dataNascJLabel.setBounds(250, 20, 80, 40);
        dataText.setBounds(290, 32, 80, 20);
        passwordText.setBounds(60, 250, 160, 25);
        cpfJLabel.setBounds(10, 60, 80, 40);
        cpfText.setBounds(50, 70, 150, 20);
        estadoJLabel.setBounds(10, 120, 150, 20);
        estadoText.setBounds(50, 70, 60, 20);
        cidadeJLabel.setBounds(100, 70, 100, 20);

        
        janelaFrame.add(nameLabel);
        janelaFrame.add(nameText);
        janelaFrame.add(dataNascJLabel);
        janelaFrame.add(dataText);
        janelaFrame.add(cpfJLabel);
        janelaFrame.add(cpfText);
        janelaFrame.add(estadoJLabel);
        janelaFrame.add(estadoText);
        janelaFrame.add(cidadeJLabel);
        janelaFrame.add(cidadeText);


        janelaFrame.setLayout(null);

        janelaFrame.setSize(400, 400);
        janelaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaFrame.setVisible(true);
    }

    public static void main(String[] args) {
        
        Register register = new Register();
    }
}
