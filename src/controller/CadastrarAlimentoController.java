package controller;

import view.CadastrarAlimento;
import view.Menu;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class CadastrarAlimentoController {
    
    private final CadastrarAlimento view;

    public CadastrarAlimentoController(CadastrarAlimento view) {
        this.view = view;
    }

    public void cadastrarAlimento() {
        
        String nome = view.getNomeAlimentoField().getText();
        String preco = view.getPrecoAlimentoField().getText();
        String descricao = view.getDescricaoAlimentoField().getText();

        // Dados.getAlimentos().add(new Alimento(nome, preco, descricao));
    }

    public void executarBotao(ActionEvent e) {
        Object botao = e.getSource();

        if (botao == view.getVoltarAlimentoBtn()) {
            this.view.dispose();
            new Menu().setVisible(true);
        }
    } 

    public void limparCampo() {
        view.getNomeAlimentoField().setText("");
        view.getPrecoAlimentoField().setText("");
        view.getDescricaoAlimentoField().setText("");
    }
}
