package controller;

import java.awt.event.ActionEvent;

import view.CadastrarAlimento;
import view.CadastrarCinema;
import view.CadastrarFilme;
import view.CadastrarSessao;
import view.Login;
import view.Menu;
import view.MinhaConta;
import view.VisualizarFilmes;

/**
 * Classe controlada do Menu. Nela é quem realiza
 * os controles por dentro da view
 */
public class MenuController {
    
    private final Menu view;

    public MenuController(Menu view) {
        super();
        this.view = view;
    }

    /**
     * Nessa classe, está armazenado cada momento em que pode ocorrer
     * do clique de um mouse sobre o Menu, botões e em seus items dentro
     * do MenuBar. Cada um leva a uma das outras telas restantes do programa
     * 
     * @param e da ActionEvent
     */
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
        } else if (botao == view.getMinhaContaBtn()) {
            new MinhaConta().setVisible(true);
            this.view.dispose();
        } else if (botao == view.getCadastrarSessaoItemMenu()) {
            new CadastrarSessao().setVisible(true);
            this.view.dispose();
        }
    }

    /**
     * Os métodos navegar são para os casos dos items que estão
     * dentro do MenuBar
     */
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
