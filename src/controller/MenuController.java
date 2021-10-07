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
 * 
 * @author Cleber de Oliveira Brant e Wesley Lira Carvalho
 */
public class MenuController {
    
    private final Menu view;

    /**
     * Responsável pela inicialização da View.
     * 
     * @param view A tela de Menu.
     */
    public MenuController(Menu view) {
        super();
        this.view = view;
    }

    /**
     * Nessa classe, está armazenado cada momento em que pode ocorrer
     * do clique de um mouse sobre o Menu, botões e em seus items dentro
     * do MenuBar. Cada um leva a uma das outras telas restantes do programa,
     * são elas:
     *      (1) -> botão Sair: retorna para a tela de Login.
     *      (2) -> Item CadastrarFilmeMenu: te leva para a tela de 
     * cadastrarFilmes.
     *      (3) -> Item CadastrarCinemaMenu: te leva para a tela de
     * cadastrarCinema.
     *      (4) -> Item CadastrarAlimentosMenu: te leva para a tela de
     * cadastrarAlimentos.
     *      (5) -> botão VisualizarFilmes: te encaminha para a tela
     * de Visualizar Filmes.
     *      (6) => botão Minha Conta: te encaminha para a tela de
     * Minha Conta, onde pode editar, excluir ou ver os detalhes
     * da sua conta cadastrada.
     *      (7) -> Item CadastrarSessaoMenu: te leva para a tela de
     * cadastrarSessao.
     * 
     * @see Login
     * @see CadastrarFilme
     * @see CadastrarCinema
     * @see CadastrarAlimento
     * @see CadastrarSessao
     * @see VisualizarFilmes
     * @see MinhaConta
     * 
     * @param e Implementa o ActionEvent para capturar o evento
     * do clique do mouse.
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
     * Os métodos navegarCadastroFilmes nos leva exatamente
     * para a tela de cadastro de Filmes
     */
    public void navegarCadastroFilmes() {

        CadastrarFilme cadastro = new CadastrarFilme();
        cadastro.setVisible(true);
        this.view.dispose();
    }

    /**
     * Tem a função de nos levar para a view do cadastro de 
     * cinema
     */
    public void navegarCadastroCinema() {

        CadastrarCinema cadastro = new CadastrarCinema();
        cadastro.setVisible(true);
        this.view.dispose();
    }

    /**
     * Tem a função de nos levar para a view do cadastro de
     * alimento
     */
    public void navegarCadastroAlimento() {

        CadastrarAlimento cadastro = new CadastrarAlimento();
        cadastro.setVisible(true);
        this.view.dispose();
    }
}
