package controller;

import java.awt.event.ActionEvent;

import view.CadastrarAlimento;
import view.CadastrarCinema;
import view.CadastrarFilme;
import view.Login;
import view.Menu;
import view.VisualizarFilmes;

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
        } else if (botao == view.getCadastrarCinemaItemMenu()) {
            navegarCadastroCinema();
        } else if (botao == view.getCadastrarAlimentosItemMenu()) {
            navegarCadastroAlimento();
        } else if (botao == view.getVisualizarFilmesBtn()) {
            new VisualizarFilmes().setVisible(true);
            this.view.dispose();
        }
    }

    public void navegarCadastroFilmes() {

        CadastrarFilme cadastro = new CadastrarFilme();
        cadastro.setVisible(true);
        this.view.dispose();
    }

    public void navegarCadastroCinema() {

        CadastrarCinema cadastro = new CadastrarCinema();
        cadastro.setVisible(true);
        this.view.dispose();
    }

    public void navegarCadastroAlimento() {

        CadastrarAlimento cadastro = new CadastrarAlimento();
        cadastro.setVisible(true);
        this.view.dispose();
    }
}
