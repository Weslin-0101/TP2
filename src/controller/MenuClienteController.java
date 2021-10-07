package controller;

import java.awt.event.ActionEvent;
import view.Login;
import view.MenuCliente;
import view.MinhaConta;
import view.VisualizarFilmes;

/**
 * Classe controlada do Menu. Nela é quem realiza
 * os controles por dentro da view
 * 
 * @author Wesley Lira Carvalho
 */
public class MenuClienteController {
    
    private final MenuCliente view;

    /**
     * Responsável pela inicialização da view
     * 
     * @param view A tela de MenuCliente
     */
    public MenuClienteController(MenuCliente view) {
        super();
        this.view = view;
    }

    /**
     * Nessa classe, está armazenado cada momento em que pode ocorrer
     * do clique de um mouse sobre o Menu, botões e em seus items dentro
     * do MenuBar. Cada um leva a uma das outras telas restantes do programa,
     * e são eles:
     *      (1) -> botão Sair: sai da sua conta e te leva para a tela de Login.
     *      (2) -> botão Visualizar Filmes: te leva para a tela de
     * Visualizar Filmes, para que possa escolher qual deseja.
     *      (3) -> botão Minha Conta: te leva para a tela de 
     * Minha Conta, onde pode visualizar quais foram os dados digitados
     * em seu cadastro e onde também pode editar esses dados ou excluir.
     * 
     * @param e Implementa a ActionEvent para capturar o clique no botão
     */
    public void executarBotao(ActionEvent e) {
        Object botao = e.getSource();

        if (botao == view.getSairBtn()) {
            new Login().setVisible(true);
            this.view.dispose();
        } else if (botao == view.getVisualizarFilmesBtn()) {
            new VisualizarFilmes().setVisible(true);
            this.view.dispose();
        } else if (botao == view.getMinhaContaBtn()) {
            new MinhaConta().setVisible(true);
            this.view.dispose();
        }
    }
}
