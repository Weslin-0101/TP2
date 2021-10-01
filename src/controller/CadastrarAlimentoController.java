package controller;

import model.Alimento;
import model.Dados;
import view.CadastrarAlimento;
import view.Menu;

public class CadastrarAlimentoController {
    
    private final CadastrarAlimento view;

    public CadastrarAlimentoController(CadastrarAlimento view) {
        this.view = view;
    }

    public void cadastrarAlimento() {
        
        String nome = view.getNomeAlimentoField().getText();
        Double preco = Double.parseDouble(view.getPrecoAlimentoField().getText());
        String descricao = view.getDescricaoAlimentoField().getText();

        Dados.getAlimentos().add(new Alimento(nome, preco, descricao));
    }

    public void executarBotao(Object botao) {

        if (botao == view.getConfirmarAlimentoBtn()) {
            cadastrarAlimento();
            this.view.mostrarMensagemAfirmativa("O cadastro do alimento foi concluído!");
            this.view.dispose();
        } else {
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
