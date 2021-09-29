package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.CadastrarFilme;
import view.Login;
import view.Menu;

public class MenuController {
    
    private final Menu view;
    private Login login;

    public MenuController(Menu view) {
        super();
        this.view = view;
        login = new Login();
    }

    public void executarBotao(ActionEvent e) {
        Object botao = e.getSource();

        if (botao == view.getSairBtn()) {
            new Login().setVisible(true);
            this.view.dispose();
        } else if (botao == view.getCadastrarFilmesItemMenu()) {
            navegarCadastroFilmes();
        }
    }

    public void navegarCadastroFilmes() {

        CadastrarFilme cadastro = new CadastrarFilme();
        cadastro.setVisible(true);
        this.view.dispose();
    }
}
