package view;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class CadastrarCliente extends JFrame implements ActionListener{
    
    private final JLabel nameJLabel;


    public CadastrarCliente() {

        this.setSize(450, 350);
        setLayout(null);
        setResizable(false);
        setTitle("Cadastro de Clientes");

        nameJLabel = new JLabel("Nome");
        nameJLabel.setBounds(10, 10, 20, 40);
        add(nameJLabel);



        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    

}
