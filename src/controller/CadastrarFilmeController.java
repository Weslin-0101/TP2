package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Dados;
import model.Filme;
import view.CadastrarFilme;
import view.Menu;

/**
 * Classe responsável pelo controle de toda a lógica por trás da classe
 * CadastrarFilme
 * 
 * @author Wesley Lira Carvalho
 */
public class CadastrarFilmeController {
    
    private final CadastrarFilme view;

    /**
     * Responsável para a inicialização da view
     * 
     * @param view A tela de CadastrarFilme
     */
    public CadastrarFilmeController(CadastrarFilme view) {
        this.view = view;
    }

    /**
     * Responsável para capturar os dados inseridos e armazenar eles
     * dentro de uma arraylist que foi instanciada na classe Dados, 
     * a mesma que simula o banco de dados
     */
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

    /**
     * Vai executar uma ação de acordo com qual botão foi clicado.
     * 
     * Os casos são os seguintes:
     *      (1) -> botão Confirmar: cadastrar os dados obtidos em uma arraylist
     * de filmes e depois mostra uma mensagem confirmando o cadastro. Em seguida, ele te
     * retorna para a tela de Menu
     * 
     *      (2) -> botão Voltar: Retornar para o Menu
     * 
     * @param e captura o evento do clique usando o ActionEvent
     */
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

    /**
     * A função desse método é capturar o modelo da tela de View
     * onde o usuário digitou os dados e clicou em Confirmar.
     * 
     * Ajuda para que possa aparecer uma JComboBox de outra
     * tela
     */
    public Filme pegarModelo() {

        String titulo = view.getTituloField().getText();
        String duracao = view.getDuracaoField().getText();
        String sinopse = view.getSinopseField().getText();
        String genero = view.getGeneroField().getText();
        String cartaz = view.getCartazField().getText();
        String atores = view.getAtoresField().getText();
        String diretor = view.getDiretorField().getText();

        return new Filme(titulo, duracao, sinopse, genero, cartaz, atores, diretor);
    }
}
