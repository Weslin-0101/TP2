package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Dados;
import model.Filme;
import view.CadastrarFilme;
import view.Menu;

public class CadastrarFilmeController {
    
    private final CadastrarFilme view;

    public CadastrarFilmeController(CadastrarFilme view) {
        this.view = view;
    }

    public void cadastrarFilme() {

        String titulo = view.getTituloField().getText();
        String duracao = view.getDuracaoField().getText();
        String sinopse = view.getSinopseField().getText();
        String genero = view.getGeneroField().getText();
        String cartaz = view.getCartazField().getText();
        String atores = view.getAtoresField().getText();
        String diretor = view.getDiretorField().getText();

        Dados.getFilmes().add(new Filme(titulo, duracao, sinopse, genero, cartaz, atores, diretor));
    }

    public void executarBotao(ActionEvent e) {
        JButton botao = (JButton) e.getSource();

        if (botao == view.getConfirmarFilmeBtn()) {
            cadastrarFilme();
            this.view.mostrarMensagemCadastro("Cadastro finalizado com sucesso!");
            this.view.dispose();
            new Menu().setVisible(true);
        } else {
            this.view.dispose();
            new Menu().setVisible(true);
        }
    }
}
