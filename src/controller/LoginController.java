package controller;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

import view.CadastrarCliente;
import view.Login;

public class LoginController {
    
    private final Login view;
    private CadastrarCliente client;

    public LoginController(Login view) {
        super();
        this.view = view;
        client = new CadastrarCliente();
    }

    public void executarBotao(ActionEvent e) {
        JButton botao = (JButton) e.getSource();

        if (botao == view.getLoginBtn()) {
            this.printOlaMundo();
        } else {
            new CadastrarCliente().setVisible(true);
            this.view.dispose();
        }
    }

    public void printOlaMundo() {
        System.out.println("EAEEEEEEE");
    }

    public void printEae() {
        System.out.println("EAE");
    }

    public Login getView() {
        return view;
    }
}
